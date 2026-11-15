import java.util.Scanner;

public class L6Ex059 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com o primeiro termo: ");
		int anterior = scanner.nextInt();
		
		System.out.print("entre com o segundo termo: ");
		int atual = scanner.nextInt();
		
		System.out.print("entre com a quantidade de termos: ");
		int qntd = scanner.nextInt();
		
		int contador = 0;
		
		while (contador < qntd) {
			
			System.out.print(anterior + " ");
			
			int proximo = anterior + atual;
			
			anterior = atual;
			atual = proximo;
			
			contador++;
		}
	}
}

