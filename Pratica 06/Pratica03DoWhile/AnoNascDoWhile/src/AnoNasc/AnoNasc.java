package AnoNasc;
import java.util.Scanner;
public class AnoNasc {

	public static void main(String[] args) {

Scanner ler= new Scanner(System.in);
		
		int AnoNasc, AnoAtual, calculo, calculo1,confirmacao;
		
		do {
        System.out.println("Digite o ano de nascimento: ");
        AnoNasc=ler.nextInt();
        
        System.out.println("Digite o atual: ");
        AnoAtual=ler.nextInt();
        
        calculo= (AnoAtual - AnoNasc);
        
        calculo1=(2050 - AnoNasc);
        
        System.out.println("Você tem, " + calculo + " anos hoje, e terá " + calculo1 + " em 2050!");
        System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
	    confirmacao = ler.nextInt();
		
    	}while (confirmacao == 1);
		
		System.out.println("\nPROGRAMA FINALIZADO!!");
		ler.close();
	}
	}
