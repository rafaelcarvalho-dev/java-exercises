import java.util.Scanner;

public class L7Ex010 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine();
		
		int contador = 0;
		
		for (char i = 65; i <= 90; i++) {
			
			for (int j = 0; j < frase.length(); j++) {
				
				if (frase.charAt(j) == i) {
				
					contador++;
				
				}
				
				
			}

		}
		
		System.out.print("na frase tem " + contador + " letras maiusculas");
		
	}
}

