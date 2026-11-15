import java.util.Scanner;

public class L6Ex043 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i <= 7; i++) {
			
			int fatorial = 1;
			
			System.out.print("entre com um numero: ");
			int num = scanner.nextInt();
			
			for (int j = 1; j <= num; j++) {
				
				fatorial *= j;
				
			}
			
			System.out.print("o fatorial de " + num + "! eh: " + fatorial + "\n \n");
			
		}
	}
}

