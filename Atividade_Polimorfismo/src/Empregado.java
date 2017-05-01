
public class Empregado {

	protected int tipo;
	protected double salario;
	protected double valorAReceber;

	public Empregado(int tipo, double salario) {
		this.tipo = tipo;
		this.salario = salario;
	}

	// getters/setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getValorAReceber() {
		return valorAReceber;
	}

	public void setValorAReceber(double valorAReceber) {
		this.valorAReceber = valorAReceber;
	}
	
	public String toString(){
		return "Tipo: " + getTipo() + "\nSalario: " + getSalario() + "\n";
	}

}
