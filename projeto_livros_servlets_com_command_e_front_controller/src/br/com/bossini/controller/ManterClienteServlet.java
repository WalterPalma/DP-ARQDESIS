package br.com.bossini.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bossini.model.Cliente;
import br.com.bossini.service.ClienteService;
/**
 * Servlet implementation class ManterClienteServlet
 */
@WebServlet("/ManterCliente")
public class ManterClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManterClienteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oQueFazer = request.getParameter("acao");
		ClienteService service = new ClienteService();
		if (oQueFazer.equals("Inserir")){
			String nome = request.getParameter("nome");
			String telefone = request.getParameter("telefone");
			String email = request.getParameter("email");
			Cliente cliente = new Cliente ();
			cliente.setNome(nome);
			cliente.setTelefone(telefone);
			cliente.setEmail(email);
			service.salvar(cliente);
			request.setAttribute("cliente", cliente);
			RequestDispatcher rd = request.getRequestDispatcher("ExibeCliente.jsp");
			rd.forward(request, response);
		}
		else{
			List <Cliente> clientes = service.listar();
			request.setAttribute("clientes", clientes);
			request.getRequestDispatcher("ExibeClientes.jsp").forward(request, response);
			
		}
		
		/*PrintWriter pw = response.getWriter();
		pw.println ("<html> <head> <title> Seila </title> </head> <body> <p>Cliente salvo com sucesso. Seu id é: " + cliente.getId() + ".</p> </body> </html>");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
