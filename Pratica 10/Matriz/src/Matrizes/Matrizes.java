package Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
	int TAMANHO = 5;
	int[][] matriz = new int[TAMANHO][TAMANHO];

	public void lerNumerosMatrizes() {
		try (Scanner ler = new Scanner(System.in)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print("Informe um numero: ");
					matriz[i][j] = ler.nextInt();
				}
			}
		}
	}

	public void imprimirMatrix5x5() {
		System.out.println("");
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(Arrays.asList(matriz[i][j]) + "  ");
			}
			System.out.println();
		}
	}

	public void mostrarLinhaParColunaImpar() {
		System.out.println("\nLinhaParColunaImpar:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i % 2 == 0) {
				}
				if (j % 2 == 1) {
					System.out.println(Arrays.asList(matriz[i][j]) + " ");
				}
			}
		}
	}

	public void mostrarMatrizTransposta() {
		System.out.println("\nMatrizTransposta:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(Arrays.asList(matriz[j][i]) + "  ");
			}
		}
		System.out.println("\n");
	}

	public void mostrarDiagonalPrincipal() {
		System.out.println("Diagonal Principal:");

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.asList(matriz[i][i]) + "   ");
		}
	}

	public void mostrarDiagonalSecundaria() {
		System.out.println("Diagonal Secundaria:");

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.asList(matriz[i][TAMANHO - 1 - i]) + "   ");
		}
	}

	public void matrizModificada() {
		System.out.println("Matriz com Diagonais Trocadas:");

		int temp;
		for (int i = 0; i < matriz.length; i++) {
			temp = matriz[i][i];
			matriz[i][i] = matriz[i][TAMANHO - 1 - i];
			matriz[i][TAMANHO - 1 - i] = temp;
		}
	}

}
