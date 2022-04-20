import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);

       int[] numero = new int [10];
       int qnt =0, soma=0;
       
      
       for(int i=0; i<numero.length; i++) {
    	   System.out.println("Digite um número: ");
        numero[i] = ler.nextInt();
      	if(numero[i] % 2 == 0) {
        		 soma += numero[i];
        		 qnt++;
       }
       	  	
       }  
    	    for(int i=0; i<numero.length;i++) {
    	   if(numero[i] % 2 == 0) {
    	    System.out.printf("V[%d] = %2d\n " ,i, numero[i]);			   
	
    		   
	}
}
 		   System.out.println("A soma dos números pares é: " + soma);	

       }
	}

