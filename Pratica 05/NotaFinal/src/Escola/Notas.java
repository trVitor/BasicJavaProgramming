package Escola;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		
		int faltas=0;
		double notas=0, contApr=0,contRep=0,
		notaMaior=0,notaMenor=0,
		contAlunos=0, mediaNotas=0, media=0;
		
		
		while (notas >= 0) 	{
		
		System.out.print("Digite a nota final: ");
		notas=ler.nextDouble();	 
		contAlunos++;
	
        System.out.print("Digite quantidade de faltas: ");
		faltas=ler.nextInt();
		
       if(notas>=90) {
		contApr++;
       }
        if(notas<70 || faltas >=20) {
        	contRep++;
        }
		if(notas>notaMaior) {
			notaMaior=notas;
		}if(notas<notaMenor) {
			notaMenor=notas;
		}
		
		mediaNotas = mediaNotas + notas;
	 	  
	   media = (mediaNotas/contAlunos);
			}
		System.out.println("\nA quantidade de alunos com notas maior ou igual a 90 é de: "+contApr);
		System.out.println("A quantidade de alunos com notas menor que 70 e ou faltas acima de 20 é de: "+contRep);
		System.out.printf("\nA maior nota registrada é: %.2f e a menor nota registrada é: %.2f",notaMaior, notaMenor);
		System.out.println("\nA média de notas da turma é de: " +media);
		
	ler.close();		
	
}
}
