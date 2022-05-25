import java.util.Scanner;
import java.util.Arrays;

public class Matriz1 {

	int TAMANHO = 2;
	int[][] matriz = new int[TAMANHO][TAMANHO];

	public void ler() {
		try (Scanner ler = new Scanner(System.in)) {
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.println("Informe um numero:");
					matriz[i][j] = ler.nextInt();
				}
			}
		}
	}

	public void imprimir() {
		System.out.println("Matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(Arrays.asList(matriz[i][j]) + "  ");
			}
			System.out.println();
		}
	}

	public void diagonalPrincipal() {
		System.out.println("Diagonal Principal:");

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.asList(matriz[i][i]) + "   ");
		}
	}

	public void diagonalSecundaria() {
		System.out.println("Diagonal Secundaria:");

		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.asList(matriz[i][TAMANHO - 1 - i]) + "   ");
		}
	}

	public void modificar() {
		System.out.println("Diagonais Trocadas:");

		int temp;
		for (int i = 0; i < matriz.length; i++) {
			temp = matriz[i][i];
			matriz[i][i] = matriz[i][TAMANHO - 1 - i];
			matriz[i][TAMANHO - 1 - i] = temp; 
		}
	}
}
