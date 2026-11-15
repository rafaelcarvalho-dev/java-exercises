import java.util.Scanner;

public class L5Ex002 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.print("informe um valor: ");
		valor = scanner.nextInt();
		
		if (valor >= 0) {
			System.out.print("o valor é positivo!");
		} else {
			System.out.print("o valor é negativo!");
		}
	}
}

