import java.util.Scanner;

public class L6Ex039 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qntdTermos;
		
		do {
			System.out.print("quantidade de termos: ");
			qntdTermos = scanner.nextInt();
			
			if (qntdTermos == 0) {
				System.out.print("programa finalizado...");
			} else {
				
				int termo = qntdTermos;
				int somaNumerador = 0;
				int somaDenominador = 0;
				
				for (int i = 1; i <= qntdTermos; i++) {
					
					System.out.print(i + "/" + termo + " ");
					somaNumerador += i;
					somaDenominador += termo;
					termo--;
					
				}
				
				System.out.print("\n \n-- RESULTADO DA SOMA --\n \n");
				
				System.out.print(somaNumerador + "/" + somaDenominador);
			}
			
			
			
		} while (qntdTermos < 0);
	}
}

