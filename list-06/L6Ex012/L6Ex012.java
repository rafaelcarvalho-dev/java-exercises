import java.util.Scanner;

public class L6Ex012 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("digite um numero: ");
			int numero = scanner.nextInt();
			
			soma += numero;
		}
		
		System.out.print("a soma dos numeros eh: " + soma);
		
	}
}



