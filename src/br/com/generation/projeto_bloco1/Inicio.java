package br.com.generation.projeto_bloco1;

import java.util.Scanner;

public class Inicio {

	static Scanner read = new Scanner(System.in);
	
	public static Beneficiador iniciar() {
		System.out.println("Bem-Vindo!");
		
		System.out.println("Digite seu nome: ");
		String nome = read.nextLine();
		
		System.out.println("Digite sua região: ");
		String regiao = read.nextLine();
		
		System.out.println("Digite seu telefone: ");
		int telefone = read.nextInt();
		
		System.out.println("Digite seu email: ");
		String email = read.nextLine();
		
		System.out.println("Escolha a idade de preferência pra criança que deseja apadrinhar: " + 
							"\nA. Zona Norte" + "\nB. Zona Leste" + "\nC. Zona Sul" + "\nD. Zona Oeste" + "\nE. Centro");
		char regiaoP = read.next().charAt(0);
		
		System.out.println("Escolha a idade de preferência pra criança que deseja apadrinhar: " + 
							"\nA. 0 a 5" + "\n5 a 10 " + "\n10 a 15" + "\nMais de 15");
		char idadeP = read.next().charAt(0);
		
		System.out.println("Escolha o valor que está disposto a gastar no presente da criança: " +
							"\nA. Até R$ 20" + "\nB. Até R$ 50" + "\nC. Até R$ 100" + "\nD. Mais de R$ 100");
		char valorP = read.next().charAt(0);
		
		Beneficiador b = new Beneficiador(nome, regiao, telefone, email, regiaoP, idadeP, valorP);
		
		return b;
	}
	
}
