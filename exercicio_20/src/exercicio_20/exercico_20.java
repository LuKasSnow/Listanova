package exercicio_20;
import java.util.Scanner;

public class exercico_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Raiz do maior e quadrado do menor número");

       
        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

       
        double maior, menor;
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

       
        double quadrado = Math.pow(menor, 2);
        System.out.println("O quadrado do menor número (" +(int) + menor + ") é: " +(int) + quadrado);

        
        if (maior >= 0) {
            double raiz = Math.sqrt(maior);
            System.out.println("A raiz quadrada do maior número (" + (int) + maior + ") é: " + (int) + raiz);
        } else {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo (" + (int) maior + ").");
        }

        scanner.close();
    }
}
