package br.com.fiap.am.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="seqCardapio",sequenceName="SEQ_AM_CARDAPIO",allocationSize=1)
@Table(name="TAB_AM_CARDAPIO")
public class Cardapio implements Serializable{

	@Id
	@GeneratedValue(generator="seqCardapio",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_cardapio",length=5)
	private int codigo;
	
	@Column(name="nm_cardapio",nullable=false,length=100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_cardapio",nullable=false)
	private Calendar data;
	
	@Column(name="tp_cardapio",nullable=false,length=100)
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name="cd_usuario")
	private Usuario usuario;

	public Cardapio() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
