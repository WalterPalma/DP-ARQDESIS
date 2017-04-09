package figuras_Geometricas;

public class Triangulo extends Poligono {
	
	public Triangulo(double base, double altura){
		super(base,altura);
	}
	
	@Override
	public double calcularArea(){
		return ((super.getBase() * super.getAltura()) / 2);
	}

}
