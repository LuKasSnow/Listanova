package exercicio09;
import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" verificar se um número é divisível ");
		
		System.out.print("Digite um número ");
		int a = scanner.nextInt();
		
		System.out.print("Digete outro número ");
		
		int b = scanner.nextInt();
		
		if (b==0) {
			System.out.println("Erro: Não é possível dividir por zero.");
		}
           
		else if( a%b==0) {
			
			System.out.print(" os número " + a + " e " + b + " é divisivel ");
			
		}
		
		else {
			
			System.out.print("os número " + a + " e " + b + " não é divisivel ");
		}
		
		scanner.close();
	}

}
