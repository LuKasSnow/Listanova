package exercicio_15;
import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		  System.out.print("Entre com o primeiro número ");
		  int  a = scanner.nextInt();
		  
		  System.out.print("Entre com o segundo número");
		  
		  int b = scanner.nextInt();
		  
		  System.out.print("Entre com o terceiro número");
		  int c = scanner.nextInt();
		  
		  int maior;
		  int meio ;
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
			  meio =a;
		  }
		  
		  else if ( b !=menor && b !=maior) {
			  meio = b;
		  }
		  
		  else {
			  meio = c;
		  }
		  
		 		  
		  
		   
		   {
		  System.out.print("Ordem dos número " + maior  + " " + meio + " " + menor );
		  }
	}

}
