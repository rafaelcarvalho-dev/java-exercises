import java.util.Scanner;

public class L6Ex054 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("informe o termo inicial: ");
		int termoInicial = scanner.nextInt();
		
		System.out.print("informe o termo final: ");
		int termoFinal = scanner.nextInt();
		
		int anterior = 0;
		int atual = 1;
		
		int termo = 1;
		
		for (int i = 0; i < termoFinal; i++) {
			
			if (termo >= termoInicial) {
				System.out.print(anterior + " ");
			}
			
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			
			termo++;
		}
		
	}
}

