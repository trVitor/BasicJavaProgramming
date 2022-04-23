/*Construa um programa para determinar se o indiv�duo est� com um peso favor�vel.
 *  Essa situa��o � determinada atrav�s do IMC (�ndice de Massa Corp�rea), 
 *  que � definida como sendo a rela��o entre o peso (PESO � em kg) e o quadrado da Altura (ALTURA � em m) do indiv�duo. Ou seja,
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
			System.out.printf("\nO seu IMC � de: %.2f voc� est� abaixo do seu peso favor�vel !!", calculo);
		}
		if(calculo>=20 && calculo<=25) {
			System.out.printf("\nO seu IMC � de: %.2f voc� est� dentro do seu peso normal!!", calculo);
	} 
        if(calculo>=25 && calculo<=30) {
        	System.out.printf("\nO seu IMC � de: %.2f voc� est� sobre peso normal!!", calculo);
}   
        if(calculo>=30 &&calculo<=40) {
        	System.out.printf("\nO seu IMC � de: %.2f voc� est� Obeso; CUIDADO!!!",calculo);
        }       
        if(calculo>40) {
        	System.out.printf("\nO seu IMC � de: %.2f voc� est� com Obesidade M�rbida; PROCURE UM M�DICO!!", calculo);
        }
ler.close();
	}

	}

