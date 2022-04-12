import java.util.Scanner;
public class GrausCelsius {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double C, F;
		
		System.out.println("Digite a temperatura em Celsius: ");
		C=ler.nextDouble();
		
	    F=(C * 1.8) + 32;
		
		System.out.println("A temperatura que você digitou em Celsius é igual a: "+ F + " Fahrenheit !");

		ler.close();

	}

}
