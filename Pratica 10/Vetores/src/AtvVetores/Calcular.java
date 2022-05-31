package AtvVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Calcular {

	float num[] = new float[5], NumMaior = 0, NumMenor = 999;

	public void lerEntrada() {
		try (Scanner ler = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe os n�meros desejados: ");
				num[(int) i] = ler.nextFloat();
			}
		}
	}

	public void imprimirVetor() {
		System.out.println("\nPosi��es do Vetor: ");
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "� Posi��o: " + Arrays.asList(num[i]));
		}
	}

	public void somaNumerosPares() {
		float soma = 0;
		System.out.println("\nSoma dos N�meros Pares:");

		for (int i = 0; i < 5; i++) {
			if (num[i] % 2 == 0) {
				soma = soma + num[i];			
				System.out.println((i + 1) + "� Vetor" + Arrays.asList(num[i]) + " - Vetor com N�mero Par.");			
			}
		}
		System.out.println("\nSoma dos n�meros pares = " + soma);
	}

	public void posicaoNumeroNegativo() {
		System.out.println("\nPosi��o N�meros Negativos: ");
		for (int i = 0; i < 5; i++) {
			if (num[i] < 0) {
				System.out.println((i + 1) + "� Posi��o: " + Arrays.asList(num[i]) + " - Vetor com N�mero Negativo.");
			}
		}
	}

	public void mostraMaioreMenorNumero() {
		for (int i = 0; i < 5; i++) {
			if (num[i] > NumMaior) {
				NumMaior = num[i];
			}
			if (num[i] < NumMenor) {
				NumMenor = num[i];
			}
		}
		System.out.println("\nMostra o Maior e o Menor N�mero Digitado: ");
		System.out.printf("O maior n�mero digitado �: %.2f e o menor n�mero digitado �:  %.2f", NumMaior, NumMenor);
	}

}
