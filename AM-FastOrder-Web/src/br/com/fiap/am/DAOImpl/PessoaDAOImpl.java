package br.com.fiap.am.DAOImpl;

import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.PessoaDAO;
import br.com.fiap.am.entity.Pessoa;

public class PessoaDAOImpl extends DAOImpl<Pessoa, Integer> implements PessoaDAO{

	public PessoaDAOImpl(EntityManager em) {
		super(em);
	}

}
