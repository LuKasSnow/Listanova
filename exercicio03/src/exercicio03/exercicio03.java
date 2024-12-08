package exercicio03;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner (System.in);
		
		System.out.println("Verificação de número par ou ímpar ");
		
		System.out.print("Digite o número a ser verificado ");
		
		int  num = scanner.nextInt();
		
		
		if(num % 2 == 0) {
		
		System.out.print("Esse número é par ");

	}
		else {
			
			System.out.print("Esse número é impar ");
		}
		scanner.close();

	}
	
}
