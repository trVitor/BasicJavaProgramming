package Calcular;

public class NumeroNegativoException extends Exception {
	private int numero;

	public NumeroNegativoException() {
		super("\nNumeros negativos não são permitidos!\n");
	}

	public NumeroNegativoException(int numero) {
		super("\nNumeros negativos não são permitidos!\n");
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
}
