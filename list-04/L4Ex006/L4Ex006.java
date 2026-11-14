import java.util.Scanner;

public class L4Ex006 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("informe um valor entre 0 e 1000: ");
		a = scanner.nextInt();
		System.out.print("informe outro valor entre 0 e 1000: ");
		b = scanner.nextInt();

		if (a >= 0 && a <= 1000 && b >= 0 && b <= 20) {
			
			if (a >= b && a % b == 0) {
				System.out.println("É divisível");
			}
		} else {
			System.out.println("os valores não são válidos");
			System.out.println("o valor de A não é maior ou igual a B");
			System.out.println("não é divisível");
		}
		 
		
	}
}

