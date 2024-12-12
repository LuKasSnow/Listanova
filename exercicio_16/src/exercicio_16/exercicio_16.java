package exercicio_16;
import java.util.Scanner;

public class exercicio_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		  System.out.print("Entre com o primeiro número ");
		  int  a = scanner.nextInt();
		  
		  System.out.print("Entre com o segundo número");
		  
		  int b = scanner.nextInt();
		  
		  System.out.print("Entre com o terceiro número");
		  int c = scanner.nextInt();
		  
		  int maior;
		  int inter ;
		  int menor;
		  
		  
		  if (a >= b &&  a >c) 
		  {
			  maior=a ;
		  }
		  
		  else if ( b >= a && b >= c ) {
			  maior= b;
		  }
		  
		  else {
			  maior = c;
		  }
		  
		  if (a <= b && a <= c) 
		  {
			  menor = a;
		  }
		  
		  else if ( b <= a && b<=c ) {
			  menor = b;
			 
		  }
		  else {
			  menor = c;
		  }
		  
		  if ( a != menor && a != maior ) {
			  inter =a;
		  }
		  
		  else if ( b !=menor && b !=maior) {
			  inter = b;
		  }
		  
		  else {
			  inter = c;
			 
		  }
		           
		 		  
		  
		   
		   {
		  System.out.print(" Maior = maior  + " + inter + " +   "  + menor + "" + menor );
		  }
	}

}
