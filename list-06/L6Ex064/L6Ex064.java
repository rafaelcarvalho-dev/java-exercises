import java.util.Scanner;

public class L6Ex064 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qntdTermo = scanner.nextInt();
		
		int contadorFibonacci = 0;
		
		int anterior = 1;
		int atual = 1;
		
		int[] fibonacci = new int[qntdTermo];
		
		while (contadorFibonacci < qntdTermo) {
			
			fibonacci[contadorFibonacci] = anterior;
			
			int proximo = anterior + atual;
			
			anterior = atual;
			atual = proximo;
			
			
			contadorFibonacci++;
			
		}
		
		int contadorPrimo = 0;
		
		int[] primo = new int[qntdTermo];
		
		for (int i = 2; contadorPrimo < qntdTermo; i++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if (i % j == 0) {
					
					ehPrimo = false;
					
				}
				
			}
			
			if (ehPrimo) {
				
				primo[contadorPrimo] = i;
				
				contadorPrimo++;
				
			}
			
		}
		
		double soma = 0.0;
		
		
		for (int i = 0; i <= qntdTermo - 1; i++) {
			
			double divisao = (double)fibonacci[i] / primo[i];

			
			if (i == 0) {
				
				soma += divisao;
				
				System.out.print(fibonacci[i] + "/" + primo[i]);
				
			} else if (i % 2 != 0) {
				
				soma -= divisao;
				
				System.out.print(" - " + fibonacci[i] + "/" + primo[i]);
				
			} else {
				
				soma += divisao;
				
				System.out.print(" + " + fibonacci[i] + "/" + primo[i]);
			
			}
	
		}
		
		System.out.printf("\nsoma dos termos: %.2f", soma);
		
	}
}

