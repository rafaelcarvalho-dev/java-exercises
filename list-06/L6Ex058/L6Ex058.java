import java.util.Scanner;

public class L6Ex058 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("informe o primeiro termo: ");
		int anterior = scanner.nextInt();
		
		System.out.print("informe o segundo termo: ");
		int atual = scanner.nextInt();
		
		int contador = 0;
		
		for (int i = 1; contador < 10; i++) {
			
			int proximo = anterior + atual;
			
			System.out.print(proximo + " ");
			
			anterior = atual;
			atual = proximo;
			
			contador++;
			
		}
	}
}

