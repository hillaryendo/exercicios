package br.com.exinterface;

public class Aviao implements Voador {

	private int horas;
	
	@Override
	public void voar() {
		System.out.println("Estou voando como um avião, e tenho " + horas + " horas de voo.");
		this.horas = 3;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public Aviao() {
		super();
		this.horas = 13;
	}

}
