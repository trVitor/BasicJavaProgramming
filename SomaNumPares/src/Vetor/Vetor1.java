package Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
	try (Scanner ler = new Scanner(System.in)){

		float num[] = new float[10];
		int i;
		float soma = 0;
		for (i = 0; i < 10; i++) {
			System.out.print("Informe um n�mero " + (i + 1) + "�: ");
			num[i] = ler.nextFloat();

			if (num[i] % 2 == 0) {
				soma = soma + num[i];
			}
		}
		System.out.print("\n");
		for (i = 0; i < 10; i++) {
			if (num[i] % 2 == 0) {
				System.out.println((i + 1) + "� Vetor" + Arrays.asList(num[i])+" Vetor com N�mero Par");
			} else {
				System.out.println((i + 1) + "� Vetor" + Arrays.asList(num[i]));
			}
		}
		System.out.println("\nSoma dos n�meros pares = " + soma);

	}
}
}