import java.util.Scanner;
public class Cotacao {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double CotDolar, ValorPossuido, calculo;
		
		
		System.out.println("Digite a cota��o do d�lar: ");
		CotDolar=ler.nextDouble();
		
		System.out.println("Digite o valor que possui em d�lar: ");
		ValorPossuido=ler.nextDouble();
		
		calculo=(CotDolar*ValorPossuido);
		
		System.out.println("Este valor em Reais � de: R$" + calculo);
		
		ler.close();

	}

}
