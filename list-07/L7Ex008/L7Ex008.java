import java.util.Scanner;

public class L7Ex008 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// le a frase
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine().toLowerCase();
		
		// percorre [a - z]
		for (char i = 97; i <= 122; i++) {
			
			int contador = 0;
			
			// percorre todos os indices da frase
			for (int j = 0; j < frase.length(); j++) {
				
				if (frase.charAt(j) == i) {
					
					contador++;
					
				}

			}
			
			if (contador > 0) {
				
				System.out.println(i + " aparece " + contador + " vezes");
				
			}
			
		}
	}
}

