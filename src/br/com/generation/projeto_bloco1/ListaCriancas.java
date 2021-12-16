package br.com.generation.projeto_bloco1;

public class ListaCriancas {
	
	private Crianca[] listaCriancas = new Crianca[10];

	
	public Crianca[] ListarCriancas() {
		Crianca c1 = new Crianca("Ana", "Zona Sul", 12943586, 10, "Tênis", 50, "Rua Mariano Gonçalves, n° 83");		
		listaCriancas[0] = c1;		
		
		Crianca c2 = new Crianca("Bruno", "Centro", 84756947, 9, "Bola", 20, "Rua Florêncio Magalhães, n° 42");
		listaCriancas[1] = c2;
		
		Crianca c3 = new Crianca("Julia", "Zona Norte", 73645739, 8, "Vestido", 50, "Rua Joselino Bismarck, n° 55");
		listaCriancas[2] = c3;
		
		Crianca c4 = new Crianca("Henrique", "Zona Leste", 33459084, 5, "Legos", 90, "Rua Amaral Bueno, n° 11");
		listaCriancas[3] = c4;
		
		Crianca c5 = new Crianca("Paula", "Zona Oeste", 99876543, 12, "Boneca", 60, "Rua dos Estudantes, n° 100");
		listaCriancas[4] = c5;
		
		Crianca c6 = new Crianca("Marcelo", "Zona Sul", 76453896, 16, "Skate", 100, "Rua Francisco Penteado, n° 98");
		listaCriancas[5] = c6;
		
		Crianca c7 = new Crianca("Gabriela", "Centro", 12345678, 11, "Bicicleta", 120, "Rua Tomás Aquino, n° 30");
		listaCriancas[6] = c7;
		
		Crianca c8 = new Crianca("Leonardo", "Zona Norte", 18273486, 13, "Jaqueta", 60, "Rua das Graças, n° 5");
		listaCriancas[7] = c8;
		
		Crianca c9 = new Crianca("Fernanda", "Zona Sul", 98234502, 3, "Barbie", 50, "Rua Doutor Armando, n° 60");
		listaCriancas[8] = c9;
		
		Crianca c10 = new Crianca("David", "Zona Oeste", 92734581, 10, "Tamagochi", 80, "Rua Leandro Leal, n° 30");
		listaCriancas[9] = c10;
		
		Crianca c11 = new Crianca("Laura", "Zona Leste", 37456211, 7, "Bambolê", 20, "Rua Garibaldo Neves, n° 110");
		listaCriancas[10] = c11;
		
		return listaCriancas;
		
	}
	
//	public void exibirLista(Crianca[] listaCriancas, Beneficiador beneficiario ) {
//		for(int i = 0; i < listaCriancas.length; i++) {
//			
////			if (beneficiario.getIdadePref() == 'A') {
////				
////			}
////			else if (beneficiario.getIdadePref() == 'B') {
////				
////			}
//			
//			switch (beneficiario.getIdadePref()) {
//			case '
//				
//				
//				break;
//
//			default:
//				break;
//			}
// 			
//		}
//	}
	
}
