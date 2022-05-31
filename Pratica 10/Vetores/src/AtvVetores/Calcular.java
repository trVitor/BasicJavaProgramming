package AtvVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Calcular {

	float num[] = new float[5], NumMaior = 0, NumMenor = 999;

	public void lerEntrada() {
		try (Scanner ler = new Scanner(System.in)) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe os números desejados: ");
				num[(int) i] = ler.nextFloat();
			}
		}
	}

	public void imprimirVetor() {
		System.out.println("\nPosições do Vetor: ");
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "º Posição: " + Arrays.asList(num[i]));
		}
	}

	public void somaNumerosPares() {
		float soma = 0;
		System.out.println("\nSoma dos Números Pares:");

		for (int i = 0; i < 5; i++) {
			if (num[i] % 2 == 0) {
				soma = soma + num[i];			
				System.out.println((i + 1) + "º Vetor" + Arrays.asList(num[i]) + " - Vetor com Número Par.");			
			}
		}
		System.out.println("\nSoma dos números pares = " + soma);
	}

	public void posicaoNumeroNegativo() {
		System.out.println("\nPosição Números Negativos: ");
		for (int i = 0; i < 5; i++) {
			if (num[i] < 0) {
				System.out.println((i + 1) + "º Posição: " + Arrays.asList(num[i]) + " - Vetor com Número Negativo.");
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
		System.out.println("\nMostra o Maior e o Menor Número Digitado: ");
		System.out.printf("O maior número digitado é: %.2f e o menor número digitado é:  %.2f", NumMaior, NumMenor);
	}

}
