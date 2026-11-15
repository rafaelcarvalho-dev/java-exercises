import java.util.Scanner;

public class L6Ex055 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com um numero inteiro: ");
		int numero = scanner.nextInt();
		
		int soma = 0;
		
		for (int i = 1; i < numero; i++) {
			
			if (numero % i == 0) {
				soma += i;
			}
		}
		
		if (soma == numero) {
			System.out.print(numero + " eh perfeito");
		} else {
			System.out.print(numero + " nao eh perfeito");
		}
	}
}

