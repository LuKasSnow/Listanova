package exercicio05;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner (System.in);
	 
	

	 
	 System.out.print("Digite o primeiro número");
	 
	 int num1 = scanner.nextInt();
	 
	 System.out.print("Digite o segundo número");
	 
	 int num2 = scanner.nextInt();
	 
	 int resultado = num1 + num2;
	 
	 if( resultado >= 20)  {
		 
		 
	int resultado2 = resultado + 8;
	
	
	System.out.print(" A soma de " + num1 + " + " + num2 + " é " + " = " + resultado + " +" + " 8 é = " + resultado2 );
		 
	 }
	 
	 else {
		 
		  int resultado2 = resultado - 5;
		 
		 System.out.print("A soma de " + num1 + " + " + num2 + " é " + " = " + resultado + " - " + " 5 é = " + resultado2);
		 
		 
	 }
	 
               scanner.close();
	}

}
