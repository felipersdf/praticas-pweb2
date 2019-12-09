package br.edu.ifpb.pweb2.dao;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer implements Serializable {
	private static final long serialVersionID = 1L;
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("turmas");
	
	@Produces
	@SessionScoped
	public EntityManager createEntityManager() {
		return factory.createEntityManager();
	}
	
	public void closeEntityManager(@Disposes EntityManager manager) {
		manager.close();
	}
	
	public static EntityManagerFactory getEntityManagetFactory() {
		return factory;
	}

}
