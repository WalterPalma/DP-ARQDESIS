
public class Bonus extends Empregado {

	protected double bonus;

	public Bonus(int tipo, double salario, double bonus) {
		super(tipo, salario);
		this.setValorAReceber(valorAReceber);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void setValorAReceber(){
		super.setValorAReceber(super.getSalario() + getBonus());
	}
	
	public String toString(){
		setValorAReceber();
		return super.toString() + "Bonus: " + getBonus() + "\nValor a Receber: " + super.getValorAReceber() + "\n";
	}

}
