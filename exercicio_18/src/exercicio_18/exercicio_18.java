package exercicio_18;
import java.util.Scanner;

public class exercicio_18 {

	public static void main(String[] args) {
		Scanner  scanner = new Scanner (System.in);
		
		System.out.print("Digite um número ");
		int num = scanner.nextInt();
		
		
		  if(num >20 && num<90 ) {
			  
			  
			  
			  System.out.println("O número " + num + "  está entre 20 a 90");
			  
		  }
		  
		   
		  else if(num == 20 ) {
			  
			  System.out.println( num + "   não está na faixa de valores ");
		  }
		  
		  else  if (num ==90) {
			  
			  	System.out.println(num +" não está na faixa de vaores");
		  }
			
		  else  {
			  
			  System.out.println("O número  "  + num + " não  está entre 20 a 90");
		  }
	}

}
