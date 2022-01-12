package br.com.generation.projeto_bloco1;

public class Beneficiador extends Pessoa {

	private String email;
	private int idadePref;
	private int regiaoPref;
	private int valorPref;
	
	
	
	public Beneficiador(String n, int t) {
		super(n, t);
	}


	public Beneficiador(String n, int t, String e, int ip, int rp, int vp) {
		super(n, t);
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

	public int getIdadePref() {
		return idadePref;
	}

	public void setIdadePref(int idadePref) {
		this.idadePref = idadePref;
	}

	public int getRegiaoPref() {
		return regiaoPref;
	}

	public void setRegiaoPref(int regiaoPref) {
		this.regiaoPref = regiaoPref;
	}

	public int getValorPref() {
		return valorPref;
	}

	public void setValorPref(int valorPref) {
		this.valorPref = valorPref;
	}	

}
