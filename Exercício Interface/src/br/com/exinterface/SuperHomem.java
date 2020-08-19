package br.com.exinterface;

public class SuperHomem implements Voador {
	
	private int exp;

	@Override
	public void voar() {
		System.out.println("Estou voando como um campeão!");
		this.exp += 3;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public SuperHomem() {
		super();
		this.exp = 3;
	}	
}
