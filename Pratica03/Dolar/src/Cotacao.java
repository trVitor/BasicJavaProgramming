import java.util.Scanner;
public class Cotacao {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double CotDolar, ValorPossuido, calculo;
		
		
		System.out.println("Digite a cotação do dólar: ");
		CotDolar=ler.nextDouble();
		
		System.out.println("Digite o valor que possui em dólar: ");
		ValorPossuido=ler.nextDouble();
		
		calculo=(CotDolar*ValorPossuido);
		
		System.out.println("Este valor em Reais é de: R$" + calculo);
		
		ler.close();

	}

}
