package MaiorMenor;

import java.util.Arrays;
import java.util.Scanner;

public class MenorMaiorVetor {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {

			float num[] = new float[10], NumMaior=0, NumMenor=999;
			int i;
			for (i = 0; i < 5; i++) {
				System.out.println("Informe os n�meros desejados: ");
			num[i] = ler.nextFloat();
			
			if(num[i]>NumMaior) {
				NumMaior=num[i];				
			}if(num[i]<NumMenor) {
				NumMenor=num[i];
			}	
			}
			System.out.println("\n");
			for(i=0; i<5;i++) {
			System.out.println((i + 1) + "� Posi��o: " + Arrays.asList(num[i]));
			}
			System.out.println("\n");
			System.out.printf("O maior n�mero digitado �: %.2f e o menor n�mero digitado �:  %.2f", NumMaior , NumMenor);
			ler.close();
		}

	}
}