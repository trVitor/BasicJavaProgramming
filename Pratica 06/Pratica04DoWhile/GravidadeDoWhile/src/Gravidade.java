import java.util.Scanner;

public class Gravidade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int confirmacao;
		do {
			System.out.println("PLANETAS: \n");

			System.out.println("[1]Merc�rio  | Gravidade: 3,7");
			System.out.println("[2]V�nus     | Gravidade: 8,8");
			System.out.println("[3]Terra     | Gravidade: 9,8");
			System.out.println("[4]Marte     | Gravidade: 3,8");
			System.out.println("[5]J�piter   | Gravidade: 26,4");
			System.out.println("[6]Saturno   | Gravidade: 11,5");
			System.out.println("[7]Urano     | Gravidade: 9,3 ");
			System.out.println("[8]Netuno    | Gravidade: 12,2");
			System.out.println("[9]Plut�o    | Gravidade: 0,6");

			System.out.print("\nEscolha um planeta para lan�ar a bola: ");
			int planeta = ler.nextInt();
			System.out.print("\nDigite a velocidade da bola: ");
			double v = ler.nextDouble();
			System.out.print("\nDigite o instante do lan�amento: ");
			double t = ler.nextDouble();

			if (planeta == 1) {
				double velocidade = v - (3.7 * t);
				double altura = v * t - (Math.pow((3.7 * t), 2) / 2);
				System.out.println("\nEm Merc�rio:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 2) {
				double velocidade = v - (8.8 * t);
				double altura = v * t - (Math.pow((8.8 * t), 2) / 2);
				System.out.println("\nEm V�nus:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 3) {
				double velocidade = v - (9.8 * t);
				double altura = (v * t) - (Math.pow((9.8 * t), 2) / 2);
				System.out.println("\nNa Terra:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 4) {
				double velocidade = v - (3.8 * t);
				double altura = v * t - (Math.pow((3.8 * t), 2) / 2);
				System.out.println("\nEm Marte:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 5) {
				double velocidade = v - (26.4 * t);
				double altura = v * t - (Math.pow((26.4 * t), 2) / 2);
				System.out.println("\nEm J�piter:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 6) {
				double velocidade = v - (11.5 * t);
				double altura = v * t - (Math.pow((11.5 * t), 2) / 2);
				System.out.println("\nEm Saturno:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 7) {
				double velocidade = v - (9.3 * t);
				double altura = v * t - (Math.pow((9.3 * t), 2) / 2);
				System.out.println("\nEm Urano:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 8) {
				double velocidade = v - (12.2 * t);
				double altura = v * t - (Math.pow((12.2 * t), 2) / 2);
				System.out.println("\nEm Netuno:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			if (planeta == 9) {
				double velocidade = v - (0.6 * t);
				double altura = v * t - (Math.pow((0.6 * t), 2) / 2);
				System.out.println("\nEm Plut�o:");
				System.out.printf("A velocidade foi: %.2f e a altura foi: %.2f", velocidade, altura);
			}
			System.out.println("\nVoc� deseja consultar novamente ?[1] SIM e [2] N�O");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();

	}

}
