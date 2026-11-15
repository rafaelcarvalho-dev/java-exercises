import java.util.Scanner;

public class L5Ex006 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int valor1, valor2;

		System.out.print("informe um valor: ");
		valor1 = scanner.nextInt();
		
		System.out.print("informe outro valor: ");
		valor2 = scanner.nextInt();
		
		if (valor1 == valor2) {
			System.out.print("valores inválidos");
		} else if (valor1 > valor2) {
			System.out.print("o primeiro valor é o maior");
		} else {
			System.out.print("o segundo valor é o maior");
		}
	}
}

