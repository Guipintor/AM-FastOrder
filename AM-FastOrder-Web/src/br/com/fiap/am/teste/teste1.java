package br.com.fiap.am.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.ProdutoCategoriaDAO;
import br.com.fiap.am.DAOImpl.ProdutoCategoriaDAOImpl;
import br.com.fiap.am.entity.ProdutoCategoria;
import br.com.fiap.am.singleton.EntityManagerFactorySingleton;

public class teste1 {

	public static void main(String[] args) {
		
		EntityManager em =  EntityManagerFactorySingleton.getInstance().createEntityManager();
		ProdutoCategoriaDAO dao = new ProdutoCategoriaDAOImpl(em);
		List<String> lista = dao.buscarNomes();
		for(String x : lista){
			System.out.println(x);
		}
		
	}

}
