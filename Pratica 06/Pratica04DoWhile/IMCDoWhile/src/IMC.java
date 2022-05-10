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
				System.out.printf("\nO seu IMC é de: %.2f você está abaixo do seu peso favorável !!", calculo);
			}
			if (calculo >= 20 && calculo <= 25) {
				System.out.printf("\nO seu IMC é de: %.2f você está dentro do seu peso normal!!", calculo);
			}
			if (calculo >= 25 && calculo <= 30) {
				System.out.printf("\nO seu IMC é de: %.2f você está sobre peso normal!!", calculo);
			}
			if (calculo >= 30 && calculo <= 40) {
				System.out.printf("\nO seu IMC é de: %.2f você está Obeso; CUIDADO!!!", calculo);
			}
			if (calculo > 40) {
				System.out.printf("\nO seu IMC é de: %.2f você está com Obesidade Mórbida; PROCURE UM MÉDICO!!",
						calculo);
			}
			System.out.println("\nVocê deseja consultar novamente ?[1] SIM e [2] NÃO");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}

}
