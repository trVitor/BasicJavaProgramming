/*1. Fa�a um programa que solicite ao usu�rio que informe a matr�cula e as tr�s notas de um conjunto de alunos. 
  O programa dever� exibir a mensagem informando se o aluno foi aprovado (m�dia maior ou igual a 70), 
  exame (nota maior ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). 
  O programa ir� terminar quando o usu�rio informar uma matr�cula negativa. */
package aplicacao;
import java.util.Scanner;
public class Matricula {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);

		String nome="";
		int matricula=0;
		double n1=0.0, n2=0.0, n3=0.0, media=0.0;
			
		while(matricula >= 0) {

		System.out.print("Digite o nome do Aluno: ");
		nome=ler.next();
		 
		System.out.print("\nDigite sua matricula: ");
		matricula=ler.nextInt();
		
		 if (matricula <=0) {
			 System.out.println("\nPROGRAMA FINALIZADO!!");
			 System.exit(0);
		 }
		
		System.out.print("\nDigite a primeira nota: ");
		n1=ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2=ler.nextDouble();
		System.out.print("Digite a terceira nota: ");
		n3=ler.nextDouble();
		
		media= (n1+n2+n3)/3;
		
			if(media>=70) {
		System.out.printf("\nO aluno(a) %s est� aprovado com a m�dia de: %.2f\n\n", nome, media);
			}
			if (media>=60 && media<70) {
				System.out.printf("\nO aluno(a) %s obteve, %.2f de m�dia, e n�o suficiente para passar, \nnecessita fazer exame!! \n\n", nome, media);
        	}
	        if (media<60) {
	    		System.out.printf("\nO aluno(a) %s foi reprovado com a m�dia de %.2f!! \n\n", nome, media);
	        }
		}	
		
	ler.close();
	}
}