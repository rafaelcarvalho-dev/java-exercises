import java.util.Scanner;

public class L7Ex009 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine();
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) { 
			
			if (frase.charAt(i) == ' ') {
				
				contador++;
				
			}
			
		}	
		
		System.out.print("na frase tem " + contador + " espacos");
		
	}
}

