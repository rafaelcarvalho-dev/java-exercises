import java.util.Scanner;

public class L6Ex004 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.print("entre com um valor: ");
		valor = scanner.nextInt();
		
		if (valor < 0) {
			System.out.print("VALOR INVALIDO!");
		}
		
		for (int i = valor; i > 0; i--) {
			System.out.print(i + " ");
		}
	}
}

