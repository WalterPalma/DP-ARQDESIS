package br.com.bossini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.bossini.factory.ConnectionFactory;
import br.com.bossini.model.Cliente;

public class ClienteDAO {
	
	public void salvar (Cliente cliente) throws SQLException {
		String sql = "INSERT INTO cliente (nome, telefone, email) VALUES (?, ?, ?)";
		try (Connection conn = ConnectionFactory.obterConexao();
				PreparedStatement ps = conn.prepareStatement(sql);){
				ps.setString(1, cliente.getNome());
				ps.setString(2, cliente.getTelefone());
				ps.setString(3, cliente.getEmail());
				ps.execute();
				String sql2 = "SELECT LAST_INSERT_ID() AS id";
				try (PreparedStatement ps2 = conn.prepareStatement(sql2);
						ResultSet rs = ps2.executeQuery();){
						if (rs.next()){
							cliente.setId(rs.getInt("id"));
						}
				}
		}
		
	}

	public List<Cliente> listar() throws SQLException {
		List <Cliente> clientes = new ArrayList <> ();
		String sql = "SELECT * FROM cliente";
		try (Connection conn = ConnectionFactory.obterConexao();PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();){
				while (rs.next()){
					Cliente cliente = new Cliente ();
					cliente.setId(rs.getInt("id"));
					cliente.setEmail(rs.getString("email"));
					cliente.setNome(rs.getString("nome"));
					cliente.setTelefone(rs.getString("telefone"));
					clientes.add(cliente);
				}
		}
		return clientes;
	}
}
