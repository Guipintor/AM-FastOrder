package br.com.fiap.am.DAOImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.am.DAO.ItemPedidoDAO;
import br.com.fiap.am.entity.ItemPedido;
import br.com.fiap.am.entity.ItemPedidoPK;

public class ItemPedidoDAOImpl extends DAOImpl<ItemPedido, ItemPedidoPK> implements ItemPedidoDAO{

	public ItemPedidoDAOImpl(EntityManager em) {
		super(em);
	}

	@Override
	public List<ItemPedido> buscarTotalPorProduto() {
		//select p.cd_produto,p.nm_nome,sum(ip.qt_items)from tab_am_item_pedido ip inner join tab_am_produto p on(ip.cd_produto = p.cd_produto) group by p.cd_produto,p.nm_nome;
		TypedQuery<ItemPedido> query = em.createQuery("Select p.codigoProduto,p.nome, count(ip.quantidadeItems) From ItemPedido ip", ItemPedido.class);
		return query.getResultList();
	}

}
