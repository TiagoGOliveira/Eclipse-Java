package br.org.senai.bean;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMensagem() {
		return "Essa mensagem foi enviada pelo Bean";
	}
	
}
