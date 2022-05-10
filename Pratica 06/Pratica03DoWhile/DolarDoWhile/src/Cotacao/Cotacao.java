package Cotacao;
import java.util.Scanner;
public class Cotacao {

	public static void main(String[] args) {
       Scanner ler= new Scanner(System.in);
		
       double CotDolar, ValorPossuido, calculo,confirmacao;
		
		do {
		System.out.println("Digite a cotação do dólar: ");
		CotDolar=ler.nextDouble();
		
		System.out.println("Digite o valor que possui em dólar: ");
		ValorPossuido=ler.nextDouble();
		
		calculo=(CotDolar*ValorPossuido);
		
		System.out.println("Este valor em Reais é de: R$" + calculo);
		
		System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
		confirmacao=ler.nextDouble();
		
		}while(confirmacao == 1);
		
		System.out.println("\nPROGRAMA FINALIZADO!!");
		
		ler.close();
	}

}
