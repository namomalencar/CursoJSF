package br.com.cursojsf.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HorarioBean {
	
	private String nome = "Namom"; 
	
	public String getHorario(){
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		return "Horario: "+sdf.format(new Date());
	}
	
	public void digaOi(){
		System.out.println(this.nome);
	}
	
	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
