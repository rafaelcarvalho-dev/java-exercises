import java.util.Scanner;

public class L6Ex032 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qntdTermos;
		
		do {
			System.out.print("quantidade de termos: ");
			qntdTermos = scanner.nextInt();
			
			if (qntdTermos > 0) {
				int termoAtual = 0;
				
				for (int i = 0; i < qntdTermos; i++) {
					System.out.print(termoAtual + " ");
					termoAtual += 2;
				}
			} else if (qntdTermos == 0) {
				System.out.print("PROGRAMA FINALIZADO...");
			}
			
		} while (qntdTermos < 0);
	}
}

