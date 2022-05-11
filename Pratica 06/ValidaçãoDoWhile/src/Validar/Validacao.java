package Validar;
import java.util.Scanner;
public class Validacao {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		int confirmacao=0;
		double nota=0, salario=0;
		char sexo;
		int idade=0;
		do {
		do {
		System.out.println("Digite a sua nota: ");
		nota=ler.nextDouble();
		if(nota >=0 && nota <=10) {
			System.out.println("Essa é uma nota válida!!!  Deseja tentar Novamente ? \n[1] SIM ou Prescione [2] para continuar.");
		}else 
			System.out.println("Essa nota nota não é válida. Deseja tentar Novamente ? [1] SIM [2] NÃO");
            confirmacao=ler.nextInt();		
		}while(confirmacao == 1 );
		
		do {
		System.out.println("Digite o valor do Salário:");
		salario= ler.nextDouble();
		if(salario > 0) {
			System.out.println("Essa salário é válido!  Deseja tentar Novamente ? \n[1] SIM ou Digite [2] para continuar.");
		}else
			System.out.println("Esse salário não é válido. Deseja tentar Novamente ? [1] SIM [2] NÃO");
		  confirmacao=ler.nextInt();		
				}while(confirmacao == 1 );

		do {
			System.out.println("Digite o seu genêro: [M] Masculino [F] Feminino");
			sexo=ler.next().toUpperCase().charAt(0);
			if(sexo == 'M') {
				System.out.println("Genêro Masculino. Deseja tentar Novamente ? \n[1] SIM ou Digite [2] para continuar." );
			}else if(sexo == 'F') {
				System.out.println("Genêro Feminino.  Deseja tentar Novamente ? \n[1] SIM ou Digite [2] para continuar." );
			}else 
			System.out.println("Esse genêro não é válido. Deseja tentar Novamente ? [1] SIM [2] NÃO");
			  confirmacao=ler.nextInt();		
					}while(confirmacao == 1 );
		
		do {
			System.out.println("Digite a sua idade: ");
			idade=ler.nextInt();
			if(idade > 0 && idade <150) {
				System.out.println("Essa é uma idade válida !! ");
			}else
					System.out.println("Essa é uma idade válida !! ");
		}while(confirmacao == 1);
			
		System.out.println("FIM DA VALIDAÇÃO, DESEJA COMEÇAR DENOVO ? [1] SIM [2] NÃO");
		confirmacao=ler.nextInt();
		}while(confirmacao == 1 );
		System.out.println("PROGRAMA FINALIZADOO !!!");

	}		
	}


