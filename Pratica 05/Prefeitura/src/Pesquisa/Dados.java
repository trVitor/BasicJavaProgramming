package Pesquisa;
import java.util.Scanner;
public class Dados {

	public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
		
       double salario=1, filhos=0, mediaS, mediaF,
    		  totalSalario=0,totalFilhos=0,cont=0;
		
		while(salario > 0 ) {
			
			System.out.println("Digite a quantidade de filhos que possui: ");
			filhos=ler.nextDouble();
			System.out.println("Digite o valor do seu sal�rio: ");
			salario=ler.nextDouble();
			if(salario>-1) {totalSalario=totalSalario+salario;
		totalFilhos=totalFilhos+filhos; cont++;}
			else {
				System.out.println("\nLeitura FINALIZADA");}
			}
	
		mediaS=totalSalario/cont;
		mediaF=totalFilhos/cont;
		
			System.out.println ("\n---------------------------------------------------------------");
			System.out.printf ("\nA media do sal�rio da popula��o � R$ %.2f", mediaS);
            System.out.printf ("\nA media do n�mero dos filhos � %.2f\n", mediaF);
		
	
		
	ler.close();	
	}

}
