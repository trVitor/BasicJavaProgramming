package Apartamento;
import java.util.Scanner;
public class Aluguel {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		System.out.println("Informe a quantidade de dias que esteve hospedado: ");
		int diaria = ler.nextInt();
		System.out.println("Informe o tipo de Hospedagem: [1] Apt Simple ou [2] Apt Duplo");
		int quarto = ler.nextInt();
		
		switch(quarto) {
		
		case 1:
		  if(diaria<10) {
			  double total = diaria*100.00;
			  System.out.println("\nO valor total a ser pago � de R$ "+ total);
		  }if(diaria>=10 && diaria<=15) {
			  double total = diaria*90.00;
			  System.out.println("\nO valor total a ser pago � de R$ "+ total);
		  }if(diaria> 15) {
			  double total = diaria*80.00;
			  System.out.println("\nO valor total a ser pago � de R$ "+ total);
		  }
		break;
		
		case 2:
			if(diaria<10) {
				double total = diaria*140.00;
				System.out.println("\nO valor total a ser pago � de R$ "+total);
			}if(diaria>=10 && diaria <=15) {
				double total = diaria*120.00;
				System.out.println("\nO valor total a ser pago � de R$ "+ total);
			}if(diaria>15) {
				double total = diaria*100.00;
				System.out.println("\nO valor total a ser pago � de R$ "+ total);
			}	
			break;
		}
	}
}
