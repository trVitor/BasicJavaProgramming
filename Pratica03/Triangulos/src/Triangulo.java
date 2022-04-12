import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double COposto, CAdjacente, hipotenusa;
	
		System.out.println("Digite o valor do cateto oposto: ");
		COposto=ler.nextDouble();
		
		System.out.println("Digite o valor do cateto adjacente: ");
		CAdjacente=ler.nextDouble();
		
		hipotenusa=(Math.pow(COposto, 2) + (Math.pow(CAdjacente, 2)));

		System.out.format("A soma dos quadrados dos quadrado do cateto é igual à: %.2f", hipotenusa);
		 
		ler.close();
	}

}
