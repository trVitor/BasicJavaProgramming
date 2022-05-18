package Calcular;

public class NumeroNegativoException extends Exception {
	private int numero;

	public NumeroNegativoException() {
		super("\nNumeros negativos n�o s�o permitidos!\n");
	}

	public NumeroNegativoException(int numero) {
		super("\nNumeros negativos n�o s�o permitidos!\n");
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
}
