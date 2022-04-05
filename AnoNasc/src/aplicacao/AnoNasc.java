/**Receba o ano de nascimento de uma pessoa, o ano atual e imprima:
a.	A idade da pessoa no ano atual.
b.	A idade que a pessoa terá em 2050.
*/

package aplicacao;
import java.util.Scanner;
public class AnoNasc {

	public static void main(String[] args) {

		Scanner ler= new Scanner (System.in);
		
		int AnoNasc, AnoAtual, AnoFut, idade;
		
		System.out.print("Digite o Ano de Nascimento: ");
		AnoNasc= ler.nextInt();
		
		System.out.print("Digite o ano atual: ");
	    AnoAtual= ler.nextInt();
		
		idade= (AnoAtual - AnoNasc);
		
		System.out.println("\nA idade atual é de: " + idade + " anos.");
		
		AnoFut= (2050 - AnoNasc);
		
		System.out.println("Você terá " + AnoFut + " anos em 2050.");

ler.close();
	}

}
