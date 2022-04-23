/*Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:*/
package aplicacao;
import java.util.Scanner;
public class Media2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
        double n1=0.0, n2=0.0, n3=0.0, soma=0.0;
		double media=0.0;
		System.out.print("Digite a primeira nota: ");
		n1= ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
        n2= ler.nextDouble();		
		System.out.print("Digite a terceira nota: ");
		n3= ler.nextDouble();
		
		soma=(n1 + n2 + n3);
		
		media=(soma / 3);
		
		if(media >=0 && media<3){
			System.out.printf("O aluno está reprovado! \nCom a média de: %.2f", media);
		}
	     if(media>=3 && media<7) {
			System.out.printf( "\nO aluno precisa fazer o exame de recuperação, pois está com a média de: %.2f",media );
		}
	     if(media>=7 && media<=10) {
			System.out.printf("\nO aluno está aprovado com méritos, com a média de: %.2f", media);
		}
     ler.close();
	}
	
	}
