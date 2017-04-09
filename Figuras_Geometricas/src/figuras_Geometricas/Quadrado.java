package figuras_Geometricas;

public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(double base, double altura){
		super(base,altura);
	}
	
	@Override
	public double calcularArea(){		
		return ((super.getBase() * 2) + (super.getAltura() * 2)); 		
	}

	public double calcularDiagonal() {
		return Diagonal.super.calcularDiagonal(super.getBase(), super.getAltura());
	}


	
}
