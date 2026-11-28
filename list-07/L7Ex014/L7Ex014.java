import java.util.Scanner;

public class L7Ex014 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com uma frase: ");
		String frase = scanner.nextLine();
		
		System.out.print("entre com um caracter: ");
		String caracter = scanner.next();
		
		frase = frase.replace(caracter.charAt(0), '*');
		
		System.out.print(frase);

	}
}

