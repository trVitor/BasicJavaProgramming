package Calcular;

public class Fatorial {

	public double getResultado(int numero) throws NumeroNegativoException {
		if (numero < 0)
			throw new NumeroNegativoException(numero);
		
		double f = 1;

		for (int i = 1; i <= numero; i++) {
			f = f * i;
		}
		return f;
	}
}
