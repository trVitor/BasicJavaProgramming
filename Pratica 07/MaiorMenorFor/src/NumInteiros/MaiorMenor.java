package NumInteiros;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {

			int num, numMaior = 0, numMenor=999 ;

			System.out.println("Informe a quantidade de números que deseja consultar:");
			int qntNum = ler.nextInt();

			for (int i = 0; i < qntNum; i++) {
				System.out.println("Informe um número:");
				num = ler.nextInt();

				if (num > numMaior) {
					numMaior = num;
				}if (num < numMenor) {
					numMenor = num;
				}
			}
			System.out.println(
					"\nO maior número registrado é: " + numMaior + "\nE o menor número registrado é: " + numMenor);
		}
	}
}
