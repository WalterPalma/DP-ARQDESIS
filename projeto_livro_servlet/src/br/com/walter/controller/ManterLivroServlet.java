package br.com.walter.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.walter.model.Livro;
import br.com.walter.service.LivroService;

/**
 * Servlet implementation class ManterLivroServlet
 */
@WebServlet("/ManterLivro")
public class ManterLivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManterLivroServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LivroService service = new LivroService();
		String nome = request.getParameter("nome");
		String autor = request.getParameter("autor");
		String email = request.getParameter("email");
		String ano = request.getParameter("Ano");
		Livro livro = new Livro();
		livro.setNome(nome);
		livro.setAutor(autor);
		livro.setEmail(email);
		livro.setAno(ano);
		service.salvar(livro);
		PrintWriter pw = response.getWriter();
		pw.println("<html> <head> <title> Livro </title> </head> <body> <p>Livro salvo com sucesso. Seu id é: "
				+ livro.getId() + ".</p> </body> </html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
