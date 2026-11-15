import java.util.Scanner;

public class L6Ex057 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qntdTermo = scanner.nextInt();
		
		int contador = 0;
		
		for (int i = 6; contador < qntdTermo; i++) {
			
			int soma = 0;
			
			
			for (int j = 1; j < i; j++) {
				
				if (i % j == 0) {
					
					soma += j;
					
				}

			}
			
			if (soma == i) {
				
				System.out.print(i + " ");
				contador++;
				
			}
			
		}
	}
}

