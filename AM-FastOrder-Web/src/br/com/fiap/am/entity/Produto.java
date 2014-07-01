package br.com.fiap.am.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seqProduto",sequenceName="SEQ_AM_PRODUTO",allocationSize=1)
@Table(name="TAB_AM_PRODUTO")
public class Produto implements Serializable{
	

	@Id
	@GeneratedValue(generator="seqProduto",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_produto",length=5)
	private int codigoProduto;
	
	@Column(name="nm_produto",nullable=false,length=100)
	private String nome;
	
	@Column(name="ds_descricao",length=400)
	private String descricao;
	
	@Column(name="vl_preco",nullable=false,length=6,precision=2)
	private float preco;
	
	@Column(name="ds_disponivel",nullable=false,length=1)
	private char disponivel;
	
	@Column(name="nm_imagem",length=150)
	private String imagem;
	
	@ManyToOne
	@JoinColumn(name="cd_categoria",nullable=false)
	private ProdutoCategoria categoria;
	
	
	public Produto(){
		
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public char getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(char disponivel) {
		this.disponivel = disponivel;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public ProdutoCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ProdutoCategoria categoria) {
		this.categoria = categoria;
	}


	
	
	
	

}
