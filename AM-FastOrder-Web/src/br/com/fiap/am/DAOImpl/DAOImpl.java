package br.com.fiap.am.DAOImpl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.DAO;

public class DAOImpl<T,K> implements DAO<T, K>{
	
	EntityManager em;
	
	private Class<T> classe;
	
	public DAOImpl(EntityManager em){
		this.em = em;
		this.classe = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public void inserir(T classe) {
		em.getTransaction().begin();
		em.persist(classe);
		em.getTransaction().commit();
		
	}

	@Override
	public void alterar(T classe) {
		em.getTransaction().begin();
		em.merge(classe);
		em.getTransaction().commit();
		
	}

	@Override
	public void excluir(K codigo) {
		T entidade = em.find(classe, codigo);
		em.getTransaction().begin();
		em.remove(entidade);
		em.getTransaction().commit();
		
	}

	@Override
	public T consultar(K codigo) {
		return em.find(classe, codigo);
	}
	
	

}
