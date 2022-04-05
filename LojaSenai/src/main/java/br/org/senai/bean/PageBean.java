package br.org.senai.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped

public class PageBean implements Serializable {
	
	private String page;
	private String nome;
	
	public enum Pages {
		page_a, page_b;
	}

	
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pages goTo() {
		if("a".equals(page)) {
			return Pages.page_a;
	}else {
		return Pages.page_b;
	}}}