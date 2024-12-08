package exercicio01;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); 
		
	   System.out.print("Digite um numero  ");
	   
	  int num = scanner.nextInt();
	  
	  
	  if ( num >= 20)
	  {
		 
		  System.out.print(" seu numero é " + num);
		  
	  }
	  
	  else {
		  
		  System.out.println("O numero dever ser maior  ou iqual a 20  ");
		  
		  
		  scanner.close();
	  }
          
	}

}
