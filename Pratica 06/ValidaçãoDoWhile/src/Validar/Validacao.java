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
			System.out.println("Essa � uma nota v�lida!!!  Deseja tentar Novamente ? \n[1] SIM ou Prescione [2] para continuar.");
		}else 
			System.out.println("Essa nota nota n�o � v�lida. Deseja tentar Novamente ? [1] SIM [2] N�O");
            confirmacao=ler.nextInt();		
		}while(confirmacao == 1 );
		
		do {
		System.out.println("Digite o valor do Sal�rio:");
		salario= ler.nextDouble();
		if(salario > 0) {
			System.out.println("Essa sal�rio � v�lido!  Deseja tentar Novamente ? \n[1] SIM ou Digite [2] para continuar.");
		}else
			System.out.println("Esse sal�rio n�o � v�lido. Deseja tentar Novamente ? [1] SIM [2] N�O");
		  confirmacao=ler.nextInt();		
				}while(confirmacao == 1 );

		do {
			System.out.println("Digite o seu gen�ro: [M] Masculino [F] Feminino");
			sexo=ler.next().toUpperCase().charAt(0);
			if(sexo == 'M') {
				System.out.println("Gen�ro Masculino. Deseja tentar Novamente ? \n[1] SIM ou Digite [2] para continuar." );
			}else if(sexo == 'F') {
				System.out.println("Gen�ro Feminino.  Deseja tentar Novamente ? \n[1] SIM ou Digite [2] para continuar." );
			}else 
			System.out.println("Esse gen�ro n�o � v�lido. Deseja tentar Novamente ? [1] SIM [2] N�O");
			  confirmacao=ler.nextInt();		
					}while(confirmacao == 1 );
		
		do {
			System.out.println("Digite a sua idade: ");
			idade=ler.nextInt();
			if(idade > 0 && idade <150) {
				System.out.println("Essa � uma idade v�lida !! ");
			}else
					System.out.println("Essa � uma idade v�lida !! ");
		}while(confirmacao == 1);
			
		System.out.println("FIM DA VALIDA��O, DESEJA COME�AR DENOVO ? [1] SIM [2] N�O");
		confirmacao=ler.nextInt();
		}while(confirmacao == 1 );
		System.out.println("PROGRAMA FINALIZADOO !!!");

	}		
	}


