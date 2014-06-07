package br.com.fiap.am.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name="seqPessoa",sequenceName="SEQ_AM_PESSOA",allocationSize=1)
@Table(name="TAB_AM_PESSOA")
public class Pessoa implements Serializable{
	
	@Id
	@GeneratedValue(generator="seqPessoa",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_pessoa",length=5)
	private int codigo;
	
	@Column(name="nm_pessoa",nullable=false,length=100)
	private String nome;
	
	public Pessoa(){
		
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
	
	

}
