package Academia;
import java.util.Scanner;
public class Ficha {

	public static void main(String[] args) {
		  Scanner ler =  new Scanner(System.in);
			
		  double confirmacao;
	      
		  do {
		  System.out.println("Informe sua idade: ");
	      int idade= ler.nextInt();
	      System.out.println("Informe seu gênero: [1] Masculino ou [2] Feminino.");
	      int genero = ler.nextInt();
	      
	      
	    switch(genero) {
	    
	    case 1:
	    	
	    	if(idade<=15) {
	    		System.out.println("\nAté 15 anos o valor é de R$ 60,00.");
	    	} if(idade>=16 && idade<=18) {
	    		System.out.println("\nEntre 16 e 18 anos o valor é de R$ 75,00.");
	    	} if(idade>=19 && idade<=30) {
	    		System.out.println("\nEntre 19 e 30 anos o valor é de R$ 90,00.");
	    	} if(idade>=31 && idade<=40) {
	    		System.out.println("\nEntre 31 e 40 anos o valor é de R$ 85,00.");
	    	}if (idade>40) {
	    		System.out.println("\nAcima de 40 anos o valor é de R$ 80,00");
	    	}
	    	break;
	    
	    case 2:
	    	
	    	if(idade<=18) {
	    		System.out.println("\nAté 18 anos o valor é de R$ 60,00.");
	    	} if(idade>=19 && idade<=25) {
	    		System.out.println("\nEntre 19 e 25 anos o valor é de R$ 90,00.");
	    	} if(idade>=26 && idade<=40) {
	    		System.out.println("\nEntre 26 e 40 anos o valor é de R$ 85,00.");
	    	}if (idade>40) {
	    		System.out.println("\nAcima de 40 anos o valor é de R$ 80,00");
	    	} 
	    	break;
	    
	    default:
	    	System.out.println("Opção inexistente, tente outra vez.");
	    	break;
	    }
		System.out.println("\nDeseja consultar novamente ? [1] Sim [2] Não");
	     confirmacao=ler.nextDouble();
	      
		}while(confirmacao == 1);

		System.out.println("\nPROGRAMA FINALIZADO!!");
	    ler.close();
	      
	}
}
