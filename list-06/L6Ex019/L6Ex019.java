import java.util.Scanner;

public class L6Ex019 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		int contaMercadoria = 0;
		int valores = 0;
		
		do {
			System.out.print("valor do produto: ");
			int produto = scanner.nextInt();
			
			scanner.nextLine();
		
			System.out.print("MAIS MERCADORIAS (S/N)? ");
			String condicao = scanner.nextLine();
			
			contaMercadoria++;
			
			valores += produto;
			
		} while (!condicao.equals("nao"));
		
		System.out.print("numero total de mercadorias no estoque: " + (contaMercadoria * valores) + ". media de valor das mercadorias: " + (valores / contaMercadoria));
	}
}

