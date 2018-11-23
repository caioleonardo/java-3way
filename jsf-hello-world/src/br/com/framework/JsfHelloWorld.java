package br.com.framework;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "helloMapeamento")

public class JsfHelloWorld {

	private String message;
	private String message2;
	private String nomeCompleto;
	
	@PostConstruct
	public void init() {
		System.out.println(" Método init() executado na inicialização devido à anotação @PostConstruct");
		nomeCompleto = "Fábio Alves Gomes";
		message = "Hello World JSF! 444";
		message2 = "Hello World JSF! 555";
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	
}
