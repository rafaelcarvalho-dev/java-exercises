import java.util.Scanner;

public class  L6Ex009{
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int contIntervalo = 0;
		int contForaIntervalo = 0;
		
		for (int i = 1; i < 11; i++) {
			int num;
			
			System.out.print(i + ") numero: ");
			num = scanner.nextInt();
			
			if (num >= 10 && num <= 20) {
				contIntervalo++;
			} else {
				contForaIntervalo++;
			}
			
		}
		System.out.print("\ndentro do intervalo: " + contIntervalo + "\n" + "\nfora do intervalo: " + contForaIntervalo);
	}
}

