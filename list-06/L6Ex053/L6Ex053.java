import java.util.Scanner;

public class L6Ex053 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anterior = 0;
		int atual = 1;
		
		while (anterior <= 250) {
			
			if (anterior >= 1) {
				System.out.print(anterior + " ");
			}
			
			int proximo = anterior + atual;
			
			anterior = atual;
			atual = proximo;
		}
		
		scanner.close();
	}
}

