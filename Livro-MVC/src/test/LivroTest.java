package test;


import static org.junit.Assert.assertEquals;
import model.Livro;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import service.LivroService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LivroTest {
	Livro livro, copia;
	LivroService livroService;
	static int id = 0;

	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		livro = new Livro();
		livro.setId(id);
		livro.setNome("Batista Cepelos");
		livro.setAutor("Paulo Coelho");
		livro.setEmail("intriseca@email.com");
		livro.setAno("2002");
		copia = new Livro();
		copia.setId(id);
		copia.setNome("Harry Potter");
		copia.setAutor("J.K. Rowlling");
		copia.setEmail("saraiva@email.com");
		copia.setAno("1996");
		livroService = new LivroService();
		System.out.println(livro);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		Livro fixture = new Livro();
		fixture.setId(1);
		fixture.setNome("Vidas Secas");
		fixture.setAutor("Carlos Drumond de Andrade");
		fixture.setEmail("cda@usjt.br");
		fixture.setAno("1994");
		LivroService novoService = new LivroService();
		Livro novo = novoService.carregar(1);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		id = livroService.criar(livro);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", livro, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		livro.setAutor("Manoel Bandeira");
		copia.setAutor("José de Alencar");		
		livroService.atualizar(livro);
		livro = livroService.carregar(livro.getId());
		assertEquals("testa atualizacao", livro, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setAutor(null);
		copia.setEmail(null);
		livroService.excluir(id);
		livro = livroService.carregar(id);
		assertEquals("testa exclusao", livro, copia);
	}
}