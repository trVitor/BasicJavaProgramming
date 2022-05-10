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
				System.out.println("\nEsse � um triangulo Equil�tero!");
			} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
				System.out.println("\nEsse � um triangulo Is�celes!");
			} else {
				System.out.println("\nEsse � um triangulo Escaleno!");
			}
			System.out.println("\nVoc� deseja consultar novamente ?[1] SIM e [2] N�O");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}

}
