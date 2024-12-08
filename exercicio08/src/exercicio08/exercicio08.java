package exercicio08;
import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Verficaçao se é divisível por 5. ");
		
		System.out.print("Informe o número ");
		
		int n = scanner.nextInt();
		
		if(n%5 == 0) {
			
			
			System.out.print("O número " + n + " é divisivel por 5 ");
			
			
		}
		
		else {
			
			System.out.print("O número " + n + " não é divisivel por 5 ");
		}
		
		scanner.close();

	}

}
