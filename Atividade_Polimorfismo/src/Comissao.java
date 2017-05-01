
public class Comissao extends Empregado {

	protected double percentualComissao;

	public Comissao(int tipo, double salario, double percentualComissao) {
		super(tipo, salario);
		this.percentualComissao = percentualComissao;
	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public void setValorAReceber() {
		super.setValorAReceber(super.getSalario() + (super.getSalario() * (getPercentualComissao() / 100)));
	}

	public String toString() {
		setValorAReceber();
		return super.toString() + "Percentual Comissao: " + getPercentualComissao() + "\nValor a Receber: "
				+ super.getValorAReceber();
	}

}
