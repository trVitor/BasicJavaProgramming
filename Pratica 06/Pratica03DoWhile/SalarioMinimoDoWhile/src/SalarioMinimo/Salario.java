package SalarioMinimo;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {

Scanner ler= new Scanner(System.in);
		
		double SalarioM, SalarioFunc, calculo, confirmacao;
		
		do {
		System.out.println("Digite o valor do s�lario m�nimo: ");
		SalarioM=ler.nextDouble();
		System.out.println("Digite o valor do seu s�lario: ");
		SalarioFunc=ler.nextDouble();
		
		calculo=(SalarioFunc/SalarioM);
		
		System.out.format("O funcion�rio recebe: %.2f s�larios m�nimo." , calculo);
	
		  System.out.println("\nDeseja calcular novamente ? [1] Sim [2] N�o");
			confirmacao=ler.nextDouble();
			
			}while(confirmacao == 1);
			
			System.out.println("\nPROGRAMA FINALIZADO!!");
		
		ler.close();
		
	}

}
