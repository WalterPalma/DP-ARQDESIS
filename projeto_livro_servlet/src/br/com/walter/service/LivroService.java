package br.com.walter.service;

import java.sql.SQLException;

import br.com.walter.dao.LivroDAO;
import br.com.walter.model.Livro;

public class LivroService {
	private LivroDAO livroDAO;

	public LivroService() {
		livroDAO = new LivroDAO();
	}

	public void salvar(Livro livro) {
		try {
			livroDAO.salvar(livro);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
