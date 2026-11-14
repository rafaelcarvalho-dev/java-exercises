import java.util.Scanner;

public class L4Ex007 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hora;
		
		double horaAleatoria = Math.round((Math.random() * 24));
		
		int condicao;
		
		System.out.print("hora aleatória digite 1\nhora manualmente digite 2: ");
		condicao = scanner.nextInt();
		
		if (condicao == 2) {
			
			System.out.print("informe a hora: ");
			hora = scanner.nextInt();
		
				if (hora >= 0 && hora <= 6) {
					System.out.println("zzzzz");
				} else if (hora >= 7 && hora <= 11) {
					System.out.println("bom dia");
				}else if (hora >= 12 && hora <= 17) {
					System.out.println("boa tarde");
				}else {
					System.out.println("boa noite");
				}
				
		} else {
			
			System.out.println("a hora gerada foi " + horaAleatoria + " horas");
			
				if (horaAleatoria >= 0 && horaAleatoria <= 6) {
					System.out.println("zzzzz");
				} else if (horaAleatoria >= 7 && horaAleatoria <= 11) {
					System.out.println("bom dia");
				}else if (horaAleatoria >= 12 && horaAleatoria <= 17) {
					System.out.println("boa tarde");
				}else {
					System.out.println("boa noite");
				}
				
		}
		
	}
}

