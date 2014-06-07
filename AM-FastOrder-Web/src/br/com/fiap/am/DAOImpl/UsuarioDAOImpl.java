package br.com.fiap.am.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.fiap.am.DAO.UsuarioDAO;
import br.com.fiap.am.entity.Usuario;

public class UsuarioDAOImpl extends DAOImpl<Usuario, Integer> implements UsuarioDAO{

	public UsuarioDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public long fazerLogin(String usuario, String senha) {
		long resultado = 0;
		try{
			Query query = em.createQuery("Select u.codigo From Usuario u where u.login = :usuario and u.senha = :senha");
			query.setParameter("usuario", usuario);
			query.setParameter("senha", senha);
			resultado =  (Long) query.getSingleResult();
			if(resultado > 0){
				return resultado;
			}
		}catch(NoResultException e){
				return resultado = 0;
		}
		return resultado;
	}
	
	

}
