package exercicio_12;
import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Entre com o salário");
		double salariobruto = scanner.nextDouble();
		
		System.out.print("Entre com a  prestação");
		double prestação = scanner.nextDouble();
		
		 double  limete = salariobruto * 0.3;
		 
		 
		 if(prestação <=  limete) {
			 
			 
			 System.out.print("Empréstimo concedido seu limete é");
			 
			 
			 
			 
		 }
		 
		 else {
			 
			 
			 System.out.print("Emprétimo não concedido");
			 
		 }
		 
		
              scanner.close();
	}
   
}
