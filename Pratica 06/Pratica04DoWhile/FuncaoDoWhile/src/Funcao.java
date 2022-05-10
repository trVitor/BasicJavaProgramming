import java.util.Scanner;

public class Funcao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int confirmacao;
		double fx=0;
		do {
			System.out.println("Digite um valor: ");
	         double x = ler.nextDouble();
	        
	        if(x< -2) {
	        	fx= 2*x + 2;
	        }else if (-2 <= x && x <3) {
	        	fx = 3;
	        }else if (3<=x) {
	        	fx= -x;
	        }
	        	System.out.println("\nO valor da função após receber um valor é: " + fx);
		
		 System.out.println("\nVocê deseja consultar novamente ?[1] SIM e [2] NÃO");
		    confirmacao = ler.nextInt();
		    } while( confirmacao == 1);
		    
		    System.out.println("\nPROGRAMA FINALIZADO !!! ");ler.close();
	}

}
