package br.com.bossini.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bossini.model.Cliente;
import br.com.bossini.service.ClienteService;

public class InserirCliente implements Command {

	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService service = new ClienteService();
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		service.salvar(cliente);
		request.setAttribute("cliente", cliente);
		RequestDispatcher rd = request.getRequestDispatcher("ExibeCliente.jsp");
		rd.forward(request, response);
	}

}
