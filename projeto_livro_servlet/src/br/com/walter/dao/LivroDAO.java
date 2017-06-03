package br.com.walter.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.walter.factory.ConnectionFactory;
import br.com.walter.model.Livro;

public class LivroDAO {

	public void salvar(Livro livro) throws SQLException {
		String sql = "INSERT INTO livro (nome, autor, email, ano) VALUES (?, ?, ?, ?)";
		try (Connection conn = ConnectionFactory.obterConexao(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, livro.getNome());
			ps.setString(2, livro.getAutor());
			ps.setString(3, livro.getEmail());
			ps.setString(4, livro.getAno());
			ps.execute();
			String sql2 = "SELECT LAST_INSERT_ID() AS id";
			try (PreparedStatement ps2 = conn.prepareStatement(sql2); ResultSet rs = ps2.executeQuery();) {
				if (rs.next()) {
					livro.setId(rs.getInt("id"));
				}
			}
		}

	}
}
