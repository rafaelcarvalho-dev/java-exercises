import java.util.Scanner;

public class L7Ex011 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine().toLowerCase();
		
		int contadorLetra = 0;
		int contadorNum = 0;
		
		// percorre [a - z]
		for (char i = 97; i <= 122; i++) {
			
			// percorre cada indice da frase
			for (int j = 0; j < frase.length(); j++) {
				
				if (frase.charAt(j) == i) {
				
					contadorLetra++;
				
				}
				
			}
			
		}
		
		// percorre [0 - 9]
		for (char i = 48; i <= 57; i++) {
			
			// percorre cada indice da frase
			for (int j = 0; j < frase.length(); j++) {
				
				if (frase.charAt(j) == i) {
				
					contadorNum++;
				
				}
				
			}
			
		}
		
		System.out.println(contadorLetra + " letras");
		System.out.println(contadorNum + " numeros");
	}
}

