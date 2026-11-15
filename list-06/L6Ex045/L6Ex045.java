import java.util.Scanner;

public class L6Ex045 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("quantidade de termos: ");
		int qntdTermos = scanner.nextInt();
		
		
		for (int i = qntdTermos; i >= 1; i--) {
			
			int fatorial = 1;
			
			for (int j = 1; j <= i; j++) {
				
				fatorial *= j;
				
			}	
						
			System.out.print(i + ") termo: " + i + "! = " + fatorial + "\n");
		
		}
		
	}
}

