package br.com.fiap.am.DAO;

import java.util.List;

import br.com.fiap.am.entity.Cardapio;

public interface CardapioDAO extends DAO<Cardapio, Integer>{

	List<Cardapio> buscarTodos();
	
	List<Cardapio> buscarPorNome(String nome);
}
