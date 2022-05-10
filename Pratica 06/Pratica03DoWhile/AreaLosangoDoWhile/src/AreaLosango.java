import java.util.Scanner;
public class AreaLosango {

	public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
		
		double DiagonalMaior, DiagonalMenor, Area,confirmacao;
		
		do {
		System.out.println("Digite sua Diagonal maior: ");
		DiagonalMaior=ler.nextDouble();
		System.out.println("Digite sua Diagonal menor: ");
		DiagonalMenor= ler.nextDouble();
		
		Area=(DiagonalMaior*DiagonalMenor)/2;
		
		System.out.format("A area do losango é de: %.2f", Area);
       
		System.out.println("\nDeseja calcular novamente ? [1] Sim [2] Não");
		confirmacao=ler.nextDouble();
		
		}while(confirmacao == 1);
		
		System.out.println("\nPROGRAMA FINALIZADO!!");
		
		ler.close();

	}

}
