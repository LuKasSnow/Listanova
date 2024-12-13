package exercicio_27;
import java.util.Scanner;

public class exericio_27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println(" Média bimestral");
		
		System.out.print("Entre com a primeira nota");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Entre com a segunda nota ");
	double nota2 = scanner.nextDouble();
		
		double media =(nota1 + nota2) / 2;
		
		if (media >= 7) {
			
			System.out.print(" Sua média é " + media + " Aprovado");
		}
		
		else if (media <=3) {
			
			System.out.print(" Sua média é " + media + " Reprovado");
		}
		
		else {
			System.out.print("Sua média esta em exame...");
		}
     scanner.close();
	}

}
