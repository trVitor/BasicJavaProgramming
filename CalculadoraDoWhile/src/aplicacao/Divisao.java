package aplicacao;

public class Divisao {

	double numero, numero2;

	public double getResultado(double numero, double numero2) throws DivisaoPorZero {
		if (numero != 0) {
			if(numero2 !=0) {
				return numero/numero2;
			}else
			throw new DivisaoPorZero(numero, numero2);			
		}
		double d = 1;

		for (int i = 1; i <= numero; i++) {
			d = d * i;
		}
		return d;
		}
}
