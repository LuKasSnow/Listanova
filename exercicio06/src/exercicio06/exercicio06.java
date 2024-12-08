package exercicio06;
import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner (System.in);
		
		System.out.println("Raiz ou Quadrado");
		
		System.out.print("Entre com número  ");
		
		double num = scanner.nextDouble();
		
		if(num >= 0) {
			
			double resultado = Math.sqrt(num);

			System.out.print("A raiz  de " + (int )  num + " é " + (int) + resultado);
			
		}
		
		else {
			
			double resultado = num * num; 
			
			System.out.print("O quadrado de " +(int)  num + " é " + (int)+ resultado);
			
		}
		
		scanner.close();
		
	}

}
