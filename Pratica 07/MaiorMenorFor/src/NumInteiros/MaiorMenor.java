package NumInteiros;

import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {

			int num, numMaior = 0, numMenor=999 ;

			System.out.println("Informe a quantidade de n�meros que deseja consultar:");
			int qntNum = ler.nextInt();

			for (int i = 0; i < qntNum; i++) {
				System.out.println("Informe um n�mero:");
				num = ler.nextInt();

				if (num > numMaior) {
					numMaior = num;
				}if (num < numMenor) {
					numMenor = num;
				}
			}
			System.out.println(
					"\nO maior n�mero registrado �: " + numMaior + "\nE o menor n�mero registrado �: " + numMenor);
		}
	}
}
