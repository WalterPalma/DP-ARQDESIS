package figuras_Geometricas;

public class Retangulo extends Poligono implements Diagonal{
	
	public Retangulo(double base, double altura){
		super(base,altura);
	}
	
	@Override
	public double calcularArea(){
		return(super.getBase() * super.getAltura());
	}
	

	public double calcularDiagonal() {
		return Diagonal.super.calcularDiagonal(super.getBase(), super.getAltura());
	}
}
