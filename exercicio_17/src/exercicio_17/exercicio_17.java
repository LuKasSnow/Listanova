package exercicio_17;
import java.util.Scanner;

public class exercicio_17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("virifica se um número e divisível  por 10/5/2");
		System.out.print("Entre com  o número");
		int num = scanner.nextInt();
		
		
		if(num%10==0 ) {
			
			System.out.print("O número " + num +" é divisível  10 ");
		}
		
		else if (num%5==0) {
			System.out.print("O número "  + num +"  é divisível  5 ");
		}
		
		else if (num%2==0) {
			
			System.out.print("O número " + num +" é divisível 2 ");
		}
		
		else {
			
			System.out.print("O número " + num + "  não é  divisível ");
		}

	}
	

}
