import java.util.Scanner;

public class L6Ex014 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com um numero: ");
		int num1 = scanner.nextInt();
		
		System.out.print("entre com outro numero: ");
		int num2 = scanner.nextInt();
		
		int soma = 0;
		
		for (int i = num1; i <= num2; i++) {
			soma += i;
		}
		
		System.out.print("a soma dos inteiros entre os numeros " + num1 + " e " + num2 + " eh: " + soma);
		
	}
}

