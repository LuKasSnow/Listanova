package exercicio_11;
import java.util.Scanner;

public class exercicio_11 {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner (System.in);
		
		System.out.println("Este programa verifica se um número é divisível por 7.");

		
		System.out.print("Digite um número ");
		
		int  a =  scanner.nextInt();
		
		
		
		if (a%7==0) {
			
			System.out.print("O número " + a + " é divisivel por  7");
			
		}
		
		else {
			System.out.print("O número " + a + " não é divisivel por  7");
			
		}
		
		scanner.close();
		

	}
	

}
