import java.util.Scanner;
public class SalarioFunc {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double SalarioM, SalarioFunc, calculo;
		
		System.out.println("Digite o valor do s�lario m�nimo: ");
		SalarioM=ler.nextDouble();
		System.out.println("Digite o valor do seu s�lario: ");
		SalarioFunc=ler.nextDouble();
		
		calculo=(SalarioFunc/SalarioM);
		
		System.out.format("O funcion�rio recebe: %.2f",calculo, ", s�larios m�nimo.");
	
		ler.close();

	}

}
