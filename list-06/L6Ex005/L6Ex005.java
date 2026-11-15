import java.util.Scanner;

public class L6Ex005 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.print("entre com um valor: ");
		valor = scanner.nextInt();
		
		if (valor < 0) {
			System.out.println("ENTRADA INVALIDA...");
			
			int valor2;
		
			System.out.print("entre com outro valor: ");
			valor2 = scanner.nextInt();
			
			for (int j = valor2; j > 0; j--) {
			System.out.print(j + " ");
			}
			
		}
		
		for (int i = valor; i > 0; i--) {
			System.out.print(i + " ");
		}
	}
}


