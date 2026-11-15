import java.util.Scanner;

public class L6Ex063 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
        int qntdTermo = scanner.nextInt();
        
		int contador = 0;
		
		int anterior = 1;
		int atual = 1;
		
		int[] fibonacci = new int[qntdTermo];
		
		
		while (contador < qntdTermo) {
			
			fibonacci[contador] = anterior;
			
			int proximo = anterior + atual;
			
			anterior = atual;
			atual = proximo;
			
			contador++;
			
		}
		
		
		int contadorPrimo = 0;
		
		int[] primo = new int[qntdTermo];
		
		for (int i = 2; contadorPrimo < qntdTermo; i++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if (i % j == 0) {
					
					ehPrimo = false;
					break;
					
				}
				
				
			}
			
			if (ehPrimo) {
				
				primo[contadorPrimo] = i;
				contadorPrimo++;
				
			}
			
		}
		
		
		double soma = 0.0;
		
		
		for (int i = 0; i <= qntdTermo - 1; i++) {
			
			int numerador = fibonacci[i];
			int denominador = primo[i];
			
			
			double divisaoTermo = (double)numerador / denominador;
			
			soma += divisaoTermo;
			
			if (i == 0) {
				
				System.out.print(numerador + "/" + denominador);
				
			} else {
				
				System.out.print(" + " + numerador + "/" + denominador);
			
			}	
			
		}
		
		
		System.out.printf("\nsoma dos termos: %.2f", soma);
		
		
	}
}

