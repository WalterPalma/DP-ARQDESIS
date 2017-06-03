package br.com.bossini.command;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bossini.model.Cliente;
import br.com.bossini.service.ClienteService;

public class ListarClientes implements Command{
	
	@Override
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ClienteService service = new ClienteService();
		List <Cliente> clientes = service.listar();
		request.setAttribute("clientes", clientes);
		request.getRequestDispatcher("ExibeClientes.jsp").forward(request, response);
	}

}
