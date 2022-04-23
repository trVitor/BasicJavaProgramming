/*Construa um programa para determinar se o indivíduo está com um peso favorável.
 *  Essa situação é determinada através do IMC (Índice de Massa Corpórea), 
 *  que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja,
IMC= PESO/ALTURA2
*/

package aplicacao;
import java.util.Scanner;
public class IndicieMassa {

	public static void main(String[] args) {

Scanner ler=new Scanner(System.in);
		
		double peso=0.0, altura=0.0, calculo;
		
		System.out.print("Digite o seu peso: ");
		peso=ler.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		altura=ler.nextDouble();
		
		calculo= (peso / (Math.pow(altura,2)));
		
		if(calculo<20) {
			System.out.printf("\nO seu IMC é de: %.2f você está abaixo do seu peso favorável !!", calculo);
		}
		if(calculo>=20 && calculo<=25) {
			System.out.printf("\nO seu IMC é de: %.2f você está dentro do seu peso normal!!", calculo);
	} 
        if(calculo>=25 && calculo<=30) {
        	System.out.printf("\nO seu IMC é de: %.2f você está sobre peso normal!!", calculo);
}   
        if(calculo>=30 &&calculo<=40) {
        	System.out.printf("\nO seu IMC é de: %.2f você está Obeso; CUIDADO!!!",calculo);
        }       
        if(calculo>40) {
        	System.out.printf("\nO seu IMC é de: %.2f você está com Obesidade Mórbida; PROCURE UM MÉDICO!!", calculo);
        }
ler.close();
	}

	}

