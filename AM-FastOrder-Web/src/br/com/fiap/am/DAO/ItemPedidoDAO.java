package br.com.fiap.am.DAO;

import java.util.List;

import br.com.fiap.am.entity.ItemPedido;
import br.com.fiap.am.entity.ItemPedidoPK;

public interface ItemPedidoDAO extends DAO<ItemPedido, ItemPedidoPK>{
	
	List<ItemPedido> buscarTotalPorProduto();

}
