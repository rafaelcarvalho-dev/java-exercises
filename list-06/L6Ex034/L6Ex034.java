import java.util.Scanner;

public class L6Ex034 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qntdTermos;
		
		do {
			
			System.out.print("quantidade de termos: ");
			qntdTermos = scanner.nextInt();
			
			if (qntdTermos == 0) {
				System.out.print("programa finalizado...");
			} else if (qntdTermos > 0) {
				
				int termo = 0;
				
				for (int i = 1; i <= qntdTermos; i++) {
					
					System.out.print(termo + " ");
					termo += i;
				}
				
			}
			
		} while (qntdTermos < 0);
	}
}

