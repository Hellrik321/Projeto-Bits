package lista_q2;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		String nome;
		double nota;
		
		int numAlunos = e.nextInt();
		e.nextLine();
		
		Aluno diario[] = new Aluno[numAlunos];
		
		for(int i = 0; i < diario.length; i++) {
			
			System.out.println("Digite o nome do " + (i+1) + " aluno:");
			nome = e.nextLine();
			
			System.out.println("Digite a nota do " + (i+1) + " aluno:");
			nota = e.nextDouble();
			e.nextLine();
			
			diario[i] = new Aluno(nome, nota);
			
		}
		
		e.close();
		
		for(Aluno i : diario) {
			System.out.println(i.toString());
		}

	}

}
