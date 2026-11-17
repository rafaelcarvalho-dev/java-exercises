import java.util.Scanner;

public class L7Ex006  {
	
	public static void main (String[] args) {
		Scanner texto = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = texto.nextLine();
		
		System.out.print("entre com um caractere: ");
		String letra = texto.next();
		
		String[] caracteres = frase.split("");
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			
			if (caracteres[i].equalsIgnoreCase(letra)) {
				
				contador++;
				
			}

		}
		
		System.out.print(contador);
		
	}
}

