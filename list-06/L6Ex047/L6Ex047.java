import java.util.Scanner;

public class L6Ex047 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 100; i++) {
			
			boolean ehPrimo = true;
			
			if (i <= 1) {
				ehPrimo = false;
			} else {
				for (int j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						ehPrimo = false;
						break;
					}
				}
			}
			
			if (ehPrimo) {
				System.out.print(i + " ");
			}
			
		}
	}
}

