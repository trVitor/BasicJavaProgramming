/*Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: 
>= 7 -> Aprovado
< 7 -> Reprovado
*/
package aplicacao;
import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
	       
	       double n1=0.0, n2=0.0, media=0.0, soma=0.0;
	       
	       System.out.print("Digite a primeira nota: ");
	       n1=ler.nextDouble();
	       
	       System.out.print("Digite a segunda nota: ");
	       n2=ler.nextDouble();
	       
	       soma= n1+n2;
	       
	       media = soma/2;
	       	
	       if(media>=7) {
	    	   System.out.printf("\nO aluno está aprovado!!! \nCom a média de: %.2f" ,media);
	       }
	       if (media<7) {
	    	   System.out.printf("\nO aluno está reprovado!  \nCom a média de: %.2f" ,media);
	       }
	       
	       
	       ler.close();
		}
	}

