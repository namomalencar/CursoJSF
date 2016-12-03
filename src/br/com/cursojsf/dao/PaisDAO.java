package br.com.cursojsf.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojsf.model.Pais;

public class PaisDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursojava");
	private EntityManager manager = factory.createEntityManager();

	public void salvar(Pais p) {
		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
