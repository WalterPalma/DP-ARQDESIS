package figuras_Geometricas;

import java.util.ArrayList;
import java.util.List;

public class Geometria {

	public static void main(String[] args) {

		List<Figura> f = new ArrayList<Figura>();

		// Cálculo de Área
		System.out.println("Cálculo Área \n\n");
		f.add(new Quadrado(2.0, 2.0));
		f.add(new Retangulo(4.5, 3.0));
		f.add(new Triangulo(2.0, 5.0));
		f.add(new Losango(3.0, 3.0));
		f.add(new Circulo(6.5));

		for (Figura fig : f) {
			System.out.println(fig.calcularArea());
		}

		// Cálculo Diagonal
		System.out.println("\n\nCálculo Diagonal\n");
		System.out.println("Quadrado");
		Quadrado q = new Quadrado(6.0, 6.0);
		System.out.println(q.calcularDiagonal());
		System.out.println("Retângulo");
		Retangulo r = new Retangulo(4.3, 7.5);
		System.out.println(r.calcularDiagonal());

	}

}
