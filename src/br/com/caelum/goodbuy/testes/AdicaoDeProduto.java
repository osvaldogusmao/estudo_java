package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.infra.CriadosDeSessionFactory;
import br.com.caelum.goodbuy.modelo.Produto;

public class AdicaoDeProduto {

	public static void main(String[] args) {

		Produto produto = criaProduto();

		SessionFactory factory = new CriadosDeSessionFactory().getInstance();
		Session session = new CriadorDeSession(factory).getInstance();

		new ProdutoDao(session).salva(produto);
	}

	private static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("Produto Teste 2");
		produto.setDescricao("Produto para teste 2");
		produto.setPreco(16.50);
		return produto;
	}
}