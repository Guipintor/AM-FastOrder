package br.com.fiap.am.entity;

import java.io.Serializable;

public class ItemCardapioPk implements Serializable{
	
	private Produto produto;
	
	private Cardapio cardapio;
	
	

	public ItemCardapioPk() {
		super();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cardapio == null) ? 0 : cardapio.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCardapioPk other = (ItemCardapioPk) obj;
		if (cardapio == null) {
			if (other.cardapio != null)
				return false;
		} else if (!cardapio.equals(other.cardapio))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
	
	
	
	

}
