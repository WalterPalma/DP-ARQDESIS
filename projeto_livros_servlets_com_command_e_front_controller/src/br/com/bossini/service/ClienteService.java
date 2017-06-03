package br.com.bossini.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bossini.dao.ClienteDAO;
import br.com.bossini.model.Cliente;

public class ClienteService {
	private ClienteDAO clienteDAO;
	
	public ClienteService (){
		clienteDAO = new ClienteDAO();
	}
	
	public void salvar (Cliente cliente){
		try {
			clienteDAO.salvar(cliente);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List <Cliente> listar (){
		try {
			return clienteDAO.listar();
		} 
		catch (SQLException e) {
			e.printStackTrace();
			return new ArrayList <Cliente> ();
		}
	}
	
}
