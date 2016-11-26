package br.com.cursojsf.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cursojsf.model.Contato;

public class GerarTabela {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursojava");

		/*
		 * Contato c1 = new Contato(); c1.setNome("Namom");
		 * c1.setEmail("namomalencar@gmail.com"); c1.setSexo("M");
		 * c1.setDataNascimento(Calendar.getInstance()); EntityManager manager =
		 * factory.createEntityManager(); manager.getTransaction().begin();
		 * manager.persist(c1); manager.getTransaction().commit();
		 * System.out.println("ID do contato: " + c1.getId());
		 */
		/*
		 * EntityManager manager = factory.createEntityManager(); Contato
		 * encontrada = manager.find(Contato.class, 1);
		 * 
		 * System.out.println(encontrada.getNome());
		 * 
		 * manager.close();
		 * 
		 * factory.close();
		 */

		EntityManager manager = factory.createEntityManager();

		manager.close();
		factory.close();

	}
}
