import java.util.Scanner;

public class L6Ex008 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int contador = 0;
		
		for (int i = 1; i < 11; i++) {
			int num;
	
			System.out.print(i + ") numero: ");
			num = scanner.nextInt();
			
			if (num < 0) {
				contador++;
			}
		}
		System.out.print("\nnegativos = " + contador);
	}
}

