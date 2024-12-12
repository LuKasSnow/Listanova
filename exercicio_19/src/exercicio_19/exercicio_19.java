package exercicio_19;
import java.util.Scanner;

public class exercicio_19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite um número ");
		int num = scanner.nextInt();
		
		if(num==5 || num==200 || num==400) {
			
			System.out.print(" número  " + num);
		}
		
		else if(num >= 500 && num <=1000) {
			
			System.out.print(" está no intervalo  ");
		}
		
		else {
			System.out.print( "está fora dos escopos ");
		}
		
	}

}
