package br.com.fiap.am.bean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import org.primefaces.context.RequestContext;

import br.com.fiap.am.DAO.UsuarioDAO;
import br.com.fiap.am.DAOImpl.UsuarioDAOImpl;
import br.com.fiap.am.entity.Usuario;
import br.com.fiap.am.singleton.EntityManagerFactorySingleton;


@ManagedBean
@RequestScoped
public class LoginBean {
	
	
	private Usuario usuario1;
	
	private String usuario;
	
	private String senha;
	
	@PostConstruct
	private void init(){
		usuario1 = new Usuario();
	}
	
	public String login(){
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		UsuarioDAO usuDao = new UsuarioDAOImpl(em);
		
		usuario1.setLogin(usuario);
		usuario1.setSenha(senha);
		
		long numero = usuDao.fazerLogin(usuario1.getLogin(), usuario1.getSenha());
		
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage msg = null;
		boolean logou = false;
		
		if(numero > 0){
			//logou = true;
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Bem Vindo",usuario1.getLogin());
			FacesContext.getCurrentInstance().addMessage(null, msg);
			//context.addCallbackParam("Logou", logou);
			return "cadastro";
		}else{
			//logou = false;
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN,"Login Invalido","Credenciais invalidas");
			FacesContext.getCurrentInstance().addMessage(null, msg);
			//context.addCallbackParam("Logou", logou);
			return "login";
		}
		
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario1() {
		return usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	
	
	
	
	
	
}
