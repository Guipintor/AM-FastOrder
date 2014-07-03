package br.com.fiap.am.bean;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.ProdutoCategoriaDAO;
import br.com.fiap.am.DAOImpl.ProdutoCategoriaDAOImpl;
import br.com.fiap.am.entity.ProdutoCategoria;
import br.com.fiap.am.singleton.EntityManagerFactorySingleton;

@ManagedBean
@RequestScoped
public class CadastroCategoriaBean implements Serializable{
	
	private EntityManager em =  EntityManagerFactorySingleton.getInstance().createEntityManager(); 
	
	private ProdutoCategoria categoria;
	
	private ProdutoCategoriaDAO proDao;
	
	@PostConstruct
	private void init(){
		categoria = new ProdutoCategoria();
		proDao = new ProdutoCategoriaDAOImpl(em);
	}
	
	public void cadastrarCategoria(){
		proDao.inserir(categoria);
		FacesMessage msg = new FacesMessage("Categoria Cadastrada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	

	public ProdutoCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ProdutoCategoria categoria) {
		this.categoria = categoria;
	}

	public ProdutoCategoriaDAO getDao() {
		return proDao;
	}

	public void setDao(ProdutoCategoriaDAO dao) {
		this.proDao = dao;
	}

	
	
	
	
	

}
