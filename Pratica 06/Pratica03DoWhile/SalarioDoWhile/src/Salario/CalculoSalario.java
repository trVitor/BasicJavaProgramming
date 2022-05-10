package Salario;
import java.util.Scanner;
public class CalculoSalario {

	public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
		
		double salario, calculo, confirmacao;
		
		do {
		System.out.println("Digite o valor do seu salário: ");
	    salario=ler.nextDouble();
	    
	    calculo=(salario*0.25);
	    
	    double NovoSalario = (calculo + salario);
	    
	    System.out.println("O valor do aumento é de: " + calculo + ", o novo valor é de: " + NovoSalario);

	    System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
		confirmacao=ler.nextDouble();
		
		}while(confirmacao == 1);
		
		System.out.println("\nPROGRAMA FINALIZADO!!");
	    
	    ler.close();
		
	}

}
