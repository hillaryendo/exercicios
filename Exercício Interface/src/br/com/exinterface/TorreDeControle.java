package br.com.exinterface;

import java.util.ArrayList;

public class TorreDeControle {

	public ArrayList<Voador> voadores;
	
	public TorreDeControle(ArrayList<Voador> voadores) {
		super();
		this.voadores = voadores;
	}

	public ArrayList<Voador> getVoadores() {
		return voadores;
	}
	
	public void voemTodos() {
		for (int i = 0; i < voadores.size(); i++) {
			voadores.get(i).voar();
		}
	}	
}
