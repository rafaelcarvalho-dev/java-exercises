import java.util.Scanner;

public class L6Ex007 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.print("entre com um valor (1 - 10): ");
		valor = scanner.nextInt();
		
		if (valor > 0 && valor < 11) {
			for (int i = 1; i < 11; i++) {
				System.out.println(valor + " x " + i + " = " + (valor * i));
			}	
		} else System.out.print("VALOR INVALIDO!1");
		
		
	}
}

