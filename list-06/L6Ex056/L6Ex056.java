import java.util.Scanner;

public class L6Ex056 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		for (int i = 6; i <= 900; i++) {
			
			int soma = 0;
			
			for (int j = i - 1; j >= 1; j--) {
				if (i % j == 0) {
					soma += j;
				}
			}
			
			if (soma == i) {
				System.out.print(i + " ");
			}
			
		}
		
	}
}
