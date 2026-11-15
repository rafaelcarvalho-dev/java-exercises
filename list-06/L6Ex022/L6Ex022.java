import java.util.Scanner;

public class L6Ex022 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		int soma = 0;
		
		for (int i = 0; i <= 15; i++) {
			
			System.out.print("codigo do produto: ");
			int cod = scanner.nextInt();
			System.out.print("valor do produto: ");
			int valor = scanner.nextInt();
			
			soma += valor; 
			
			if (maior <= valor) {
				maior = valor;
			}
		}
		
		int media = soma / 15;
		
		System.out.print("maior preco lido: " + maior + ". media dos precos: " + media);
	}
}

