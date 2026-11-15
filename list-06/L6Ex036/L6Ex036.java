import java.util.Scanner;

public class L6Ex036 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qntdTermos;
		
		do {
			System.out.print("quantidade de termos: ");
			qntdTermos = scanner.nextInt();
			
			if (qntdTermos == 0) {
				System.out.print("programa finalizado...");
			} else {
				
				int termo = 1;
				
				for (int i = 1; i <= qntdTermos; i++) {
					
					
					if (i == 1) {
						System.out.print(termo + " ");
					} else {
						System.out.print(termo + "/" + i + " ");
					}
					
				}
				
			}
			
		} while (qntdTermos < 0);
	}
}

