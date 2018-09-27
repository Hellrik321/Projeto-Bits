package lista_q1;

import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		Pessoa[] p = new Pessoa[3];
		
		Pessoa maior =  new Pessoa("p", 0);
		Pessoa menor = new Pessoa("p", 99999999);
		
		for(int i = 0; i < p.length; i++) {
			p[i] = new Pessoa(e.nextLine(), e.nextInt());
			e.nextLine();
			
			if(maior.getIdade() < p[i].getIdade())
				maior = p[i];
			
			if(menor.getIdade() > p[i].getIdade())
				menor = p[i];
		}
		
		e.close();
		
		System.out.println("Maior idade: " + maior.getNome());
		System.out.println("Menor idade:" + menor.getNome());
		
	}
}
