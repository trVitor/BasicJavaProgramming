import java.util.Scanner;

public class LadoTriangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int confirmacao;
		do {
			System.out.println("Digite o valor de um dos lados do triangulo: ");
			double ladoA = ler.nextDouble();
			System.out.println("Digite o segundo valor de um dos lados do triangulo: ");
			double ladoB = ler.nextDouble();
			System.out.println("Digite o terceiro valor de um dos lados do triangulo: ");
			double ladoC = ler.nextDouble();

			if (ladoA == ladoB && ladoA == ladoC) {
				System.out.println("\nEsse é um triangulo Equilátero!");
			} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
				System.out.println("\nEsse é um triangulo Isóceles!");
			} else {
				System.out.println("\nEsse é um triangulo Escaleno!");
			}
			System.out.println("\nVocê deseja consultar novamente ?[1] SIM e [2] NÃO");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}

}
