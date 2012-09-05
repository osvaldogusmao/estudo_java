package br.com.caelum.goodbuy.testes;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

public class AdicaoDeProduto {

	public static void main(String[] args) {

		Produto produto = criaProduto();

		new ProdutoDao().salva(produto);
	}

	private static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("Produto Teste 1");
		produto.setDescricao("Produto para teste");
		produto.setPreco(12.50);
		return produto;
	}
}
