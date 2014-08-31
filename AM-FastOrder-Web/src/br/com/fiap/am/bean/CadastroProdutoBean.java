package br.com.fiap.am.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.ProdutoCategoriaDAO;
import br.com.fiap.am.DAO.ProdutoDAO;
import br.com.fiap.am.DAOImpl.ProdutoCategoriaDAOImpl;
import br.com.fiap.am.DAOImpl.ProdutoDAOImpl;
import br.com.fiap.am.entity.Produto;
import br.com.fiap.am.entity.ProdutoCategoria;
import br.com.fiap.am.singleton.EntityManagerFactorySingleton;

@ManagedBean
@RequestScoped
public class CadastroProdutoBean implements Serializable{

	private EntityManager em =  EntityManagerFactorySingleton.getInstance().createEntityManager(); 
	
	private Produto produto;
	
	private ProdutoDAO proDao;
	
	private ProdutoCategoria categoria;
	
	private List<ProdutoCategoria> lista;
	
	private ProdutoCategoriaDAO catDao;
	
	@PostConstruct
	private void init(){
		produto = new Produto();
		produto.setCategoria(new ProdutoCategoria());
		proDao = new ProdutoDAOImpl(em);
		catDao = new ProdutoCategoriaDAOImpl(em);
		//lista = new ArrayList<String>();
		buscar();
	}
	
	public void cadastrarProduto(){
		proDao.inserir(produto);
		FacesMessage msg = new FacesMessage("Produto Cadastrado");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
	
	public void buscar(){
		lista = catDao.buscarTodos();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public ProdutoCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ProdutoCategoria categoria) {
		this.categoria = categoria;
	}

	public List<ProdutoCategoria> getLista() {
		return lista;
	}

	public void setLista(List<ProdutoCategoria> lista) {
		this.lista = lista;
	}

	
	
	
	
}
