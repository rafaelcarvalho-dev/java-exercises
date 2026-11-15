import java.util.Scanner;

public class L6Ex033 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int qntdTermos;
		
		do {
			
			System.out.print("quantidade de termos: ");
			qntdTermos = scanner.nextInt();
			
			if (qntdTermos == 0) {
				
				System.out.print("programa finalizado...");
				
			} else if (qntdTermos > 0) {
				
				int termoAtual = 1;
				
				for (int i = 1; i <= qntdTermos; i++) {
					
					System.out.print(termoAtual + "  ");
					
					termoAtual += 2; 
					
				}
				
			}
			
		} while (qntdTermos < 0);
	}
}

