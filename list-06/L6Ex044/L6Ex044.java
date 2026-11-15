import java.util.Scanner;

public class L6Ex044 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		int qntdTermos, num;
		
		int fatorial = 1;
		
		System.out.print("entre com um numero: ");
		num = scanner.nextInt();
			
		System.out.print("quantidade de termos: ");
		qntdTermos = scanner.nextInt();	
			
				
		for (int i = 1; i <= num; i++) {
					
			if (i <= qntdTermos) {
				fatorial *= i;
			}		
		}
		
		System.out.print("o fatorial de " + num + "! com " + qntdTermos + " termos eh: " + fatorial);
	
	}
}

