import java.util.Scanner;

public class L6Ex011 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double numAluno;
		
		System.out.print("quantos alunos tem na turma: ");
		numAluno = scanner.nextDouble();
		
		double acumulaNota = 0;
		
		for (int i = 1; i <= numAluno; i++) {
			System.out.print("qual a nota do aluno " + i + ": ");
			double nota = scanner.nextDouble();
			
			acumulaNota += nota;
		}
		
		System.out.printf("A media dos %.0f alunos da turma eh: %.1f", numAluno, (acumulaNota / numAluno));
	}
}

