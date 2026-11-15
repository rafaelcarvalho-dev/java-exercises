import java.util.Scanner;

public class L5Ex010 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double salarioFixo, valorVenda;
		
		System.out.print("qual o salario fixo? ");
		salarioFixo = scanner.nextDouble();
		
		System.out.print("qual o valor das vendas? ");
		valorVenda = scanner.nextDouble();
		
		double comissao;
		
		if (valorVenda <= 1500) {
			comissao = salarioFixo + (valorVenda * 0.03);
			System.out.print(comissao);
		} else {
			System.out.print(((valorVenda - 1500) * 0.05) + (salarioFixo + (1500 * 0.03)));
		}
		
	}
}

