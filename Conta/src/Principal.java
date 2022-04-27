import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
         Scanner ler = new Scanner (System.in);
		
		double saldo=0;
		ContaCorrente conta = new ContaCorrente();
		
		System.out.println("Digite o numero da sua conta: ");
		int NumConta= ler.nextInt();
		System.out.println("Digite o número da agência");
		int NumAg = ler.nextInt();
		
		System.out.println("Digite um valor para depositar");
	   double depositar = ler.nextDouble();
       conta.setSaldo(depositar);
	   System.out.println("Digite um valor para Sacar");
		double sacar = ler.nextDouble();
		conta.sacar(sacar);
	   System.out.println("\nO numero da sua conta é: " + NumConta);
	   System.out.println("O numero da sua agencia é: " +NumAg);
	   conta.Exibir();
		


		
		
	}

}
