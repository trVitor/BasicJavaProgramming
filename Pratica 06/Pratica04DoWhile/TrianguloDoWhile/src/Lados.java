import java.util.Scanner;

public class Lados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double confirmacao, x = 0.0, y = 0.0, z = 0.0;
		do {
			System.out.println("Digite lado A do tri�ngulo: ");
			x = ler.nextDouble();
			System.out.println("Digite lado B do tri�ngulo: ");
			y = ler.nextDouble();
			System.out.println("Digite lado C do tri�ngulo: ");
			z = ler.nextDouble();

			if (x < (y + z)) {

				if (y < (x + z))

					if (z < (y + x))
						System.out
								.println("\nOs valores digitados podem ser os comprimentos dos lados de um tri�ngulo!");
			} else {
				System.out.println("\nOs valores digitados n�o podem ser os comprimentos dos lados de um tri�ngulo!");
			}
			System.out.println("\nVoc� deseja consultar novamente ?[1] SIM e [2] N�O");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}
}
