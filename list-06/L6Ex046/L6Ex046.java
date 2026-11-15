import java.util.Scanner;

public class L6Ex046 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com um numero: ");
		int numero = scanner.nextInt();
		
		boolean ehPrimo = true;
		
		if (numero <= 1) {
			ehPrimo = false;
		}
		
		if (numero == 2) {
			ehPrimo = true;
		}
		
		for (int i = 2; i <= numero / 2; i++) {
			if (numero % i == 0) {
				ehPrimo = false;
				break;
			}
		}
		
		
		if (ehPrimo) {
			System.out.print("eh primo");
		} else {
			System.out.print("nao eh primo");
		}	
	}
}

