package br.com.fiap.am.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TAB_AM_ITEM_CARDAPIO")
@IdClass(ItemCardapioPk.class)
public class ItemCardapio implements Serializable{
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_produto")
	private Produto produto;
	
	@Id
	@ManyToOne
	@JoinColumn(name="cd_cardapio")
	private Cardapio cardapio;
	
	public ItemCardapio(){
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	
	

}
