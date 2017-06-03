package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import factory.ConnectionFactory;

public class LivroDAO {


	public void delete(String titulo) {
		String sqlDelete = "DELETE FROM livro WHERE titulo like ? ";
		try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement stm = conn.prepareStatement(sqlDelete);) {
			stm.setString(1, titulo);
			stm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList listar(String titulo) {
		ArrayList retorno = new ArrayList();
		String sqlSelect = "SELECT  titulo FROM livro WHERE livro.titulo like ?% ";

		try (Connection conn = ConnectionFactory.obtemConexao(); 
				PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
			stm.setString(1, titulo);
			try (ResultSet rs = stm.executeQuery();) {
				if (rs.next()) {
					retorno.add(rs.getString("titulo"));
				} 
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		return retorno;
	}

}
