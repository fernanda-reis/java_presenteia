package br.com.generation.projeto_bloco1;

import java.util.Scanner;

public class Doacao {

	Beneficiador beneficiadorDoacao;
	Crianca criancaDoacao;
	
	static Scanner read = new Scanner(System.in);
	
	public static void novaDoacao(Crianca[] lista, Beneficiador beneficiador) {
		
		Doacao doacao = new Doacao();
		
		int numero = lista.length;
		int id = validarId(numero);
		
		//read.nextLine();

		for(int i = 0; i < lista.length; i++) {
			if(lista[i].getId() == id) {
				doacao.criancaDoacao = lista[i];
			}
		}
		

		doacao.beneficiadorDoacao = beneficiador;
		
		relatorioDoacao(doacao);
	}
	
	
	private static int validarId(int numeroMaximo) {
		int opcao = 0;
		do {
	    	System.out.println("\nDigite o ID da criança que deseja apadrinhar: ");
		    String next = read.next();
		    try {
		        opcao = Integer.parseInt(next);
		    } catch (NumberFormatException exp) {
		    }
		} while (opcao < 1 || opcao > numeroMaximo);
		
		return opcao;
	}

	private static void relatorioDoacao(Doacao doacao) {
		System.out.println("\n========== Relatório da Doação ==========");
		System.out.println();
		
		System.out.println("BENEFICIADOR: " + 
							"\nNome: " + doacao.beneficiadorDoacao.getNome() +
							"\nTelefone: " + doacao.beneficiadorDoacao.getTelefone() +
							"\nEmail: " + doacao.beneficiadorDoacao.getEmail()
							);
		System.out.println();
		
		System.out.println("CRIANÇA: " + 
				"\nNome: " + doacao.criancaDoacao.getNome() +
				"\nIdade: " + doacao.criancaDoacao.getIdade() +
				"\nTelefone: " + doacao.criancaDoacao.getTelefone() +
				"\nEndereço: " + doacao.criancaDoacao.getEndereco() + " - " + doacao.criancaDoacao.getRegiao() +
				"\nPedido de Natal: " + doacao.criancaDoacao.getPedido() + " (R$" + doacao.criancaDoacao.getValor() + ")"
				);
		System.out.println();
							
		System.out.println("\nAgradecemos por sua doação!");
		
	}

	
}
