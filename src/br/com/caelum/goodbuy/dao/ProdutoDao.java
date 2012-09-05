package br.com.caelum.goodbuy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;

public class ProdutoDao {
	
	private Session session;
	
	public ProdutoDao() {
		this.session = CriadorDeSession.getSession();
	}
	

	public void salva(Produto produto) {
		Transaction transaction = session.beginTransaction();
		session.save(produto);
		transaction.commit();
	}

}
