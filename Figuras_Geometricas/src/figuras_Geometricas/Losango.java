package figuras_Geometricas;

public class Losango extends Poligono {
	
	public Losango(double base, double altura){
		super(base,altura);
	}
	
	@Override
	public double calcularArea(){
		return ((super.getBase() * 2) + (super.getAltura() * 2));
	}

}
