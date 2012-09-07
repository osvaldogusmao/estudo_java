package br.com.caelum.goodbuy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class ProdutoDao {

	private Session session;

	public ProdutoDao(Session session) {
		this.session = session;
	}

	public void salva(Produto produto) {
		Transaction transaction = session.beginTransaction();
		session.save(produto);
		transaction.commit();
	}

	public void altera(Produto produto) {
		Transaction transaction = session.beginTransaction();
		session.update(produto);
		transaction.commit();
	}

	public void remove(Produto produto) {
		Transaction transaction = session.beginTransaction();
		session.delete(produto);
		transaction.commit();
	}

	public Produto carrega(Long id) {
		Produto produto = new Produto();
		Transaction transaction = session.beginTransaction();
		produto = (Produto) session.load(Produto.class, id);
		transaction.commit();

		return produto;
	}

	public List<Produto> listaTudo() {
		return this.session.createCriteria(Produto.class).list();
	}
}
