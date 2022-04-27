
public class ContaCorrente {

	private int numero, agencia;
	private double saldo;

	public void inicializarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;
	}

	public double sacar(double valor) {
		if (saldo < valor)
			System.out.println("\nEsse valor não está disponivel!");
		else {
			saldo = saldo - valor;
			System.out.println("\nSaldo: " + saldo);
		}
		return saldo;
	}

	public double depositar(double valor) {
		return saldo = saldo + valor;
	}

	public double consultarSaldo(double saldo2) {
		return (saldo);
	}

	public double getSaldo() {
		return saldo;
	}

	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}

	public void Exibir() {
		System.out.println("O saldo  é " + saldo);

	}
}
