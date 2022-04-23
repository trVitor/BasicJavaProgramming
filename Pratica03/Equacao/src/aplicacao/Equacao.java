package aplicacao;
import java.util.Scanner;
public class Equacao {

	public static void main(String[] args) {

Scanner ler= new Scanner(System.in);
		
		double a, b, c,
		delta,
		sqrtdelta,
		raiz1, raiz2;
		
		//Recebendo os dados dos coeficientes.
		System.out.println("Resolvendo Equação do 2o grau: ax² + bx + c = 0 .\n");
		
		System.out.print("Digite um valor para 'a': ");
		a= ler.nextDouble();
		System.out.print("Digite outro valor para 'b': ");
		b= ler.nextDouble();
		System.out.print("Digite outro valor para 'c': ");
		c= ler.nextDouble();
		
			// recebendo o valor de delta e calculando a raiz quadrada
			delta= (b*b)-(4*a*c);
			sqrtdelta= Math.sqrt(delta);
			// se delta for menor que 0 não existe raiz real
			if(delta<0) {
				System.out.println("\nNão Existe Raiz Real");
			}
			//se delta for igual a 0 existe apenas uma raiz real
			if(delta==0) {
				raiz1=(-b)/(2*a);
				System.out.printf("\nA raiz real é de: %.2f", raiz1 );
			}
			//se a raiz de delta for maior q 0, as raizes sao reais
			if(delta>0) {
				raiz1=((-1)*b + sqrtdelta)/(2*a);
				raiz2=((-1)*b - sqrtdelta)/(2*a);
				System.out.printf("\nRaizes : %.2f e %.2f", raiz1, raiz2 );
			}
	

		else {	
		System.out.println("\nCoeficiente 'a' inválido. Não é uma equação de 2o grau");
	}
ler.close();
	}

	}


