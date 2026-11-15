import java.util.Scanner;

public class L5Ex005 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		short anoAtual;
		short anoNascimento;
		
		System.out.print("em que ano você está: ");
		anoAtual = leia.nextShort();
		
		System.out.print("em que ano você nasceu: ");
		anoNascimento = leia.nextShort();
		
		if ((anoAtual - anoNascimento) >= 18 ) {
			System.out.print("você pode votar esse ano!");
		} else {
			System.out.print("você não pode votar esse ano!");
		}
	
	}
}

