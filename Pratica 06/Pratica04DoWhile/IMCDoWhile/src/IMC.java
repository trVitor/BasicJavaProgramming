import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int confirmacao;
		double peso = 0.0, altura = 0.0, calculo;

		do {
			System.out.print("Digite o seu peso: ");
			peso = ler.nextDouble();

			System.out.print("Digite a sua altura: ");
			altura = ler.nextDouble();

			calculo = (peso / (Math.pow(altura, 2)));

			if (calculo < 20) {
				System.out.printf("\nO seu IMC � de: %.2f voc� est� abaixo do seu peso favor�vel !!", calculo);
			}
			if (calculo >= 20 && calculo <= 25) {
				System.out.printf("\nO seu IMC � de: %.2f voc� est� dentro do seu peso normal!!", calculo);
			}
			if (calculo >= 25 && calculo <= 30) {
				System.out.printf("\nO seu IMC � de: %.2f voc� est� sobre peso normal!!", calculo);
			}
			if (calculo >= 30 && calculo <= 40) {
				System.out.printf("\nO seu IMC � de: %.2f voc� est� Obeso; CUIDADO!!!", calculo);
			}
			if (calculo > 40) {
				System.out.printf("\nO seu IMC � de: %.2f voc� est� com Obesidade M�rbida; PROCURE UM M�DICO!!",
						calculo);
			}
			System.out.println("\nVoc� deseja consultar novamente ?[1] SIM e [2] N�O");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}

}
