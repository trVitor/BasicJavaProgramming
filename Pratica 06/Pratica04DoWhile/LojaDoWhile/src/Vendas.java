import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int confirmacao;
		do {
			System.out.println("Digite o codigo do produto:");
			int codigo = ler.nextInt();

			switch (codigo) {

			case 1:
				System.out.println("\nCódigo: 1" + "\nProduto: SAPATO" + "\nPreço: R$: 99,99");
				break;
			case 2:
				System.out.println("\nCódigo: 2" + "\nProduto: Bolsa" + "\nPreço: R$: 103,89");
				break;
			case 3:
				System.out.println("\nCódigo: 3" + "\nProduto: Camisa" + "\nPreço: R$: 49,98");
				break;
			case 4:
				System.out.println("\nCódigo: 4" + "\nProduto: Calça" + "\nPreço: R$: 89,72");
				break;
			case 5:
				System.out.println("\nCódigo: 5" + "\nProduto: Blusa" + "\nPreço: R$: 97,35");
               break;
			default:
				System.out.println("\nOpçăo inválida.");
			}
			System.out.println("\nVocê deseja consultar novamente ?[1] SIM e [2] NÃO");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}
}
