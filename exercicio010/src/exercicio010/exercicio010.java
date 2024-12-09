package exercicio010;
import java.util.Scanner;

public class exercicio010 {

	public static void main(String[] args) {
		
		Scanner scanner = new  Scanner (System.in);
		
		System.out.println("Verifica qual número é maior ou qual é  menor");
		
		System.out.print("Digite um número ");
		 int a = scanner.nextInt();
		 
		 System.out.print("Digete outro número ");
		    
		 int b =  scanner.nextInt();
		 
		 if(a > b) {
			 
			 System.out.print(" O número " + a + " é maior que " + b);
			 
		 }
		 
		 
		 else if (a == b ) {
			 
			 System.out.print(" O número " + a + " é  iqual a " + b);
		 }
		 
		 else{
			 
			 System.out.print("O número " + a + " é menor que " + b);
			 
		 }
		 
		 scanner.close();
	}

}
