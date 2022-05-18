package Calcular;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {

			int num;
			
			do {
				System.out.println("Digite um numero:");
				num = ler.nextInt();

				Fatorial f = new Fatorial();

				try {
					System.out.println("Resultado: " + f.getResultado(num));
				} catch (NumeroNegativoException e) {
					System.out.println(e.getStackTrace());
					System.out.println(e);
				}
			} while (true);
		}
	}
}