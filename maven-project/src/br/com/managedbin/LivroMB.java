package br.com.managedbin;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.controller.Livro;


@RequestScoped
@ManagedBean(name = "livroMB")
public class LivroMB {

	private ArrayList<Livro> listaLivro = new ArrayList<>();

	@PostConstruct
	public void init() {
		
		Livro livro = new Livro();
		
		livro.setTitulo("Harry Potter e a Pedra Filosofal");
		livro.setAutor("J.K. Rowling");
		livro.setAnoDeLancamento(1997);
		livro.setGenero("Fantasia");
		livro.setPreco(122.19);
		livro.setEditora("Abril");
		
		Livro livro2 = new Livro();
		
		livro2.setTitulo("Harry Potter e a Camara Secreta");
		livro2.setAutor("J.K. Rowling");
		livro2.setAnoDeLancamento(1998);
		livro2.setGenero("Fantasia");
		livro2.setPreco(126.19);
		livro2.setEditora("Abril");
		
		Livro livro3 = new Livro();
		
		livro3.setTitulo("Harry Potter e o Prisioneiro de Azkaban");
		livro3.setAutor("J.K. Rowling");
		livro3.setAnoDeLancamento(1999);
		livro3.setGenero("Fantasia");
		livro3.setPreco(127.19);
		livro3.setEditora("Abril");
		
		Livro livro4 = new Livro();
		
		livro4.setTitulo("Harry Potter e o Calice de Fogo");
		livro4.setAutor("J.K. Rowling");
		livro4.setAnoDeLancamento(2000);
		livro4.setGenero("Fantasia");
		livro4.setPreco(128.19);
		livro4.setEditora("Abril");
		
		Livro livro5 = new Livro();
		
		livro5.setTitulo("Harry Potter e a Ordem da Fenix");
		livro5.setAutor("J.K. Rowling");
		livro5.setAnoDeLancamento(2003);
		livro5.setGenero("Fantasia");
		livro5.setPreco(129.19);
		livro5.setEditora("Abril");
		
		listaLivro.add(livro);
		listaLivro.add(livro2);
		listaLivro.add(livro3);
		listaLivro.add(livro4);
		listaLivro.add(livro5);
		
	}

	public ArrayList<Livro> getListaLivro() {
		return listaLivro;
	}

	public void setListaLivro(ArrayList<Livro> listaLivro) {
		this.listaLivro = listaLivro;
	}
		
}