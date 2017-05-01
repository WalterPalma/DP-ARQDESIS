import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
	
			int tipo;
			double salario;
			do {
				tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo"));
			} while (tipo < 1 || tipo > 5);

			salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário"));

			if (tipo == 1) {
				Empregado emp = new Empregado(tipo, salario);
				JOptionPane.showMessageDialog(null, emp.toString());
			} else if (tipo == 2) {
				// Comissao
				double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite Perc. Comissao"));
				Comissao com = new Comissao(tipo, salario, comissao);
				JOptionPane.showMessageDialog(null, com.toString());
			} else if (tipo == 3) {
				// Bonus por comissao
				double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite Perc. Comissao"));
				double bonus = Double.parseDouble(JOptionPane.showInputDialog("Digite Bonus"));
				Bonus bon = new Bonus(tipo, salario, bonus);
				double valor = bon.getSalario() + ((bon.getSalario() * (comissao / 100)) + bon.getBonus());
				JOptionPane.showMessageDialog(null,"Valor a Receber: " + valor);
			} else if (tipo == 4) {
				// bonus
				double bonus = Double.parseDouble(JOptionPane.showInputDialog("Digite Bonus"));
				Bonus bon = new Bonus(tipo, salario, bonus);
				JOptionPane.showMessageDialog(null, bon.toString());
			} else {
				// Atendimento
				int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite Numero de Atendimentos"));
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite Valor de Atendimento"));
				Atendimento atend = new Atendimento(tipo, salario, numero, valor);
				JOptionPane.showMessageDialog(null, atend.toString());
			}

	}

}
