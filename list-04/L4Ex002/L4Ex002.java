import java.util.Scanner;

public class L4Ex002 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float nota;
		
		System.out.print("informe sua nota: ");
		nota = scanner.nextFloat();
		
		if (nota >= 0 && nota <= 10) {
			
			if (nota >= 6) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
			
		} else {
			System.out.println("VALOR INVALIDO");
		}
		
	}
}

