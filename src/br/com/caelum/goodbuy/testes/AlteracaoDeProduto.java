package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.goodbuy.modelo.Produto;

public class AlteracaoDeProduto {

	public static void main(String[] args) {

		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		// carrega um produto
		Produto produto = (Produto) session.load(Produto.class, 1l);

		Transaction transaction = session.beginTransaction();
		produto.setPreco(15.90);
		session.update(produto);
		transaction.commit();
		
		
	}
}
