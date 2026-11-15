import java.util.Scanner;

public class L6Ex021 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		int soma = 0;
		
		System.out.print("informe a quantidade: ");
		int qntd = scanner.nextInt();
		
		for (int i = qntd; i > 0; i--) {
			
			System.out.print("entre com um numero: ");
			int num = scanner.nextInt();
				
			soma += num;	
				
			if (maior <= num) {
				maior = num;
			}
		}
		
		int media = soma / qntd;
		
		System.out.print("maior numero: " + maior + " e a media dos valores: " + media);
	}
}

