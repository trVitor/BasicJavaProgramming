import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double confirmacao, n1 = 0.0, n2 = 0.0, n3 = 0.0, soma = 0.0;
		double media = 0.0;
		do {
			System.out.print("Digite a primeira nota: ");
			n1 = ler.nextDouble();
			System.out.print("Digite a segunda nota: ");
			n2 = ler.nextDouble();
			System.out.print("Digite a terceira nota: ");
			n3 = ler.nextDouble();

			soma = (n1 + n2 + n3);

			media = (soma / 3);

			if (media >= 0 && media < 3) {
				System.out.printf("O aluno est� reprovado! \nCom a m�dia de: %.2f", media);
			}
			if (media >= 3 && media < 7) {
				System.out.printf("\nO aluno precisa fazer o exame de recupera��o, pois est� com a m�dia de: %.2f",
						media);
			}
			if (media >= 7 && media <= 10) {
				System.out.printf("\nO aluno est� aprovado com m�ritos, com a m�dia de: %.2f", media);
			}
			System.out.println("\nVoc� deseja consultar novamente ?[1] SIM e [2] N�O");
			confirmacao = ler.nextInt();
		} while (confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO !!! ");
		ler.close();
	}

}
