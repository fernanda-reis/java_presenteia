package br.com.generation.projeto_bloco1;

import java.util.ArrayList;

public class ListaCriancas {

	static Crianca[] listaCriancas = new Crianca[10];
	static ArrayList<Crianca> listaCriancasIdade = new ArrayList<>();
	static ArrayList<Crianca> listaCriancasRegiao = new ArrayList<>();
	static ArrayList<Crianca> listaCriancasValor = new ArrayList<>();
	static ArrayList<Crianca> melhorMatch = new ArrayList<>();



	public static Crianca[] listarCriancas() {
		
		Crianca c1 = new Crianca(1, "Ana", 12943586, 10, "Tênis", 55, "Zona Sul", "Rua Mariano Gonçalves, n° 83");		
		listaCriancas[0] = c1;		
		
		Crianca c2 = new Crianca(2, "Bruno", 84756947, 9, "Teatro - Frozen no Natal", 20, "Centro", "Rua Florêncio Magalhães, n° 42");
		listaCriancas[1] = c2;
		
		Crianca c3 = new Crianca(3, "Julia", 73645739, 8, "Vestido", 50, "Zona Norte", "Rua Joselino Bismarck, n° 55");
		listaCriancas[2] = c3;
		
		Crianca c4 = new Crianca(4, "Henrique", 33459084, 5, "Circo Show - Patati Patatá", 45, "Zona Leste", "Rua Amaral Bueno, n° 11");
		listaCriancas[3] = c4;
		
		Crianca c5 = new Crianca(5, "Paula", 99876543, 12, "Boneca", 65, "Zona Oeste", "Rua dos Estudantes, n° 100");
		listaCriancas[4] = c5;
		
		Crianca c6 = new Crianca(6, "Marcelo", 76453896, 16, "Skate", 100, "Zona Sul", "Rua Francisco Penteado, n° 98");
		listaCriancas[5] = c6;
		
		Crianca c7 = new Crianca(7, "Gabriela", 12345678, 11, "Bicicleta", 120, "Centro", "Rua Tomás Aquino, n° 30");
		listaCriancas[6] = c7;
		
		Crianca c8 = new Crianca(8, "Leonardo", 18273486, 13, "Jaqueta", 40, "Zona Norte", "Rua das Graças, n° 5");
		listaCriancas[7] = c8;
		
		Crianca c9 = new Crianca(9, "Fernanda", 98234502, 3, "Barbie", 50, "Zona Sul", "Rua Doutor Amaral, n° 60");
		listaCriancas[8] = c9;
		
		Crianca c10 = new Crianca(10, "David", 92734581, 10, "Tamagochi", 15, "Zona Oeste", "Rua Leandro Leal, n° 30");
		listaCriancas[9] = c10;
		
		return listaCriancas;
		
	}
	
	public static void listarCriancasCompativeisIdade(Crianca[] listaCriancas, Beneficiador beneficiario ) {
		
		for(int i = 0; i < listaCriancas.length; i++) {			
			
			//Preferencia de idade
			int idade = beneficiario.getIdadePref();
			
			if(idade == 1) {
				if(listaCriancas[i].getIdade() <= 5) {
					listaCriancasIdade.add(listaCriancas[i]);
				}
			} else if (idade == 2) {
				if(listaCriancas[i].getIdade() > 5 && listaCriancas[i].getIdade() <= 10) {
					listaCriancasIdade.add(listaCriancas[i]);
				}
			} else if (idade == 3) {
				if(listaCriancas[i].getIdade() > 10 && listaCriancas[i].getIdade() <= 15) {
					listaCriancasIdade.add(listaCriancas[i]);
				}
			} else if (idade == 4) {
				if(listaCriancas[i].getIdade() > 15) {
					listaCriancasIdade.add(listaCriancas[i]);
				}
			}
		}
		
		System.out.println("\n========== Crianças compatíveis com a faixa etária escolhida: ==========");
		for(Crianca c : listaCriancasIdade) {
			System.out.println("ID: " + c.getId() + " | " + c.getNome() + " | " + c.getIdade() + " anos | " + " (" + c.getRegiao() + ") | " + c.getPedido() + " (R$ " + c.getValor() + ")");
		}
		System.out.println();
	}
	
	public static void listarCriancasCompativeisRegiao(Crianca[] listaCriancas, Beneficiador beneficiario ) {
			
		for(int i = 0; i < listaCriancas.length; i++) {			

			//Preferencia de região
			int regiao = beneficiario.getRegiaoPref();
			
			if(regiao == 1) {
				if(listaCriancas[i].getRegiao().equals("Zona Norte")) {
					listaCriancasRegiao.add(listaCriancas[i]);
				}
			} else if (regiao == 2) {
				if(listaCriancas[i].getRegiao().equals("Zona Leste")) {
					listaCriancasRegiao.add(listaCriancas[i]);
				}
			} else if (regiao == 3) {
				if(listaCriancas[i].getRegiao().equals("Zona Sul")) {
					listaCriancasRegiao.add(listaCriancas[i]);
				}
			} else if (regiao == 4) {
				if(listaCriancas[i].getRegiao().equals("Zona Oeste")) {
					listaCriancasRegiao.add(listaCriancas[i]);
				}
			} else if (regiao == 5) {
				if(listaCriancas[i].getRegiao().equals("Centro")) {
					listaCriancasRegiao.add(listaCriancas[i]);
				}
			}
		}
		
		System.out.println("\n========== Crianças compatíveis com a região escolhida: ==========");
		for(Crianca c : listaCriancasRegiao) {
			System.out.println("ID: " + c.getId() + " | " + c.getNome() + " | " + c.getIdade() + " anos | " + " (" + c.getRegiao() + ") | " + c.getPedido() + " (R$ " + c.getValor() + ")");
		}
		System.out.println();
	}
	
	public static void listarCriancasCompativeisValor(Crianca[] listaCriancas, Beneficiador beneficiario ) {

		for(int i = 0; i < listaCriancas.length; i++) {			

			//Preferencia de valor do presente
			int valor = beneficiario.getValorPref();
			
			if(valor == 1) {
				if(listaCriancas[i].getValor() <= 20) {
					listaCriancasValor.add(listaCriancas[i]);
				}
			} else if(valor == 2) {
				if(listaCriancas[i].getValor() <= 50) {
					listaCriancasValor.add(listaCriancas[i]);
				}
			} else if(valor == 3) {
				if(listaCriancas[i].getValor() <= 100) {
					listaCriancasValor.add(listaCriancas[i]);
				}
			} else if(valor == 4) {
				listaCriancasValor.add(listaCriancas[i]);
			}
		}
		
		
		System.out.println("\n========== Crianças compatíveis com a faixa de valor escolhida para o presente: ==========");
		for(Crianca c : listaCriancasValor) {
			System.out.println("ID: " + c.getId() + " | " + c.getNome() + " | " + c.getIdade() + " anos | " + " (" + c.getRegiao() + ") | " + c.getPedido() + " (R$ " + c.getValor() + ")");
		}
		System.out.println();
	
	}
	
	public static void listarMehorCompatibilidade(Crianca[] listaCriancas, Beneficiador beneficiario ) {
		
		
		for(Crianca i : listaCriancasIdade) {
			if(listaCriancasRegiao.contains(i) || listaCriancasValor.contains(i)) {
				if(!melhorMatch.contains(i)) {
					melhorMatch.add(i);

				}
			}
		}
		
		for(Crianca r : listaCriancasRegiao) {
			if(listaCriancasIdade.contains(r) || listaCriancasValor.contains(r)) {
				if(!melhorMatch.contains(r)) {
					melhorMatch.add(r);

				}
			}
		}
		
		
		
		System.out.println("\n========== Crianças com maior compatibilidade: ==========");
		
		if(melhorMatch.isEmpty()) {
			System.out.println("Não há registros.");
		} else {
			for(Crianca c : melhorMatch) {
				System.out.println("ID: " + c.getId() + " | " + c.getNome() + " | " + c.getIdade() + " anos | " + " (" + c.getRegiao() + ") | " + c.getPedido() + " (R$ " + c.getValor() + ")");
			}
			System.out.println();
		}
	}
	
}
