import java.util.Scanner;

public class L6Ex037 {
	
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
						System.out.print(i + " ");
					} else {
						System.out.print(termo + "/" + i + " ");
						termo++;
					}
				}
					
			}
			
		} while (qntdTermos < 0);
	}
}

