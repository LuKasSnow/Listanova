package exercicio02;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner  (System.in);
		
		System.out.print("Adicione o primeiro numero ");
		
		int num1 = scanner.nextInt();
		
		System.out.print("Adicione o segundo numero ");
		int num2 = scanner.nextInt();
		
		int resultado = num1 + num2;
		
		
		if(resultado >= 10) {
			
			
			System.out.print("O resultado de " + num1 + "+" + num2 +" = " + resultado);
			
		
		}
		
		else {
			
			System.out.print(" O  resultado da soma  " + num1 + " e " + num2 + " e menor que 10 ");
		}
		
		scanner.close();
	}
	


}
