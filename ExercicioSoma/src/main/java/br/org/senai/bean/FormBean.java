package br.org.senai.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FormBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer numero1;
	private Integer numero2;
	private Integer numero3;
	private Integer resultado;
	
	public String soma() {
		resultado = numero1 + numero2 + numero3;
		return "result";
	}
	
	
	
	public Integer getNumero1() {
		return numero1;
	}
	public void setNumero1(Integer numero1) {
		this.numero1 = numero1;
	}
	public Integer getNumero2() {
		return numero2;
	}
	public void setNumero2(Integer numero2) {
		this.numero2 = numero2;
	}
	public Integer getNumero3() {
		return numero3;
	}
	public void setNumero3(Integer numero3) {
		this.numero3 = numero3;
	}
	public Integer getResultado() {
		return resultado;
	}
	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	

}
