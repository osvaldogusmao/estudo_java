package br.com.caelum.goodbuy.testes;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

public class RemocaoDeProduto {

	public static void main(String[] args) {

		ProdutoDao dao = new ProdutoDao();
		Produto produto = new Produto();

		produto = (Produto) dao.carrega(1l);
		dao.remove(produto);

	}

}
