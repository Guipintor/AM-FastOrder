package br.com.fiap.am.DAO;

import java.util.List;

import br.com.fiap.am.entity.Usuario;

public interface UsuarioDAO extends DAO<Usuario, Integer>{
	
	long fazerLogin(String usuario,String senha);
	
	List<Usuario> buscarTodos();

}
