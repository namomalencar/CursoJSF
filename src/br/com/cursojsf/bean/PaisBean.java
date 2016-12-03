package br.com.cursojsf.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.cursojsf.dao.PresidenteDAO;
import br.com.cursojsf.model.Pais;
import br.com.cursojsf.model.Presidente;

@ManagedBean
public class PaisBean {

	private Pais pais = new Pais();

	private List<Presidente> listaPresidentes = new ArrayList<Presidente>();

	public String salvar() {
		pais.salvar();
		pais = new Pais();
		return "";
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Presidente> getListaPresidentes() {
		PresidenteDAO pDAO = new PresidenteDAO();
		listaPresidentes = pDAO.listar();
		return listaPresidentes;
	}

	public void setListaPresidentes(List<Presidente> listaPresidentes) {
		this.listaPresidentes = listaPresidentes;
	}

}
