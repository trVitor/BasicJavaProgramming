import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		
		double DiagonalMaior, DiagonalMenor, Area;
		
		System.out.println("Digite sua Diagonal maior: ");
		DiagonalMaior=ler.nextDouble();
		System.out.println("Digite sua Diagonal menor: ");
		DiagonalMenor= ler.nextDouble();
		
		Area=(DiagonalMaior*DiagonalMenor)/2;
		
		System.out.format("A Àrea do losango é de: %.2f", Area);
		
		ler.close();

	}

}
