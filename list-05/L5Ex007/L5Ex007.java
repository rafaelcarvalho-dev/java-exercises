import java.util.Scanner;

public class L5Ex007 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.print("informe o primeiro valor: ");
		valor1 = leia.nextInt();
		
		System.out.print("informe o segundo valor: ");
		valor2 = leia.nextInt();
		
		if (valor1 == valor2) {
			
			System.out.print("valores inválidos!\n");
			
			System.out.print("informe o primeiro valor: ");
			valor1 = leia.nextInt();
		
			System.out.print("informe o segundo valor: ");
			valor2 = leia.nextInt();
			
		} else if (valor1 > valor2) {
			
			System.out.print("os valores não estão em ordem crescente...\n");
			
			System.out.print("informe o primeiro valor: ");
			valor1 = leia.nextInt();
		
			System.out.print("informe o segundo valor: ");
			valor2 = leia.nextInt();
			
		} else {
			
			System.out.print("os valores estão em ordem crescente!");
			
		}
	}
}

