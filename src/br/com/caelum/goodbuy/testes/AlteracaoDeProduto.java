package br.com.caelum.goodbuy.testes;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

public class AlteracaoDeProduto {

	public static void main(String[] args) {

		ProdutoDao dao = new ProdutoDao();
		Produto produto = new Produto();

		produto = dao.carrega(1l);

		dao.altera(produto);

	}
}
