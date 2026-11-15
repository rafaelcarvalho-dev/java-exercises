import java.util.Scanner;

public class L6Ex051 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("informe a quantidade de termos: ");
		int qntdTermo = scanner.nextInt();
		
		int anterior = 0;
		int atual = 1;
		
		for (int i = 0; i < qntdTermo; i++) {
			System.out.print(anterior + " ");
			
			int proximo = anterior + atual;
			
			anterior = atual;
			atual = proximo;
		}
		
	}
}

