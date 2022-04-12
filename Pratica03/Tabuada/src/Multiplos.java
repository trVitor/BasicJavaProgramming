import java.util.Scanner;
public class Multiplos {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n1=ler.nextDouble();
		
		for( int i = 0; i<=10; i++) {
			
			double calcular = n1 * i ;
		
			System.out.println(n1 + " x " + i + " = " + calcular);
		}

		
		
	}

}
