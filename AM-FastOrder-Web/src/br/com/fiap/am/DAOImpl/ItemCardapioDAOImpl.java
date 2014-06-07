package br.com.fiap.am.DAOImpl;

import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.ItemCardapioDAO;
import br.com.fiap.am.entity.ItemCardapio;
import br.com.fiap.am.entity.ItemCardapioPk;

public class ItemCardapioDAOImpl extends DAOImpl<ItemCardapio, ItemCardapioPk> implements ItemCardapioDAO{

	public ItemCardapioDAOImpl(EntityManager em) {
		super(em);
	}

}
