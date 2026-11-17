import java.util.Scanner;

public class L7Ex005 {
	
	public static void main (String[] args) {
		Scanner texto = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = texto.nextLine();
		
		int contador = 0;
		
		String[] caracteres = frase.split("");
		
		for (int i = 0; i < caracteres.length; i++) {
			
			if (caracteres[i].equalsIgnoreCase("a")) {
				contador++;
			}
			
		}
		
		System.out.print(contador);
		
	}
}

