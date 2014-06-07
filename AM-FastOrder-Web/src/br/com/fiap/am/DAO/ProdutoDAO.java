package br.com.fiap.am.DAO;

import java.util.List;

import br.com.fiap.am.entity.Produto;

public interface ProdutoDAO extends DAO<Produto, Integer>{

	List<Produto> buscarTodos();
	
	List<Produto> buscarPorNome(String nome);
	
	List<Produto> buscarPorCategoria(int categoria);
}
