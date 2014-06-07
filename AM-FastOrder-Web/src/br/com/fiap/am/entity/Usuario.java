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
@SequenceGenerator(name="seqUsuario",sequenceName="SEQ_AM_USUARIO",allocationSize=1)
@Table(name="TAB_AM_USUARIO")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(generator="seqUsuario",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_usuario",length=5)
	private long codigo;

	@Column(name="nm_login",length=30)
	private String login;
	
	@Column(name="nm_senha",length=20,nullable=false)
	private String senha;
	
	public Usuario(){
		
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	public long getCodigo() {
		return codigo;
	}


	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	
	

}
