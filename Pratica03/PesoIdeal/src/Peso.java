import java.util.Scanner;
public class Peso {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double peso=0;

		System.out.println("Digite seu peso: ");
		peso=ler.nextDouble();
		
		double engordar = peso + (peso * 0.15);
		double emagrecer = peso - (peso * 0.20);
		
		System.out.format("Se a pessoa engordar 15%% ela terá o peso de: %.2f.", engordar);
		System.out.format("\nSe ela emagrecer, vai ter o peso de %.2f.", emagrecer);
		
        ler.close();
	}

}
