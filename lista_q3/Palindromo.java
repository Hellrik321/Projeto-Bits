package lista_q3;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		int p = e.nextInt();
		e.nextLine();
		
		while(Integer.toString(p).length() != 5) {
			System.out.println("Erro: o valor digitado possui uma quantidade de digitos diferente de 5");
			System.out.println("Digite um novo n�mero:");
			
			p = e.nextInt();
			e.nextLine();
		}
		
		e.close();
		
		String p1 = Integer.toString(p);
		StringBuffer p2 = new StringBuffer(p1).reverse();
		String p3 = p2.toString();
		
		if(p1.equals(p3))
			System.out.println("O valor digitado � um palindromo");
		else
			System.out.println("O valor digitado n�o � um palindromo");
			
			
		
	}

}
