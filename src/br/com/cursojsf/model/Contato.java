package br.com.cursojsf.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;


public class Contato {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String email;
	private String endereco;
	private String sexo;
	@Column(name = " data_nascimento", nullable = true)
	private Calendar dataNascimento;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Contato> criarContatos(int number) {
		List<Contato> listacontatos = new ArrayList<Contato>();
		Contato c1 = new Contato();
		c1.setId(0);
		c1.setNome("Namom");
		c1.setEmail("namomalencar@gmail.com");
		c1.setEndereco("Rua Feliz, 100");
		c1.setDataNascimento(Calendar.getInstance());

		listacontatos.add(c1);

		for (int i = 1; i <= number; i++) {
			Contato c = new Contato();
			c.setId(i);
			c.setNome("Nome - " + i);
			c.setEmail("email@gmail.com" + i);
			c.setEndereco("Rua Feliz, 100" + i);
			c.setDataNascimento(Calendar.getInstance());
			listacontatos.add(c);
		}
		System.out.println(listacontatos);
		return listacontatos;
	}

	public List<Contato> buscarTodos() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursojava");

		EntityManager manager = factory.createEntityManager();
		@SuppressWarnings("unchecked")
		List<Contato> resultList = manager.createQuery("select t from Contato as t").getResultList();
		for (Contato t : resultList) {
			System.out.println(t.getEmail());
		}

		manager.close();

		factory.close();

		return resultList;
	}

	public void salvar() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursojava");

		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(this);
		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}
