package br.com.generation.projeto_bloco1;

public class Crianca extends Pessoa{

	private int id;
	private int idade;
	private String pedido;
	private double valor;
	private String regiao;
	private String endereco;
	
	public Crianca(int id, String n, int t, int idade, String pedido, double valor, String regiao, String endereco) {
		super(n, t);
		this.id = id;
		this.idade = idade;
		this.pedido = pedido;
		this.valor = valor;
		this.regiao = regiao;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
}
