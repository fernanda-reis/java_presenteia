package br.com.generation.projeto_bloco1;

public class Inicio {

	public static void iniciar() { 
	Crianca[] lista = ListaCriancas.listarCriancas();
	Beneficiador b = Cadastro.cadastroBeneficiador();

	
	ListaCriancas.listarCriancasCompativeisRegiao(lista, b);
	ListaCriancas.listarCriancasCompativeisIdade(lista, b);
	ListaCriancas.listarCriancasCompativeisValor(lista, b);
	ListaCriancas.listarMehorCompatibilidade(lista, b);
	
	Doacao.novaDoacao(lista, b);
	
	System.out.println("\nJava Presenteia® - Um projeto, muitos sorrisos.");
	
	}
}
