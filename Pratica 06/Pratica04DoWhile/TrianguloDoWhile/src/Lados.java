import java.util.Scanner;

public class Lados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double confirmacao, x = 0.0, y = 0.0, z = 0.0;
		do {
			System.out.println("Digite lado A do triângulo: ");
			x = ler.nextDouble();
			System.out.println("Digite lado B do triângulo: ");
			y = ler.nextDouble();
			System.out.println("Digite lado C do triângulo: ");
			z = ler.nextDouble();

			if (x < (y + z)) {

				if (y < (x + z))

					if (z < (y + x))
						System.out
								.println("\nOs valores digitados podem ser os comprimentos dos lados de um triângulo!");
			} else {
				System.out.println("\nOs valores digitados não podem ser os comprimentos dos lados de um triângulo!");
			}
			System.out.println("\nVocê deseja consultar novamente ?[1] SIM e [2] NÃO");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}
}
