package br.com.caelum.goodbuy.infra;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadosDeSessionFactory implements
		ComponentFactory<SessionFactory> {

	public SessionFactory getInstance() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();

		SessionFactory factory = configuration.buildSessionFactory();
		return factory;
	}
}
