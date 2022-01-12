package br.com.generation.projeto_bloco1;

import java.util.Scanner;

public class Cadastro {

	static Scanner read = new Scanner(System.in);
	
	public static Beneficiador cadastroBeneficiador() {
		System.out.println("Bem-Vinde!");
		System.out.println("Estamos muito felizes que voc� tenha decidido iluminar o Natal de uma crian�a.");
		System.out.println("Vamos come�ar?");
		System.out.println();
		
		
		System.out.println("Digite seu nome: ");
		String nome = read.nextLine();
		
		System.out.println();

		System.out.println("Digite seu email: ");
		String email = read.nextLine();
		
		System.out.println();
		
	    System.out.println("Digite seu telefone: ");
	      while(!read.hasNextInt()) {
	          read.next();
	          System.out.println("Digite apenas n�meros!");
	          System.out.println("Digite seu telefone: ");
	          }

	    int telefone = read.nextInt();
			
		System.out.println();

		System.out.println("Escolha a op��o de regi�o de prefer�ncia da crian�a que deseja apadrinhar: " + 
							"\n1. Zona Norte" + "\n2. Zona Leste" + "\n3. Zona Sul" + "\n4. Zona Oeste" + "\n5. Centro");		
		int regiaoP = validar(5);
		
		System.out.println();
		
		System.out.println("Escolha a op��o de idade de prefer�ncia da crian�a que deseja apadrinhar: " + 
							"\n1. 0 a 5" + "\n2. 6 a 10 " + "\n3. 11 a 15" + "\n4. Mais de 15");
		int idadeP = validar(4);
		
		System.out.println();

		System.out.println("Escolha a op��o do valor que est� disposto a gastar no presente de natal da crian�a: " +
							"\n1. At� R$ 20" + "\n2. At� R$ 50" + "\n3. At� R$ 100" + "\n4. Mais de R$ 100");
		int valorP = validar(4);
		
		System.out.println();

		Beneficiador b = new Beneficiador(nome, telefone, email, idadeP, regiaoP, valorP);
		
		return b;
	}
	
	private static int validar(int qtdeOpcoes) {
		int opcao = 0;
		do {
		    System.out.print("Digite uma op��o de 1 a " + qtdeOpcoes + ": ");
		    String next = read.next();
		    try {
		        opcao = Integer.parseInt(next);
		    } catch (NumberFormatException exp) {
		    	
		    }
		} while (opcao < 1 || opcao > qtdeOpcoes);
		
		return opcao;
	}
}
