import java.util.Scanner;
public class SalarioFunc {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double SalarioM, SalarioFunc, calculo;
		
		System.out.println("Digite o valor do sálario mínimo: ");
		SalarioM=ler.nextDouble();
		System.out.println("Digite o valor do seu sálario: ");
		SalarioFunc=ler.nextDouble();
		
		calculo=(SalarioFunc/SalarioM);
		
		System.out.format("O funcionário recebe: %.2f",calculo, ", sálarios mínimo.");
	
		ler.close();

	}

}
