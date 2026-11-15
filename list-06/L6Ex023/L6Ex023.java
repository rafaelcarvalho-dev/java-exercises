import java.util.Scanner;

public class L6Ex023 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double totalSalario = 0;
		int totalFilho = 0;
		double maiorSalario = 0;
		double habitanteSalario = 0;
		
		System.out.print("informe o numero de habitantes: ");
		int habitantes = scanner.nextInt();
		
		for (int i = 0; i < habitantes; i++) {
			
			System.out.print("informe seu salario: ");
			int salario = scanner.nextInt();
			
			System.out.print("informe a quantidade de filhos: ");
			int filhos = scanner.nextInt();
			
			totalSalario += salario;
			totalFilho += filhos;
			
			if (maiorSalario <= salario) {
				maiorSalario = salario;
			}
			
			if (salario < 150) {
				habitanteSalario++;
			}
			
		}
		
		System.out.print("media de salario: R$" + (totalSalario / habitantes) + "\nmaior salario: R$" + maiorSalario + "\nmedia de filhos: " + (totalFilho / habitantes) + "\npercentual de pessoas com salario menor que R$150: " + ((habitanteSalario / habitantes) * 100) + "%");
	}
}

