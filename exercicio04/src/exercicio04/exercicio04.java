package exercicio04;
import java.util.Scanner;
public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um número");
		int n = scanner.nextInt();
		
		if(n > 0) {
			
			
			System.out.print("Esse número é positivo");
		}
		
		else if( n < 0) {
			
			System.out.print("Esse número é negativo");
		}
		
		else 
			
		{
			
			System.out.print("Esse número é nulo");
			
		}
		
		
		scanner.close();

	}

}
