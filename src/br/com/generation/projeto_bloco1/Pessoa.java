package br.com.generation.projeto_bloco1;

public class Pessoa {
	private String nome;
	private String regiao;
	private int telefone;
	
	public Pessoa(String n, String r, int t) {
		nome = n;
		regiao = r;
		telefone = t;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
