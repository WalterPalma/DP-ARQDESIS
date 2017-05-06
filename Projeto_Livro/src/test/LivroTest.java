package test;

import livro.Livro;

import static org.junit.Assert.*;

import org.junit.Test;

public class LivroTest {
	
	private Livro livro;

	@Test
	public void testCriar() {
		livro.criar();
		Livro outro = new Livro(1,"Harry Potter","J.K. Rowlling",1992,1,"Intriseca");
		outro.carregar();
		assertEquals ("Devem ser iguais", livro, outro);
	}

}
