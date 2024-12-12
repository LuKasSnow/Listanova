package exercicio_13;

import java.util.Scanner;

public class exercico_13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Entre com o primeiro valor");
		int a = scanner.nextInt();

		System.out.print("Entre com o segundo valor");
		int b = scanner.nextInt();

		System.out.print("Entre com o terceiro valor");
		int c = scanner.nextInt();

		System.out.print("Entre com o quarto valor");
		int d = scanner.nextInt();

		int maior;
		int menor;

		if (a > b && a > c && a > d) {

			maior = a;
		}

		else if (b > a && b > c && b > d) {
			maior = b;
		}

		else if (c > a && c > b && c > d) {

			maior = c;

		}

		else {
			maior = d;
		}

		if (a < b && a < c && a < d) {

			menor = a;

		}

		else if (b < a && b < c && b < d) {

			menor = b;

		}

		else if (c < a && c < b && c < d) {

			menor = c;
		}

		else {

			menor = d;
		}

		System.out.println("O maior número é " + maior);
		System.out.print(" O menor número é " + menor);

		scanner.close();

	}
}
