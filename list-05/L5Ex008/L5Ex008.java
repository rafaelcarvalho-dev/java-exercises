import java.util.Scanner;

public class L5Ex008 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int horaInicio;
		int horaFim;
		
		System.out.print("informe a hora de inicio da partida: ");
		horaInicio = scanner.nextInt();
		System.out.print("informe a hora de fim da partida: ");
		horaFim = scanner.nextInt();
		
		int duracao;
		
		if (horaFim > 24 || horaInicio > 24) {
			System.out.println("a partida nao eh valida!");
		} else {
			if (horaFim > horaInicio) {
				duracao = (horaFim - horaInicio);
				System.out.println("a partida durou " + duracao + " horas.");
			} else if (horaFim == horaInicio) {
				System.out.println("a partida durou 24 horas.");
			} else {
				duracao = (24 - horaInicio) + horaFim;
				System.out.println("a partida comecou " + horaInicio + " horas, acabou " + horaFim + " horas durando " + duracao + " horas terminando no dia seguinte.");
			
			}

		}
	}
}

