package Multiplos;
import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) {

		
		Scanner ler= new Scanner(System.in);
		double confirmacao;
		
		do {
		System.out.println("Digite um número: ");
		double n1=ler.nextDouble();
		
		for( int i = 0; i<=10; i++) {
			
			double calcular = n1 * i ;
		
			System.out.println(n1 + " x " + i + " = " + calcular);
		}
		
			 System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
				confirmacao=ler.nextDouble();
		
				}while(confirmacao == 1);
	
				System.out.println("\nPROGRAMA FINALIZADO!!");
				ler.close();
	}

}

