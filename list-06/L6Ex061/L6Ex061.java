import java.util.Scanner;

public class L6Ex061 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
        int qntdTermos = scanner.nextInt();
		
		double soma = 0.0;
		
		int numerador = 2;
		int denominador = 1;
		
		for (int i = 1; i <= qntdTermos; i++) {
			
			// divide numerador por denominador
			double divisaoTermo = (double)numerador / denominador;
			
			
			// joga o resultado para a soma 
			soma += divisaoTermo;
			
			// exibe a sequencia
			if (i == 1) {
				
				System.out.print(numerador + "/" + denominador);
				
			} else {
				
				System.out.print(" + " + numerador + "/" + denominador);
			
			}

			// incrementa numerador e denominador em 2
			numerador += 2;
			denominador += 2;
			
		}
		
		System.out.printf("\nsoma dos termos: %.2f", soma);
		
	}
}

