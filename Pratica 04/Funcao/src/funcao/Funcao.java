package funcao;
import java.util.Scanner;
public class Funcao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
        double x = ler.nextDouble();
        
        if(x< -2) {
        	x= 2*x+2;
        }else if (-2 <= x && x <3) {
        	x=3;
        }else if (3<=x) {
        	x= -x;
        }
        	System.out.println("\nO valor da fun��o ap�s receber um valor �: " + x);
ler.close();
}
}