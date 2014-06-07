package br.com.fiap.am.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.PedidoDAO;
import br.com.fiap.am.DAO.ProdutoDAO;
import br.com.fiap.am.DAO.UsuarioDAO;
import br.com.fiap.am.DAOImpl.PedidoDAOImpl;
import br.com.fiap.am.DAOImpl.ProdutoDAOImpl;
import br.com.fiap.am.DAOImpl.UsuarioDAOImpl;
import br.com.fiap.am.entity.Pedido;
import br.com.fiap.am.entity.Produto;
import br.com.fiap.am.entity.Usuario;
import br.com.fiap.am.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		UsuarioDAO usuDao = new UsuarioDAOImpl(em);
		
		Usuario usuario = new Usuario();
		
		long numero =  usuDao.fazerLogin("admi324", "fiap");
		
		System.out.println(numero);
		
		
		
	}
	
}
