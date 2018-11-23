package br.com.managedbean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.modelo.Pessoa;

@RequestScoped
@ManagedBean(name = "helloMapeamento")
public class PessoaMB {

	private Pessoa pessoa = new Pessoa();
	
	@PostConstruct
	public void init() {
		System.out.println("");
		pessoa.setNomeCompleto("Caio Leonardo");
		pessoa.setIdade(31);
		pessoa.setSexo("masculino");
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
