package figuras_Geometricas;

public class Circulo extends Figura{
	
	protected double raio;
	
	public Circulo(double raio) {
		this.raio = raio;		
	}
	@Override
	public double calcularArea() {
		return (Math.PI * (Math.pow(raio, 2)));
	}

}
