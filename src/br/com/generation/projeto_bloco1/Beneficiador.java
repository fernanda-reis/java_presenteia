package br.com.generation.projeto_bloco1;

public class Beneficiador extends Pessoa {

	private String email;
	private char idadePref;
	private char regiaoPref;
	private char valorPref;
	
	public Beneficiador(String n, String r, int t, String e, char ip, char rp, char vp) {
		super(n, r, t);
		email = e;
		idadePref = ip;
		regiaoPref = rp;
		valorPref = vp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getIdadePref() {
		return idadePref;
	}

	public void setIdadePref(char idadePref) {
		this.idadePref = idadePref;
	}

	public char getRegiaoPref() {
		return regiaoPref;
	}

	public void setRegiaoPref(char regiaoPref) {
		this.regiaoPref = regiaoPref;
	}

	public char getValorPref() {
		return valorPref;
	}

	public void setValorPref(char valorPref) {
		this.valorPref = valorPref;
	}

	

}
