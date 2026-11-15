import java.util.Scanner;

public class L5Ex001 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.print("informe um valor: ");
		valor = scanner.nextInt();
		
		if (valor > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("NÃO É MAIOR QUE 10!");	
		}
	}
}

