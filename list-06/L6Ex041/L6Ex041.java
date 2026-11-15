import java.util.Scanner;

public class L6Ex041 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com um numero: ");
		int num = scanner.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= num; i++) {
			
			fatorial *= i;
		}
		
		System.out.print("o fatorial de " + num + "! eh: " + fatorial);
	}
}

