package br.com.fiap.am.DAO;

import java.util.List;

import br.com.fiap.am.entity.Pedido;

public interface PedidoDAO extends DAO<Pedido, Integer>{
	
	List<Pedido> buscarTodos();

}
