import java.util.Scanner;

public class L6Ex049 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("informe a quantidade de termos: ");
		int qntdTermo = scanner.nextInt();
		
		int contador = 0;
		int[] numPrimo = new int[qntdTermo];
		
		for (int i = 2; contador < qntdTermo; i++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					ehPrimo = false;
					break;
				}
			}
			
			if (ehPrimo) {
				contador += 1;
				numPrimo[contador - 1] = i;
			}
			
		}
		
		for (int x = numPrimo.length - 1; x >= 0; x--) {
			System.out.print(numPrimo[x] + " ");
		}
	}
}

