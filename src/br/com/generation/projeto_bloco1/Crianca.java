package br.com.generation.projeto_bloco1;

public class Crianca extends Pessoa{

	private int idade;
	private String pedido;
	private double valor;
	private String endereco;
	
	public Crianca(String n, String r, int t, int i, String p, double v, String e) {
		super(n, r, t);
		idade = i;
		pedido = p;
		valor = v;
		endereco = e;	
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
