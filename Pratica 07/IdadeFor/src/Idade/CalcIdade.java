package Idade;

import java.util.Scanner;

public class CalcIdade {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {

			int idade = 0, cont = 0;
			double soma = 0, media = 0;

			for (int i = 0; i >= 0; i++) {
				System.out.println("Digite sua idade: ");
				idade = ler.nextInt();
				if (idade <= 0) {

					System.out.println("A média das idades informadas é de: " + media);
					System.exit(0);
				}
				soma = soma + idade;
				cont++;

				media = soma / cont;
			}
			System.out.println("A média das idades informadas é de: " + media);

		}
	}
}
