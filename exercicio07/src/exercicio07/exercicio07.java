package exercicio07;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Verificação de multiplo de 3 ");
		
		System.out.print("Digite o número ");
		int n = scanner.nextInt();
		
		if(n%3==0) {
			
			System.out.print("O número " + n + " é número de 3 ");
			
			
		}
		
		else {
			
			System.out.print("O número " + n + " não é número de 3 ");
		}
		
		scanner.close();
		
	}

}
