package SalarioMinimo;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {

Scanner ler= new Scanner(System.in);
		
		double SalarioM, SalarioFunc, calculo, confirmacao;
		
		do {
		System.out.println("Digite o valor do sálario mínimo: ");
		SalarioM=ler.nextDouble();
		System.out.println("Digite o valor do seu sálario: ");
		SalarioFunc=ler.nextDouble();
		
		calculo=(SalarioFunc/SalarioM);
		
		System.out.format("O funcionário recebe: %.2f sálarios mínimo." , calculo);
	
		  System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
			confirmacao=ler.nextDouble();
			
			}while(confirmacao == 1);
			
			System.out.println("\nPROGRAMA FINALIZADO!!");
		
		ler.close();
		
	}

}
