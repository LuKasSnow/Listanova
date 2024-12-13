package exercicio_24;
import java.util.Scanner;

public class exercicio_24 {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner (System.in);
		
		System.out.println(" O classe eleitoral");
		
		System.out.print("Digite sua idade ");
		int idade = scanner.nextInt();
		
		if (idade < 16) {
			
			System.out.print ("Na sua idade de " + idade + " anos você ainda não é um eleitor");
			
		}
		
		else if (idade >= 16 && idade < 18 || idade >= 65) {
			
			System.out.print("Na sua idade de " + idade + " anos você é um eleitor não obrigado " );
		}
		
		
		else {
			System.out.print("Sua idade  de " +  idade + " anos  você é obrigado a votar");
		}
		

	}

}
