package VetorNegativo;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {

			
			float num[] = new float[10];
			int i=0;
			for (i = 0; i <10; i++) {
				System.out.print("Informe um n�mero: " + (i + 1) + "�: ");
				num[i] = ler.nextFloat();
			}
			System.out.print("\n");
			for (i = 0; i < 10; i++) {
				if (num[i] < 0) {
					System.out.println((i + 1) + "� Posi��o: " + Arrays.asList(num[i]) + " Vetor com N�mero Negativo");
				}else if (num[i]>=0){System.out.println((i + 1) + "� Posi��o: " + Arrays.asList(num[i]));
				}
			}
		}
	}
	}
