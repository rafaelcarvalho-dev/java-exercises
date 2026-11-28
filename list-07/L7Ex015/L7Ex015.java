import java.util.Scanner;

public class L7Ex015 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine();
		
		boolean ehNum = false;
			
		for (int j = 0; j < frase.length(); j++) {
			
			for (char i = 48; i <= 57; i++) {
			
				if (frase.charAt(j) == i) {
					
					ehNum = true;
					
				}
			}
		}
			
		if (ehNum) {
			
			System.out.print("existe caracter numerico");
			
		}
	}
}

