/* Dados tr�s valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um tri�ngulo.
  Se eles n�o formarem um tri�ngulo escrever uma mensagem. 
 Considerar que o comprimento de cada lado de um tri�ngulo � menor que a soma dos outros dois lados.*/
package aplicacao;
import java.util.Scanner;
public class Lados {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);

		double x=0.0, y=0.0, z=0.0;
		
		System.out.println("Digite lado A do tri�ngulo: ");
		x=ler.nextDouble();
		System.out.println("Digite lado B do tri�ngulo: ");
        y=ler.nextDouble();
		System.out.println("Digite lado C do tri�ngulo: ");
        z=ler.nextDouble();
        
        if(x<(y+z)) {
        	
        	if(y<(x+z)) 
        		
        		if(z<(y+x))  
        			System.out.println("\nOs valores digitados podem ser os comprimentos dos lados de um tri�ngulo!");
        }else { 
        			System.out.println("\nOs valores digitados n�o podem ser os comprimentos dos lados de um tri�ngulo!");       		
        }      
        ler.close();   	
        }

	}
