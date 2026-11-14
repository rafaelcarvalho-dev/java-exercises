import java.util.Scanner;

public class L4Ex004 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int precoProduto1, precoProduto2;
		
		System.out.print("informe o preço do primeiro produto: ");
		precoProduto1 = scanner.nextInt();
		
		System.out.print("informe o preço do segundo produto: ");
		precoProduto2 = scanner.nextInt();
		
		if (precoProduto1 < 1 || precoProduto1 > 1000 || precoProduto2 < 1 || precoProduto2 > 1000) {
			System.out.print("VALOR INVÁLIDO");
		} else {
			
			if (precoProduto1 == precoProduto2) {
				System.out.print("o preço dos dois produtos são iguais");
			} else if (precoProduto1 < precoProduto2) {
				System.out.print("o produto 1 é o mais barato");
			} else {
				System.out.print("o produto 2 é o mais barato");
			}
		}
		
		scanner.close();
	}
}

