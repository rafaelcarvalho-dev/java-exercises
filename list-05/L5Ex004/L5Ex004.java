import java.util.Scanner;

public class L5Ex004 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float primeiraNota;
		float segundaNota;
		
		System.out.print("informe a primeira nota: ");
		primeiraNota = leia.nextFloat();
		
		System.out.print("informe a segunda nota: ");
		segundaNota = leia.nextFloat();
		
		float media = (primeiraNota + segundaNota) / 2; 
		
		if (media >= 6) {
			System.out.printf("aluno aprovado!%nsua média foi %.2f", media);
		} else {
			System.out.printf("aluno reprovado!%nsua média foi %.2f", media);
		}
	}
}

