import java.util.Scanner;

public class L6Ex065 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qntdTermo = scanner.nextInt();
		
		int contadorFatorial = 0;
		
		int i = 1;
		
		int fatorial = 1;
		
		int[] numFatorial = new int[qntdTermo];
		
		int contadorPrimo = 0;
		
		int[] numPrimo = new int[qntdTermo];
		
		double soma = 0.0;
		
		while (contadorFatorial < qntdTermo) {
			
			fatorial *= i;
			
			numFatorial[contadorFatorial] = fatorial;
			
			i++;
			contadorFatorial++;
			
		}
		
		for (int x = 2; contadorPrimo < qntdTermo; x++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j <= Math.sqrt(x); j++) {
				
				if (x % j == 0) {
					
					ehPrimo = false;
					
				}
				
			}
			
			if (ehPrimo) {
				
				numPrimo[contadorPrimo] = x;
				
				contadorPrimo++;
				
			}
			
		}
		
		for (int y = 0; y <= qntdTermo - 1; y++) {
			
			double divisaoTermo = (double)numFatorial[y] / numPrimo[y];
			
			if (y == 0) {
				
				soma -= divisaoTermo;
				
				System.out.print(" - " + numFatorial[y] + "/" + numPrimo[y]);
				
			} else if (y % 2 != 0) {
				
				soma += divisaoTermo;
				
				System.out.print(" + " + numFatorial[y] + "/" + numPrimo[y]);
				
			} else {
				
				soma -= divisaoTermo;
				
				System.out.print(" - " + numFatorial[y] + "/" + numPrimo[y]);
				
			}
			
		}
		
		
		System.out.printf("\nsoma dos termos: %.2f", soma);
		
	}
}

