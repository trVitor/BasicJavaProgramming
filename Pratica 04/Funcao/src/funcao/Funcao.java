package funcao;
import java.util.Scanner;
public class Funcao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	double fx=0;	
	System.out.println("Digite um valor: ");
         x = ler.nextDouble();
        
        if(x< -2) {
        	fx= 2*x + 2;
        }else if (-2 <= x && x <3) {
        	fx = 3;
        }else if (3<=x) {
        	fx= -x;
        }
        	System.out.println("\nO valor da função após receber um valor é: " + fx);
ler.close();
}
}
