package br.com.cursojsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.cursojsf.model.Contato;

@ManagedBean
@ViewScoped
public class ContatoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	List<Contato> listaContatos = new ArrayList<Contato>();

	public List<Contato> getContatos() {

		for (int i = 0; i <= 99; i++) {
			Contato c = new Contato();
			c.setId(i);
			c.setNome("Nome - " + i);
			c.setEmail(i + "@email.com");
			c.setEndereco("Rua Feliz, " + i);
			if ((i % 2) == 0) {
				c.setSexo("M");
			} else {
				c.setSexo("F");
			}
			c.setDataNascimento(Calendar.getInstance());
			listaContatos.add(c);
		}

		return listaContatos;

	}

}
