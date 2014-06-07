package br.com.fiap.am.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TAB_AM_ITEM_PEDIDO")
@IdClass(ItemPedidoPK.class)
public class ItemPedido implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_pedido")
	private Pedido pedido;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_produto")
	private Produto produto;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_pessoa")
	private Pessoa pessoa;
	
	@Column(name="qt_items",nullable=false,length=5)
	private int quantidadeItems;
	
	@Column(name="ds_status",nullable=false,length=1)
	private char status;
	
	public ItemPedido(){
		
	}
	

	public ItemPedido(Pedido pedido, Produto produto, int quantidadeItems,
			char status) {
		super();
		this.pedido = pedido;
		this.produto = produto;
		this.quantidadeItems = quantidadeItems;
		this.status = status;
	}



	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidadeItems() {
		return quantidadeItems;
	}

	public void setQuantidadeItems(int quantidadeItems) {
		this.quantidadeItems = quantidadeItems;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	

}
