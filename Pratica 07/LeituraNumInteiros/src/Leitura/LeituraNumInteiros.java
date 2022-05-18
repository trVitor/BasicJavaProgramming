package Leitura;

import java.util.Scanner;

public class LeituraNumInteiros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int num1=0, num2=0;
	
		System.out.println("Digite um número inteiro:");
	 num1 = ler.nextInt();
		System.out.println("Digite outro número inteiro:");
	 num2 = ler.nextInt();
	 

     for (;num1<=num2;num1++){
     System.out.print(+ num1 + " - ");
     }
	 
	 
	 
ler.close();
	}

}
