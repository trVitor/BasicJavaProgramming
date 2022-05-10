package Temperatura;
import java.util.Scanner;
public class CalculoTemp {

	public static void main(String[] args) {
      Scanner ler= new Scanner(System.in);
		
		double C, F, confirmacao;
		
		do {
		System.out.println("Digite a temperatura em Celsius: ");
		C=ler.nextDouble();
		
	    F=(C * 1.8) + 32;
		
		System.out.println("A temperatura que você digitou em Celsius é igual a: "+ F + " Fahrenheit !");

		 System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
			confirmacao=ler.nextDouble();
	
			}while(confirmacao == 1);

			System.out.println("\nPROGRAMA FINALIZADO!!");
			ler.close();		
	}

}
