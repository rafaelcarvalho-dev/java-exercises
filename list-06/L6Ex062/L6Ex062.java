import java.util.Scanner;

public class L6Ex062 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
        int qntdTermos = scanner.nextInt();
		
		double soma = 0.0;
		
		int numerador = 2;
		int denominador = 1;
		
		for (int i = 1; i <= qntdTermos; i++) {
			
			double divisaoTermo = (double)numerador / denominador;
			
			if (i % 2 == 0) {
				
				soma -= divisaoTermo;
				
			} else {
				
				soma += divisaoTermo;
			
			}
			
			
			if (i == 1) {
				
				System.out.print(numerador + "/" + denominador);
				
			} else if (i % 2 == 0) {
				
				System.out.print(" - "+ numerador + "/" + denominador);
				
			} else {
				
				System.out.print(" + "+ numerador + "/" + denominador);
				
			}
			
			numerador += 2;
			denominador += 2;
		}
		
		System.out.printf("\nsoma dos termos: %.2f", soma);
	}
}

