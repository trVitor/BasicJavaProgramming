package aplicacao;

public class DivisaoPorZero extends ArithmeticException {

	private static final long serialVersionUID = 1L;
	private double numero, numero2;

	

	public DivisaoPorZero(double numero, double numero2) {
		super("\nDivisão por zero não existe..! Tente novamente: \n");
		this.numero = numero;
		this.numero2 = numero2;
	}

	public double getNumero() {
		return numero;
	}
	public double getNumero2() {
		return numero2;
	}
}
