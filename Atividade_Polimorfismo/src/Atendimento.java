
public class Atendimento extends Empregado {

	protected int numeroAtendimento;
	protected double valorAtendimento;

	protected Atendimento(int tipo, double salario, int nAtendimento, double vAtendimento) {

		super(tipo, salario);
		this.numeroAtendimento = nAtendimento;
		this.valorAtendimento = vAtendimento;
	}

	public int getNumeroAtendimento() {
		return numeroAtendimento;
	}

	public void setNumeroAtendimento(int numeroAtendimento) {
		this.numeroAtendimento = numeroAtendimento;
	}

	public double getValorAtendimento() {
		return valorAtendimento;
	}

	public void setValorAtendimento(double valorAtendimento) {
		this.valorAtendimento = valorAtendimento;
	}

	public void setValorAReceber() {
		super.setValorAReceber(getValorAtendimento() * getNumeroAtendimento());
	}

	public String toString() {
		setValorAReceber();
		return super.toString() + "Numero Atendimento: " + getNumeroAtendimento() + "\nValor Atendimento: "
				+ getValorAtendimento() + "\nValor A Receber: " + super.getValorAReceber() + "\n";
	}

}
