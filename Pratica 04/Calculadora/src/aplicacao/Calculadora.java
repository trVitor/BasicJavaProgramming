/*12. Fa�a um programa que solicite ao usu�rio que informe dois n�meros e que exiba o seguinte menu:
1 � Somar
2 � Subtrair 
3 � Multiplicar
4 � Dividir
5 � Sair
Em seguida, leia a op��o escolhida e exiba o resultado de acordo com a op��o.
*/
package aplicacao;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {

		Scanner ler= new Scanner(System.in);
		  
		double valor1=0, valor2=0, resultado=0;
		
		System.out.print("Digite um n�mero: ");
		valor1= ler.nextDouble();
		System.out.print("Digite outro n�mero: ");
		valor2= ler.nextDouble();
			
		
		System.out.println("\nPARA OS NUMEROS INFORMADOS, VOC� DESEJA? ");

		System.out.println("\n[1]Somar? ");
		System.out.println("[2]Subtrair? ");
		System.out.println("[3]Multiplicar? ");
		System.out.println("[4]Dividir?");
		System.out.println("[5]Sair.");
		
		System.out.print("\nInforme a Op��o desejada. \n");
		int opcao= ler.nextInt();
		 
			  switch (opcao) {
		case 1 :
			resultado = (valor1 + valor2);
			System.out.println("\nO resultado da opera��o �: " +resultado );
			break;
		case 2 :
			resultado = (valor1 - valor2);
			if(valor2>valor1) {
			resultado = (valor2 - valor1 );
			}
			System.out.println("\nO resultado da opera��o �: " +resultado);
			break;
		case 3 :
			resultado = (valor1 * valor2);
			System.out.println("\nO resultado da opera��o �: " +resultado);
			break;
		case 4 :
			if(valor2 == 0) {
				System.out.println("Impossivel dividir por 0.");
			} 
			else {
				
			resultado = (valor1 / valor2);
			System.out.println("\nO resultado da opera��o �: " +resultado);
			break;
			}
		case 5 :
			if(opcao==5) {
				System.out.println("PROGRAMA FINALIZADO.");
				System.exit(0);
			}
			
			
	    default:
	    System.out.println("\nOp��o inv�lida.");
		}
		
		ler.close();
		}


	}



