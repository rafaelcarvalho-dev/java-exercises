import java.util.Scanner;

public class L6Ex020 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int menor = 0;
		int maior = 0;
		
		for (int i = 0 ; i <= 100; i++) {
			
			System.out.print("entre com um valor: ");
			int num = scanner.nextInt();
			
			
			if (maior < num) {
				maior = num;
			} else if (menor >= num) {
				menor = num;
			}
			
		}
		
		System.out.print("menor: " + menor + " e maior: " + maior);
	}
}

