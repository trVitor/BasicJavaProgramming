package CanalTV;
import java.util.Scanner;
public class Pesquisa {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double cont=0,c4=0,c5=0,c7=0,c12=0;
        double pessoas=0;
        int canal = 1;
        	
        while (canal != 0 ) {
        	
        	System.out.println("PESQUISA DE AUDIÊNCIA: "+
        	                   "QUAL CANAL É O MAIS ASSISITIDO EM SUA RESIDÊNCIA ?"+
        			           "\n[4] REDE TV"+
        	                   "\n[5] SBT"+
        			           "\n[7] REDE RECORD"+
        	                  "\n[12] REDE GLOBO\n");
        	canal= ler.nextInt(); 
            cont++;
             if(canal !=0) {
            	 switch(canal) {
            	  
            	 case 4: 
            			System.out.println("\nQuantas pessoas assistem à este canal ?");	
                        pessoas=ler.nextInt();
                        c4=c4+pessoas;
                     break;   
            	 case 5:
            			System.out.println("\nQuantas pessoas assistem à este canal ?");	
                        pessoas=ler.nextInt();
                        c5=c5+pessoas;
                        break;
            	 case 7:
            			System.out.println("\nQuantas pessoas assistem à este canal ?");	
                        pessoas=ler.nextInt();
                        c7=c7+pessoas;
                        break;
            	 case 12:
            			System.out.println("\nQuantas pessoas assistem à este canal ?");	
                        pessoas=ler.nextInt();
                        c12=c12+pessoas;
                        break;
            	 default:
            		 System.out.println("\nCanal Inexistente!\n");
            		 break;
            	 }
             }
        }
        
        System.out.println("------------- x xx ------------");
        
        System.out.printf("O número de casas pesquisadas é: %.2f",cont);

        System.out.printf("\nA audiência da emissora do canal 4 é: %.2f",(c4/(c4+c5+c7+c12))*100);

        System.out.printf("\nA audiência da emissora do canal 5 é: %.2f",(c5/(c4+c5+c7+c12))*100);

        System.out.printf("\nA audiência da emissora do canal 7 é: %.2f",(c7/(c4+c5+c7+c12))*100);

        System.out.printf("\nA audiência da emissora do canal 12 é: %.2f",(c12/(c4+c5+c7+c12))*100);

        
        ler.close();
	}

}
