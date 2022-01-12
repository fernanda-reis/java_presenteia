package br.com.generation.projeto_bloco1;

public class Pessoa {
	private String nome;
	private int telefone;
	
	public Pessoa(String n, int t) {
		nome = n;
		telefone = t;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
