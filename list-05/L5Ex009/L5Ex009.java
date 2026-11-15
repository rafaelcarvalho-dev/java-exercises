import java.util.Scanner;

public class L5Ex009 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double horaTrab;
		double salarioHora;
		
		System.out.print("qual o salario por hora: ");
		salarioHora = scanner.nextDouble();
		
		System.out.print("quantas horas trabalhadas no mes: ");
		horaTrab = scanner.nextDouble();
		
		double acrescimo = salarioHora + (salarioHora * 0.50);
		double salarioPadrao = horaTrab * salarioHora; 
		
		if ((horaTrab / 4) < 40) {
			System.out.print("o funcionario nao atingiu as horas semanais!");
		} else if ((horaTrab / 4) == 40) {
			System.out.print("o salario do funcionario é: " + salarioPadrao);
		} else {
			System.out.print("o salario do funcionario com acrescimo de 50% é: " + (salarioPadrao + acrescimo));
		}
	}
}

