package Calculo;
import java.util.Scanner;

public class Raio {

	public static void main(String[] args) {

		Scanner ler= new Scanner(System.in);
		
		double raio,confirmacao;
		
		do {
		System.out.println("Digite o raio: ");
		raio=ler.nextDouble();
		
		double C = 2 * Math.PI * raio;
		double A = Math.PI * Math.pow(raio, 2);
		double V = ((double) 3 / (double) 4) * Math.PI * Math.pow(raio, 3);
		
		System.out.format("O valor de C � de: %.2f. \nO valor de A � de: %.2f. \nO valor de V � de: %.2f", C, A, V);
		
		System.out.println("\nDeseja calcular novamente ? [1] Sim [2] N�o");
		confirmacao=ler.nextDouble();
		
		}while(confirmacao == 1);
		
		System.out.println("\nPROGRAMA FINALIZADO!!");
	ler.close();
	}

}
