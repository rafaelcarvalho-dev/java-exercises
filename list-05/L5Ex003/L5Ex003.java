import java.util.Scanner;

public class  L5Ex003 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double fruta;
		
		System.out.print("quantas maçãs foram compradas? ");
		fruta = scanner.nextDouble();
		
		if (fruta < 12) {
			double valorFruta = fruta * 1.30f;
			System.out.printf("foram compradas %.0f maçãs\no total da compra foi de %.2f reais", fruta, valorFruta);
		} else {
			double valorFruta = fruta * 1f;
			System.out.printf("foram compradas %.0f maçãs\no total da compra foi de %.2f reais", fruta, valorFruta);
		}
	}
}
