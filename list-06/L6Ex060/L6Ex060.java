import java.util.Scanner;

public class L6Ex060 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com o primeiro termo: ");
		int anterior = scanner.nextInt();
		
		System.out.print("entre com o segundo termo: ");
		int atual = scanner.nextInt();
		
		System.out.print("informe um numero: ");
		int numero = scanner.nextInt();
		
		boolean ehRicci = false;
		
		while (anterior <= numero) {
			
			if (anterior == numero) {
				
				ehRicci = true;
				
			} 
			
			int proximo = anterior + atual;
			
			anterior = atual;
			atual = proximo;

		}
		
		if (ehRicci) {
			
			System.out.print(numero + " esta na sequencia");
			
		} else {
			
			System.out.print(numero + " nao esta na sequencia");
			
		}
		
	}
}

