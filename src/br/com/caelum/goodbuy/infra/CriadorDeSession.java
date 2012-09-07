package br.com.caelum.goodbuy.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSession implements ComponentFactory<Session> {

	private SessionFactory factory;
	private Session session;

	public CriadorDeSession(SessionFactory factory) {
		System.out.println("Criando Session");
		this.factory = factory;
	}

	@PostConstruct
	public void abre() {
		this.session = factory.openSession();
		System.out.println("Abrindo sess‹o");
	}

	public Session getInstance() {
		System.out.println("Retornando uma session criada");
		return this.session;
	}

	@PreDestroy
	public void fecha() {
		this.session.close();
		System.out.println("Fechando sess‹o");
	}
}
