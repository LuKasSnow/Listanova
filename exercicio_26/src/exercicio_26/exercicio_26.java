package exercicio_26;
import java.util.Scanner;

public class exercicio_26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println(" liberação do governo para as mensalidades dos planos de saúde:");
		
		System.out.print("Entre com sua idade ");
		int idade = scanner.nextInt();
		
		if (idade <= 10) {
			
			System.out.print("Sua idade " + idade + "anos  você receberá R$ 30,00");
			
		}
		
		else if ( idade > 10 && idade <= 29) {
			
			System.out.print("Sua idade " + idade + "anos  você  receberá R$ 60,00 ");
		}
		
		else if (idade >29 && idade <=45) {
			
			System.out.print("Sua idade " + idade + " anos você receberá  R$ 120,00");
		}
		
		else if ( idade >45 && idade <=59) {
			
			System.out.print("Sua idade " + idade + " anos você receberá R$ 150,00 " );
		}
		
		else if (idade > 59 && idade <=65 ) {
			
			System.out.print("Sua idade " + idade +" anos você receberá  R$ 250,00" );
		}
		
		else {
			System.out.print("Sua idade " + idade + "anos  você  receberá R$ 400,00 ");
		}

	}

}
