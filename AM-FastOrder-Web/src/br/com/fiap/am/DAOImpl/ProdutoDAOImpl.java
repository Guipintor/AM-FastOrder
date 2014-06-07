package br.com.fiap.am.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.am.DAO.ProdutoDAO;
import br.com.fiap.am.entity.Produto;

public class ProdutoDAOImpl extends DAOImpl<Produto, Integer> implements ProdutoDAO{

	public ProdutoDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Produto> buscarTodos() {
		TypedQuery<Produto> query = em.createQuery("From Produto p", Produto.class);
		return query.getResultList();
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		TypedQuery<Produto> query = em.createQuery("From Produto p where p.nome like(:nome)", Produto.class);
		query.setParameter("nome", nome + "%");
		return query.getResultList();
	}

	@Override
	public List<Produto> buscarPorCategoria(int categoria) {
		TypedQuery<Produto> query = em.createQuery("From Produto p where p.categoria.codigoCategoria = :codigo", Produto.class);
		query.setParameter("codigo", categoria);
		return query.getResultList();
	}
	

}
