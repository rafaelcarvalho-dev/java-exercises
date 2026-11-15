import java.util.Scanner;

public class L6Ex031 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qntdTermos;
		
		do {
			System.out.print("quantidade de termos: ");
			qntdTermos = scanner.nextInt();
	
			if (qntdTermos > 0) {
				for (int i = 1; i <= qntdTermos; i++) {	
					System.out.print(i + " ");
				}
			} else if (qntdTermos == 0) {
				System.out.println("ENTRADA INVALIDA!\nPROGRAMA FINALIZADO...");
			}
			
		} while (qntdTermos < 0);

	}
}

