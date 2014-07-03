package br.com.fiap.am.DAO;

import java.util.List;

import br.com.fiap.am.entity.ProdutoCategoria;

public interface ProdutoCategoriaDAO extends DAO<ProdutoCategoria, Integer>{

	List<ProdutoCategoria> buscarTodos();
	
	List<String> buscarNomes();
}
