package br.com.fiap.am.DAO;

public interface DAO<T,K> {

	void inserir(T classe);
	void alterar(T classe);
	void excluir(K codigo);
	T consultar(K codigo);
}
