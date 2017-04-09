package figuras_Geometricas;

public interface Diagonal {
	
	
default double calcularDiagonal(double base, double altura){		
	double total = Math.pow(base, 2) + Math.pow(altura, 2);
	return Math.sqrt(total); }
	
}
