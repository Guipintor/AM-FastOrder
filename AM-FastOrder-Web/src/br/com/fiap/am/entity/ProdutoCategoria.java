package br.com.fiap.am.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seqProdutoCategoria",sequenceName="SEQ_AM_PRODUTO_CATEGORIA",allocationSize=1)
@Table(name="TAB_AM_PRODUTO_CATEGORIA")
public class ProdutoCategoria implements Serializable{


	@Id
	@GeneratedValue(generator="seqProdutoCategoria",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_categoria",length=5)
	private int codigoCategoria;
	
	@Column(name="nm_nome",nullable=false,length=100)
	private String nome;
	
	@OneToMany(mappedBy="categoria",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Produto> produto;
	
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;
	
	public ProdutoCategoria() {
		
	}
	
	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	

	
	
	
	

}
