package br.com.exinterface;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        
		Pato pato = new Pato();
        Aviao aviao = new Aviao();
        SuperHomem superHomem = new SuperHomem();

        ArrayList<Voador> voadores = new ArrayList();
        voadores.add(pato);
        voadores.add(aviao);
        voadores.add(superHomem);
        TorreDeControle torreDeControle = new TorreDeControle(voadores);

        torreDeControle.voemTodos();

    }
}
