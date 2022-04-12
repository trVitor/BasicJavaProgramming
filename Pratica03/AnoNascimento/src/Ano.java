import java.util.Scanner;
public class Ano {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		int AnoNasc, AnoAtual, calculo, calculo1;
		
		
        System.out.println("Digite o ano de nascimento: ");
        AnoNasc=ler.nextInt();
        
        System.out.println("Digite o atual: ");
        AnoAtual=ler.nextInt();
        
        calculo= (AnoAtual - AnoNasc);
        
        calculo1=(2050 - AnoNasc);
        
        System.out.println("Você tem, " + calculo + " anos hoje, e terá " + calculo1 + " em 2050!");
        
		
		
ler.close();
	}

}
