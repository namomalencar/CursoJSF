package br.com.cursojsf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.cursojsf.model.Presidente;

public class PresidenteDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursojava");
	private EntityManager manager = factory.createEntityManager();

	public void salvar(Object o) {
		manager.getTransaction().begin();
		manager.persist(o);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

	public List<Presidente> listar() {
		Query query = manager.createQuery("select p from Presidente p");
		List<Presidente> lista = query.getResultList();
		return lista;
	}

}
