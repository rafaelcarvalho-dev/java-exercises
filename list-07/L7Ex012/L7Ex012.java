import java.util.Scanner;

public class L7Ex012 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine().toLowerCase();

		for (char i = 97; i <= 117; i++) {
			
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				
				int contador = 0;
				
				// percorre cada indice da frase
				for (int j = 0; j < frase.length(); j++) {
				
					if (frase.charAt(j) == i) {
					
						contador++;
					
					}
				
				}	
				
				System.out.println(i + " - " + contador);
				
			}
			
		}

	}
}

