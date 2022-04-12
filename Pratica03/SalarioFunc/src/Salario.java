import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double salario, calculo;
		
		System.out.println("Digite o valor do seu salário: ");
	    salario=ler.nextDouble();
	    
	    calculo=(salario*0.25);
	    
	    double NovoSalario = (calculo + salario);
	    
	    System.out.println("O valor do aumento é de: " + calculo + ", o novo valor é de: " + NovoSalario);

	    ler.close();

	}

}
