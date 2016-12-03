package br.com.cursojsf.bean;

import javax.faces.bean.ManagedBean;

import br.com.cursojsf.dao.PresidenteDAO;
import br.com.cursojsf.model.Presidente;

@ManagedBean
public class PresidenteBean {

	Presidente presidente = new Presidente();

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public String salvar() {
		PresidenteDAO dao = new PresidenteDAO();
		dao.salvar(presidente);
		presidente = new Presidente();
		return "";
	}

}
