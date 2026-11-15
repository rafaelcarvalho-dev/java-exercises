import java.util.Scanner;

public class L6Ex010 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int acumulador = 0;
		
		for (int i = 1; i <= 10; i++) {
		
			int numero = scanner.nextInt();
			acumulador += numero;		
		}
		
		System.out.print("A media dos numeros eh: " + (acumulador / 10));
	}
}

