package exercicio_25;
import java.util.Scanner;

public class exercicio_25 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner (System.in);
		 
		System.out.println(" Categoria do mundial de natação");
		
		System.out.println("Entre com sua idade");
		int idade = scanner.nextInt();
		
		if (idade >= 5 && idade<=7) {

			System.out.print(" Idade " + idade + " anos Categoria Infantil A ");
	}
         
		else if (idade >=8 && idade <=10) {
			System.out.print("Idade " + idade + " anos Categoria infantil B");
		}
		
		else if (idade >= 11 && idade <=13) {
			
			System.out.print("Idade " + idade + " anos Categoria juvenil  A");
		}
		
		else if (idade >= 14 && idade <= 17) {
			
			System.out.print("Idade " + idade + " anos Categoria juvenil B ");
		}
		
		else if (idade >= 18){
			System.out.print("Idade " + idade + " anos Categoria Sênior");
		}   
		
		else {
			System.out.print("Idade " + idade + " anos Categoria não encontrada" );
		}
		
}
}
