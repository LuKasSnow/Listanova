package exercicio_14;
import java.util.Scanner;
public class exercicio_14 {

	public static void main(String[] args) {
		
	 
		Scanner  scanner = new Scanner (System.in);
		
		
		System.out.print("Digite o primeiro número");
		   int  a = scanner.nextInt();
		   
		   System.out.print("Entre com o segundo Número");
		   
		   int  b = scanner.nextInt();
		   
		   System.out.print("entre com o terceiro número");
		   
		   int  c = scanner.nextInt();
		   
		   int menor ;
		   
		   int maior;
		   
		   int meio;
		   
		   
		   if (a <= b && a <= c ) {
			   
			 menor = a;
			 
			   
		   }
		   
		   
		   else if (b < a && b < c) {
			   
			     menor = b;
				 
			   
		   }
		   
		   else {
			   
			   menor = c;
				 
		   }
	
	                     if (a >= b  && a >= c ) {
	                    	 
	                    	  maior = a;
	                     }
	                     
	                     else if ( b >= a &&  b >= c) {
	                    	 
	                    	 maior = b;
	                    	 
	                     }
	                     
	                     else {
	                    	 
	                    	 maior = c;
	                     }
	                     
	                     
	                     
	                     if (a != maior && a != menor) {
	                    	 
	                    	 meio =a;
	                    	 
	                     }
	                     
	                     else if (b != maior &&  a!=menor) {
	                    	 
	                    	 meio =b;
	                     }
	                     
	                     
	                     else {
	                    	 
	                    	 meio = c;
	                     }
	                     
	                   
	                     System.out.print(" Os numero " + menor +  "  "+ "  " + meio + "  "+ maior);
	                     
	                     
	

	}
	


}
