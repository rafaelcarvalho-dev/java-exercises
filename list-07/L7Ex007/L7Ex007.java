import java.util.Scanner;

public class L7Ex007 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine().toUpperCase();
		
		for (char i = 65; i <= 90; i++) {
			
			int contador = 0;
			
			for (int j = 0; j < frase.length(); j++) {
				
				if (frase.charAt(j) == i) {
					
					contador++;
					
				}
			}
			
			System.out.println("a letra " + i + " aparece " + contador + " vezes");
			
		}
	}
}

