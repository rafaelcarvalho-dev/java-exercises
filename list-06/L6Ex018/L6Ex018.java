import java.util.Scanner;

public class L6Ex018 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valores = 0;
		
		System.out.print("total de mercadorias: ");
		int mercadoria = scanner.nextInt();
		
		for (int i = mercadoria; i > 0; i--) {
			
			System.out.print("total do produto: ");
			int produto = scanner.nextInt();
			
			valores += produto;
		}
		System.out.print("numero total de mercadorias no estoque: " + (mercadoria * valores) + ". media de valor das mercadorias: " + (valores / mercadoria));
	}
}

