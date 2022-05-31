package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) throws InputMismatchException {

		try (Scanner ler = new Scanner(System.in)) {
			ler.useLocale(Locale.US);
			Divisao d = new Divisao();
			boolean continueLoop = true;
			double num1 = 0.0, num2 = 0.0, resultado = 0.0;
			int opcao = 0;

			do {
				do {
					try {
						System.out.print("Digite um número: ");
						num1 = ler.nextDouble();
						System.out.print("Digite outro número: ");
						num2 = ler.nextDouble();
						System.out.print("\nPARA OS NÚMEROS INFORMADOS, VOCÊ DESEJA?" + "\n[1] SOMAR ? "
								+ "\n[2] SUBTRAIR ? " + "\n[3] MULTIPLICAR ?" + "\n[4] DIVIDIR ?" + "\n[5] SAIR \n");
						opcao = ler.nextInt();

						switch (opcao) {

						case 1:
							resultado = (num1 + num2);
							System.out.println("\nO resultado da SOMA é: \n" + resultado);
							break;

						case 2:
							resultado = (num1 - num2);
							System.out.println("\nO resultado da SUBTRAÇÃO é: \n" + resultado);
							break;

						case 3:
							resultado = (num1 * num2);
							System.out.println("\nO resultado da MULTIPLICAÇÃO é: \n" + resultado);
							break;

						case 4:
							try {
								System.out.println("Resultado: " + d.getResultado(num1, num2));
							} catch (DivisaoPorZero e) {
								System.out.println("\n");
								System.out.println(e.getStackTrace());
								System.out.println(e);
							}
							break;
						case 5:
							System.out.println("\nPROGRAMA FINALIZADO !!! ");
							break;
						default:
							System.out.println("\nEscolha Inválida, tente outra vez: \n");
						}
						continueLoop = false;

					} catch (InputMismatchException i) {
						System.out.println("\n" + i.getStackTrace()
								+ "\nNão é possível usar letras, apenas números, tente novamente: \n");
						ler.nextLine();
					}
				} while (continueLoop);
			} while (opcao != 5);

		}
	}
}
