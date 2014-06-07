package br.com.fiap.am.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.am.DAO.PedidoDAO;
import br.com.fiap.am.entity.Pedido;

public class PedidoDAOImpl extends DAOImpl<Pedido, Integer>implements PedidoDAO{

	public PedidoDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Pedido> buscarTodos() {
		TypedQuery<Pedido> query = em.createQuery("From Pedido p", Pedido.class);
		return query.getResultList();
	}
	
	

}
