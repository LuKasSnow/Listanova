package exercicio_21;
import java.util.Scanner;

public class exercicio_21 {

	public static void main(String[] args) {
		 
		   Scanner  scanner = new Scanner (System.in);
		    
		      System.out.println("Calculo de (IMC) ");
		      
		      System.out.println(" Entre com seu peso ");
		      
		      double peso = scanner.nextDouble();
		      
		      System.out.println("Entre com sua altura ");
		      
		      double altura = scanner.nextDouble();
		      
		      
		      double imc = peso / Math.pow(altura, 2);
		      
		      
		      if (imc < 20) {
		    	  
		    	  System.out.printf("Seu IMC é: %.2f\n" , imc );
		    	  
		    	  System.out.print("está abaixo do peso");

		      }
		      
		      else if ( imc >= 20 && imc < 25 ) {
		    	  System.out.printf("Seu IMC é: %.2f\n " , imc );
		    	  
		    	  System.out.print("Peso Normal ");
		      }
		      
		      else if(imc >= 25 && imc < 30)  {
		    	  
		    	 System.out.printf("Seu IMC é: %.2f\n " , imc  );
		    	 System.out.print("Sobre Peso ");
		      }
		      
		      else if (imc >=30 && imc< 40 ) {
		    	  
		    	  System.out.printf("Seu IMC é: %.2f\n" , imc  );
		    	  System.out.print("Obeso ");
		      }
                 
		      
		      else {
		    	  
		    	  System.out.printf("Seu IMC é:  %.2f\n " , imc );
		    	  System.out.print("Obeso Mórbido ");
		      }
		      
		      scanner.close();
	}

}
