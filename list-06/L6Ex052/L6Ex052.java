import java.util.Scanner;

public class L6Ex052 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("entre com um numero inteiro: ");
		int numInteiro = scanner.nextInt();
		
		int anterior = 0;
		int atual = 1;
		
		boolean status = false;
		
		for (int i = 0; anterior <= numInteiro ; i++) {
			
			if (anterior == numInteiro) {
				status = true;
			}	
			
			int proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}
		
		if (status) {
			System.out.print("esta na sequencia");
		} else {
			System.out.print("nao esta na sequencia");
		}
	
	}
}

