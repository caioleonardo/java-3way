package com.web.model;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ServletJSTL
 */
@WebServlet("/ServletJSTL")
public class ServletJSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Livro> listaLivros = new ArrayList<>();
		
		Livro livro = new Livro();
		livro.setAutor("Caio");
		livro.setDescricao("Meu primeiro livro");
		livro.setTitulo("As cronicas da preguica");
		
		Livro livro1 = new Livro();
		livro1.setAutor("Caio");
		livro1.setDescricao("Meu segundo livro");
		livro1.setTitulo("As cronicas da preguica - 2");
		
		Livro livro2 = new Livro();
		livro2.setAutor("Caio");
		livro2.setDescricao("Meu terceiro livro");
		livro2.setTitulo("As cronicas da preguica - 3");
		
		Livro livro3 = new Livro();
		livro3.setAutor("Caio");
		livro3.setDescricao("Meu quarto livro");
		livro3.setTitulo("As cronicas da preguica - 4");
		
		Livro livro4 = new Livro();
		livro4.setAutor("Caio");
		livro4.setDescricao("Meu quinto livro");
		livro4.setTitulo("As cronicas da preguica - 5");
		
		Livro livro5 = new Livro();
		livro5.setAutor("Caio");
		livro5.setDescricao("Meu sexto livro");
		livro5.setTitulo("As cronicas da preguica - 6");

		Livro livro6 = new Livro();
		livro6.setAutor("Caio");
		livro6.setDescricao("Meu setimo livro");
		livro6.setTitulo("As cronicas da preguica - 7");
		
		listaLivros.add(livro);
		listaLivros.add(livro1);
		listaLivros.add(livro2);
		listaLivros.add(livro3);
		listaLivros.add(livro4);
		listaLivros.add(livro5);
		listaLivros.add(livro6);
		
		request.setAttribute("listaLivrosNoAtributo", listaLivros);
		
		RequestDispatcher rd = getServletContext()
				.getRequestDispatcher("/listagemJstl.jsp");
		rd.forward(request, response);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("userName", "username na sessão direto do servlet");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
