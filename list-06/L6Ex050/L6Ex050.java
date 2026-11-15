import java.util.Scanner;

public class L6Ex050 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("informe o termo inicial: ");
		int termoInicial = scanner.nextInt();
		
		System.out.print("informe a quantidade de termos: ");
		int qntdTermo = scanner.nextInt();
		
		int contador = 0;
		
		for (int i = termoInicial; contador < qntdTermo; i++) {
			
			boolean ehPrimo = true;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					ehPrimo = false;
					break;
				}
			}
			
			if (ehPrimo) {
				contador++;
				System.out.print(i + " ");
			}
		}
	}
}

