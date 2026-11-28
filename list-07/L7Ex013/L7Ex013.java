import java.util.Scanner;

public class L7Ex013 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine().toLowerCase();
		
		int contador = 0;

		for (char i = 97; i <= 122; i++) {
			
			if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u') {
				
				// percorre cada indice da frase
				for (int j = 0; j < frase.length(); j++) {
				
					if (frase.charAt(j) == i) {
					
						contador += 1;
					
					}
				
				}	
				
			}
			
		}
		
		System.out.println(contador + " consoantes");

	}
}

