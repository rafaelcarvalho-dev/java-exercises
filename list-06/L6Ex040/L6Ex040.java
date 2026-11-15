import java.util.Scanner;

public class L6Ex040 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qntdTermos;
		
		do {
			System.out.print("quantidade de termos: ");
			qntdTermos = scanner.nextInt();
			
			if (qntdTermos == 0) {
				System.out.print("programa finalizado...");
			} else {
				
				int valor = 1;
				
				for (int i = 1; i <= qntdTermos; i++) {
					
					if (i <= qntdTermos / 2) {
						System.out.print(valor + " ");
						valor++;
					} else {
						valor--;
						System.out.print(valor + " ");
					}
					
				}
				
			}
			
		} while (qntdTermos < 0);
	}
}

