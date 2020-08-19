package br.com.exinterface;

public class Pato implements Voador {

	private int energia;
	
	@Override
	public void voar() {
		if (energia <= 5) {
			System.out.println("Estou voando como um pato.");
			this.energia = -5;
		} else {
			System.out.println("Não tenho energia suficiente para voar.");
		}
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public Pato() {
		super();
		this.energia = 100;
	}
	
}
