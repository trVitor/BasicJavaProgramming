/* Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo.
  Se eles não formarem um triângulo escrever uma mensagem. 
 Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.*/
package aplicacao;
import java.util.Scanner;
public class Lados {

	public static void main(String[] args) {
	
		Scanner ler= new Scanner(System.in);

		double x=0.0, y=0.0, z=0.0;
		
		System.out.println("Digite lado A do triãngulo: ");
		x=ler.nextDouble();
		System.out.println("Digite lado B do triãngulo: ");
        y=ler.nextDouble();
		System.out.println("Digite lado C do triãngulo: ");
        z=ler.nextDouble();
        
        if(x<(y+z)) {
        	
        	if(y<(x+z)) 
        		
        		if(z<(y+x))  
        			System.out.println("\nOs valores digitados podem ser os comprimentos dos lados de um triângulo!");
        }else { 
        			System.out.println("\nOs valores digitados não podem ser os comprimentos dos lados de um triângulo!");       		
        }      
        ler.close();   	
        }

	}
