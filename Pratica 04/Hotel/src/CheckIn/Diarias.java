package CheckIn;
import java.util.Scanner;
public class Diarias {

	public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
	
      System.out.println("Informe o n�mero de di�rias: ");
      double diaria= ler.nextDouble();
      
      double valorDiaria=500.00;
      
      if (diaria < 15) {
    	  double taxa=15.00*diaria;
    	  double total = (valorDiaria*diaria)+taxa;
    	  System.out.println("\nO valor a ser pago � de: "+ total );
      }if(diaria == 15) {
    	  double taxa =10.00*diaria;
    	  double total = (valorDiaria*diaria)+taxa;
    	  System.out.println("\nO valor a ser pago � de: "+ total);
      }else if(diaria > 15) {
    	  double taxa = 5.00*diaria;
    	  double total = (valorDiaria*diaria)+taxa;
    	  System.out.println("\nO valor a ser pago � de: " + total);
      }
      
      ler.close();
	}

}
