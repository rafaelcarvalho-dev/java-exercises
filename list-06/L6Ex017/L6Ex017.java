import java.util.Scanner;

public class L6Ex017 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String resposta;
		
			do {
				System.out.print("primeira nota: ");
				double nota1 = scanner.nextDouble();
		
				System.out.print("segunda nota: ");
				double nota2 = scanner.nextDouble();
		
				if (nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 < 0) {
					System.out.print("VALORES INVÁLIDOS!!!");
				} else {
					double media = (nota1 + nota2) / 2;
			
					System.out.printf("A media do aluno eh: %.1f%n", media);
				}
				
				scanner.nextLine();
				
				System.out.print("NOVO CALCULO (S/N)? ");
				resposta = scanner.nextLine();
				
			} while (!resposta.equals("nao"));
	}
}

