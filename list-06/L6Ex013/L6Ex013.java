import java.util.Scanner;

public class L6Ex013 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 0; i < 11; i++) {
			System.out.print("digite um numero: ");
			int numero = scanner.nextInt();
			if (numero < 40) {
				soma += numero;
			}
		}
		
		System.out.print("a soma dos numeros é: " + soma);
		
	}
}

