package exercicio_23;
import java.util.Scanner;
public class exercico_23 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Classificação de Idade");
		
		System.out.print("Digite sua idade ");
		
		int idade = scanner.nextInt();
		
		if (idade < 18 ) {
			
			System.out.print( "Sua idade é: "+ idade + " Você é menor  de idade");
		}
		
		else if(idade >= 18) {
			
			System.out.print("Sua idade é:"+ idade + " Você é maior de idade ");
		}
		
		else if (idade >=65 ) {
			
			System.out.print("Sua idade é : "+ idade + " Você");
			
		}
		
		scanner.close();
                  
	}

}
