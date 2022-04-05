/*1.	Receba três notas, calcule e apresente a média aritmética entre elas.*/
package aplicacao;
import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
		
		 
		System.out.print("Digite a primeira nota: ");
		double nota1= ler.nextInt();
		System.out.print("Digite a segunda nota: ");
		double nota2 = ler.nextInt();
		System.out.print("Digite a terceira nota: ");
		double nota3= ler.nextInt();

		 double media= (nota1 + nota2 + nota3)/3;
		 
		 System.out.printf("\nA media das notas é de: %.2f", media);
	
		 ler.close();	 


	}

}
