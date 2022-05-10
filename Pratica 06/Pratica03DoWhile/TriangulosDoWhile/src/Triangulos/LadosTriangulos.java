package Triangulos;
import java.util.Scanner;
public class LadosTriangulos {

	public static void main(String[] args) {

        Scanner ler= new Scanner(System.in);
		
		double COposto, CAdjacente, hipotenusa, confirmacao;
	
		do {
		System.out.println("Digite o valor do cateto oposto: ");
		COposto=ler.nextDouble();
		
		System.out.println("Digite o valor do cateto adjacente: ");
		CAdjacente=ler.nextDouble();
		
		hipotenusa=(Math.pow(COposto, 2) + (Math.pow(CAdjacente, 2)));

		System.out.format("A soma dos quadrados dos quadrado do cateto é igual à: %.2f", hipotenusa);
		 
		System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
		confirmacao=ler.nextDouble();

		}while(confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO!!");
		
		ler.close();		
	}

}
