package br.com.fiap.am.DAOImpl;

import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.ProdutoCategoriaDAO;
import br.com.fiap.am.entity.ProdutoCategoria;

public class ProdutoCategoriaDAOImpl extends DAOImpl<ProdutoCategoria, Integer> implements ProdutoCategoriaDAO{

	public ProdutoCategoriaDAOImpl(EntityManager em) {
		super(em);
	}
	
	

}
