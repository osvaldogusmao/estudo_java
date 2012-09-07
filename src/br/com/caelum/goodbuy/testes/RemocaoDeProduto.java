package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.infra.CriadosDeSessionFactory;
import br.com.caelum.goodbuy.modelo.Produto;

public class RemocaoDeProduto {

	public static void main(String[] args) {

		SessionFactory factory = new CriadosDeSessionFactory().getInstance();
		Session session = new CriadorDeSession(factory).getInstance();
		
		ProdutoDao dao = new ProdutoDao(session);
		Produto produto = new Produto();

		produto = (Produto) dao.carrega(1l);
		dao.remove(produto);

	}

}
