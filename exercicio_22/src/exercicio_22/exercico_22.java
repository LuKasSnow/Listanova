package exercicio_22;
import java.util.Scanner;

public class exercico_22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
                
		System.out.println("(CEF) crédito especial para cliente");
		
		  System.out.print("Entre com seu saldo medio:  ");
		   double saldo = scanner.nextDouble();
		   
		   
		   if (saldo <= 500 ) {
			   
			   System.out.print("Crétido  zero");
		   }
		   
		   
		   else if(saldo > 500 && saldo <=1000 ) {
			   
			  double crédito = 0.30 * saldo ;
			  
			  System.out.printf("Seu crédito é:  R$ %.2f\n" , crédito);
		   }
		   
		   
		   else if (saldo > 1000 && saldo<=3000)  {
			   
			   double crédito = 0.40 * saldo ;
			   
			   System.out.printf("Seu crédito é:  R$ %.2f\n" , crédito);
		   }
		   
		   else {
			   
			   double crédito = 0.50 * saldo;
			   System.out.printf("Seu crédito é:  R$ %.2f\n" ,  crédito);
		   }
		   
		   scanner.close();
	}

}
