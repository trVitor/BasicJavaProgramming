package NumeroInteiros;

import java.util.Scanner;

public class NumerosInteirosFor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double soma = 0, x, y;

		System.out.println("Digite um número inteiro:");
		int num1 = ler.nextInt();
		System.out.println("Digite outro número inteiro:");
		int num2 = ler.nextInt();

		if (num1 % 2 != 0) {
			num1 += 1;
		}
		if (num1 % 2 == 0) {
			System.out.println(num1);
			if (num2 % 2 != 0) {
				num2 -= 1;
			}
			for (; num1 < num2; num1 += 2) {
				x = (num1 + 2);
				soma += num1;
				System.out.println(x);

			}
			soma += num1;
			System.out.println("\nA soma dos numeros pares do intervalo : " + soma);
		} else {
			System.out.println(num1);
			num1 += 1;
			System.out.println(num1);
			if (num2 % 2 != 0) {
				num2 -= 1;

				if (num1 % 2 == 0) {
					for (; num1 < num2; num1 += 2) {
						x = (num1 + num2);
						soma += num1;
						System.out.println(x);
					}
					soma += num1;
					System.out.println("\nA soma dos numeros pares do intervalo : " + soma);
				}
			}
		}
		ler.close();
	}

}
