package Vendas;
import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Digite o codigo do produto:");
       int codigo = ler.nextInt();
       
       switch (codigo) {
       
       case 1:
    	   System.out.println("\nC�digo: 1"+
    	                     "\nProduto: SAPATO"+
    			             "\nPre�o: R$: 99,99");
    	   break;
       case 2:
    	   System.out.println("\nC�digo: 2"+
                   "\nProduto: Bolsa"+
		             "\nPre�o: R$: 103,89");
    	   break;
       case 3 :
    	   System.out.println("\nC�digo: 3"+
                   "\nProduto: Camisa"+
		             "\nPre�o: R$: 49,98");
          break;
       case 4 :
    	   System.out.println("\nC�digo: 4"+
                   "\nProduto: Cal�a"+
		             "\nPre�o: R$: 89,72");
          break;
       case 5 :
    	   System.out.println("\nC�digo: 5"+
                   "\nProduto: Blusa"+
		             "\nPre�o: R$: 97,35");	   
       
	 default:
		    System.out.println("\nOp��o inv�lida.");
			
	ler.close();
	}
}
}
