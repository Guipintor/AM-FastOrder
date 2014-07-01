package br.com.fiap.am.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.fiap.am.DAO.CardapioDAO;
import br.com.fiap.am.DAO.ItemCardapioDAO;
import br.com.fiap.am.DAO.ItemPedidoDAO;
import br.com.fiap.am.DAO.PedidoDAO;
import br.com.fiap.am.DAO.PessoaDAO;
import br.com.fiap.am.DAO.ProdutoCategoriaDAO;
import br.com.fiap.am.DAO.ProdutoDAO;
import br.com.fiap.am.DAO.UsuarioDAO;
import br.com.fiap.am.DAOImpl.CardapioDAOImpl;
import br.com.fiap.am.DAOImpl.ItemCardapioDAOImpl;
import br.com.fiap.am.DAOImpl.ItemPedidoDAOImpl;
import br.com.fiap.am.DAOImpl.PedidoDAOImpl;
import br.com.fiap.am.DAOImpl.PessoaDAOImpl;
import br.com.fiap.am.DAOImpl.ProdutoCategoriaDAOImpl;
import br.com.fiap.am.DAOImpl.ProdutoDAOImpl;
import br.com.fiap.am.DAOImpl.UsuarioDAOImpl;
import br.com.fiap.am.entity.Cardapio;
import br.com.fiap.am.entity.ItemCardapio;
import br.com.fiap.am.entity.ItemPedido;
import br.com.fiap.am.entity.Pedido;
import br.com.fiap.am.entity.Pessoa;
import br.com.fiap.am.entity.Produto;
import br.com.fiap.am.entity.ProdutoCategoria;
import br.com.fiap.am.entity.Usuario;
import br.com.fiap.am.singleton.EntityManagerFactorySingleton;

public class PopulaBanco {
	
	public static void main(String[] args) {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		ProdutoDAO proDao = new ProdutoDAOImpl(em);
		ProdutoCategoriaDAO prodCatDao = new ProdutoCategoriaDAOImpl(em);
		PedidoDAO pedDao = new PedidoDAOImpl(em);
		ItemPedidoDAO itemDao = new ItemPedidoDAOImpl(em);
		UsuarioDAO usuDao = new UsuarioDAOImpl(em);
		PessoaDAO pesDao = new PessoaDAOImpl(em);
		CardapioDAO cardDao = new CardapioDAOImpl(em);
		ItemCardapioDAO itCarDao = new ItemCardapioDAOImpl(em);
		
		Usuario usuario = new Usuario();
		usuario.setLogin("usuario");
		usuario.setSenha("senha");
		usuDao.inserir(usuario);
		
		Usuario usuario1 = new Usuario();
		usuario1.setLogin("admin");
		usuario1.setSenha("fiap");
		usuDao.inserir(usuario1);
		
		ProdutoCategoria prodCat1 = new ProdutoCategoria();
		prodCat1.setNome("bebida");
		prodCatDao.inserir(prodCat1);
		
		ProdutoCategoria prodCat2 = new ProdutoCategoria();
		prodCat2.setNome("sobremesas");
		prodCatDao.inserir(prodCat2);
		
		ProdutoCategoria prodCat3 = new ProdutoCategoria();
		prodCat3.setNome("entrada");
		prodCatDao.inserir(prodCat3);
		
		Produto prod1 = new Produto();
		prod1.setCategoria(prodCat1);
		prod1.setNome("Agua");
		prod1.setDisponivel('s');
		prod1.setPreco(3.0f);
		proDao.inserir(prod1);
		
		//bebidas
		Produto prod2 = new Produto();
		prod2.setCategoria(prodCat1);
		prod2.setNome("Suco de Laranja");
		prod2.setDisponivel('s');
		prod2.setPreco(10.0f);
		proDao.inserir(prod2);
		
		Produto prod3 = new Produto();
		prod3.setCategoria(prodCat1);
		prod3.setNome("Vinho tinto");
		prod3.setDisponivel('n');
		prod3.setPreco(56.0f);
		proDao.inserir(prod3);
		
		//sobre
		Produto prod4 = new Produto();
		prod4.setCategoria(prodCat2);
		prod4.setNome("Torta Holandesa");
		prod4.setDisponivel('s');
		prod4.setPreco(5.50f);
		proDao.inserir(prod4);
		
		Produto prod5 = new Produto();
		prod5.setCategoria(prodCat2);
		prod5.setNome("mousse de maracuja");
		prod5.setDisponivel('n');
		prod5.setPreco(3.75f);
		proDao.inserir(prod5);
		
		Produto prod6 = new Produto();
		prod6.setCategoria(prodCat2);
		prod6.setNome("brigadeirão");
		prod6.setDisponivel('s');
		prod6.setPreco(3.0f);
		proDao.inserir(prod6);
		
		//entrada
		Produto prod7 = new Produto();
		prod7.setCategoria(prodCat3);
		prod7.setNome("salada gourmet");
		prod7.setDisponivel('s');
		prod7.setPreco(15.50f);
		proDao.inserir(prod7);
		
		Produto prod8 = new Produto();
		prod8.setCategoria(prodCat3);
		prod8.setNome("salada rosa");
		prod8.setDisponivel('s');
		prod8.setPreco(9.70f);
		proDao.inserir(prod8);
		
		Produto prod9 = new Produto();
		prod9.setCategoria(prodCat3);
		prod9.setNome("salada de palmito");
		prod9.setDisponivel('s');
		prod9.setPreco(16.20f);
		proDao.inserir(prod9);
		
		//Cardapio
		Cardapio car1 = new Cardapio();
		car1.setNome("Cardapio Almoços");
		car1.setData(Calendar.getInstance());
		car1.setTipo("Diurno");
		car1.setUsuario(usuario);
		cardDao.inserir(car1);
		
		Cardapio car2 = new Cardapio();
		car2.setNome("Cardapio Pizzas");
		car2.setData(Calendar.getInstance());
		car2.setTipo("Noturno");
		car1.setUsuario(usuario);
		cardDao.inserir(car2);
		
		Cardapio car3 = new Cardapio();
		car3.setNome("Cardapio Pratos Completos");
		car3.setData(Calendar.getInstance());
		car3.setTipo("Final de Semana");
		car3.setUsuario(usuario);
		cardDao.inserir(car3);
		
		//itemCardapio
		ItemCardapio itcar1 = new ItemCardapio();
		itcar1.setCardapio(car1);
		itcar1.setProduto(prod1);
		itCarDao.inserir(itcar1);
		
		ItemCardapio itcar2 = new ItemCardapio();
		itcar2.setCardapio(car1);
		itcar2.setProduto(prod2);
		itCarDao.inserir(itcar2);
		
		ItemCardapio itcar3 = new ItemCardapio();
		itcar3.setCardapio(car2);
		itcar3.setProduto(prod3);
		itCarDao.inserir(itcar3);
		
		ItemCardapio itcar4 = new ItemCardapio();
		itcar4.setCardapio(car2);
		itcar4.setProduto(prod4);
		itCarDao.inserir(itcar4);
		
		ItemCardapio itcar5 = new ItemCardapio();
		itcar5.setCardapio(car3);
		itcar5.setProduto(prod5);
		itCarDao.inserir(itcar5);
		
		ItemCardapio itcar6 = new ItemCardapio();
		itcar6.setCardapio(car3);
		itcar6.setProduto(prod6);
		itCarDao.inserir(itcar6);
		
		
		//pedidos
		Pedido ped1 = new Pedido();
		ped1.setNumeroMesa(50);
		ped1.setDataPedido(Calendar.getInstance());
		ped1.setValorTotal(100);
		pedDao.inserir(ped1);
		
		Pedido ped2 = new Pedido();
		ped2.setNumeroMesa(9);
		ped2.setDataPedido(Calendar.getInstance());
		ped2.setValorTotal(120);
		pedDao.inserir(ped2);
		
		Pedido ped3 = new Pedido();
		ped3.setNumeroMesa(1);
		ped3.setDataPedido(Calendar.getInstance());
		ped3.setValorTotal(200);
		pedDao.inserir(ped3);
		
		Pedido ped4 = new Pedido();
		ped4.setNumeroMesa(1);
		ped4.setDataPedido(Calendar.getInstance());
		ped4.setValorTotal(30);
		pedDao.inserir(ped4);
		
		//Pessoas
		Pessoa pes1 = new Pessoa();
		pes1.setNome("Guilherme");
		pesDao.inserir(pes1);
		
		Pessoa pes2 = new Pessoa();
		pes2.setNome("Jose");
		pesDao.inserir(pes2);
		
		Pessoa pes3 = new Pessoa();
		pes3.setNome("Rafaely");
		pesDao.inserir(pes3);
		
		Pessoa pes4 = new Pessoa();
		pes4.setNome("Laura");
		pesDao.inserir(pes4);
		
		ItemPedido item1 = new ItemPedido();
		item1.setPedido(ped1);
		item1.setProduto(prod1);
		item1.setQuantidadeItems(2);
		item1.setStatus('e');
		item1.setPessoa(pes1);
		itemDao.inserir(item1);
		
		ItemPedido item2 = new ItemPedido();
		item2.setPedido(ped1);
		item2.setProduto(prod2);
		item2.setQuantidadeItems(2);
		item2.setStatus('e');
		item2.setPessoa(pes1);
		itemDao.inserir(item2);
		
		ItemPedido item3 = new ItemPedido();
		item3.setPedido(ped2);
		item3.setProduto(prod6);
		item3.setQuantidadeItems(6);
		item3.setStatus('e');
		item3.setPessoa(pes2);
		itemDao.inserir(item3);
		
		ItemPedido item4 = new ItemPedido();
		item4.setPedido(ped2);
		item4.setProduto(prod1);
		item4.setQuantidadeItems(8);
		item4.setStatus('e');
		item4.setPessoa(pes2);
		itemDao.inserir(item4);
		
		ItemPedido item5 = new ItemPedido();
		item5.setPedido(ped3);
		item5.setProduto(prod9);
		item5.setQuantidadeItems(1);
		item5.setStatus('e');
		item5.setPessoa(pes3);
		itemDao.inserir(item5);
		
		ItemPedido item6 = new ItemPedido();
		item6.setPedido(ped3);
		item6.setProduto(prod1);
		item6.setQuantidadeItems(2);
		item6.setStatus('e');
		item6.setPessoa(pes3);
		itemDao.inserir(item6);
		
		ItemPedido item7 = new ItemPedido();
		item7.setPedido(ped4);
		item7.setProduto(prod4);
		item7.setQuantidadeItems(1);
		item7.setStatus('e');
		item7.setPessoa(pes4);
		itemDao.inserir(item7);
		
		ItemPedido item8 = new ItemPedido();
		item8.setPedido(ped4);
		item8.setProduto(prod2);
		item8.setQuantidadeItems(2);
		item8.setStatus('e');
		item8.setPessoa(pes4);
		itemDao.inserir(item8);
		
		
		
	}

}
