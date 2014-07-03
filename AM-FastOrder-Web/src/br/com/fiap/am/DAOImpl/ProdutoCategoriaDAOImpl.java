package br.com.fiap.am.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.am.DAO.ProdutoCategoriaDAO;
import br.com.fiap.am.entity.ProdutoCategoria;

public class ProdutoCategoriaDAOImpl extends DAOImpl<ProdutoCategoria, Integer> implements ProdutoCategoriaDAO{

	public ProdutoCategoriaDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<ProdutoCategoria> buscarTodos() {
		TypedQuery<ProdutoCategoria> query = em.createQuery("From ProdutoCategoria", ProdutoCategoria.class);
		return query.getResultList();
	}

	@Override
	public List<String> buscarNomes() {
		TypedQuery<String> query = em.createQuery("Select p.nome From ProdutoCategoria p", String.class);
		return query.getResultList();
	}
	
	

}
