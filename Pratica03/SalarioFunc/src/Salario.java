import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double salario, calculo;
		
		System.out.println("Digite o valor do seu sal�rio: ");
	    salario=ler.nextDouble();
	    
	    calculo=(salario*0.25);
	    
	    double NovoSalario = (calculo + salario);
	    
	    System.out.println("O valor do aumento � de: " + calculo + ", o novo valor � de: " + NovoSalario);

	    ler.close();

	}

}
