package br.com.fiap.am.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.am.DAO.CardapioDAO;
import br.com.fiap.am.entity.Cardapio;

public class CardapioDAOImpl extends DAOImpl<Cardapio, Integer> implements CardapioDAO{

	public CardapioDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<Cardapio> buscarTodos() {
		TypedQuery<Cardapio> query = em.createQuery("From Cardapio c", Cardapio.class);
		return query.getResultList();
	}

	@Override
	public List<Cardapio> buscarPorNome(String nome) {
		TypedQuery<Cardapio> query = em.createQuery("From Cardapio c where c.nome like(:nome)", Cardapio.class);
		query.setParameter("nome", nome);
		return query.getResultList();
	}

}
