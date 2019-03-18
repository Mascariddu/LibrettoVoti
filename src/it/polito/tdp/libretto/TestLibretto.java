package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libretto l= new Libretto();
		
		l.add(new Voto(26,"Analisi I", LocalDate.of(2017, 1, 16)));
		l.add(new Voto(24,"Analisi II", LocalDate.of(2018, 1, 16)));
		l.add(new Voto(22,"Fisica I", LocalDate.of(2017, 7, 16)));
		l.add(new Voto(18,"Fisica II", LocalDate.of(2018, 1, 18)));
		l.add(new Voto(25,"Geometria", LocalDate.of(2017, 6, 16)));
		l.add(new Voto(29,"Economia", LocalDate.of(2018, 6, 16)));
		l.add(new Voto(25,"Ricerca Operativa", LocalDate.of(2018, 7, 12)));
		l.add(new Voto(30,"Informatica", LocalDate.of(2017, 1, 28)));
		l.add(new Voto(28,"Diritto", LocalDate.of(2018, 1, 15)));
		l.add(new Voto(27,"Programmazione Oggetti", LocalDate.of(2018, 1, 29)));
		l.add(new Voto(24,"PGP", LocalDate.of(2018, 1, 31)));
		l.add(new Voto(28,"Sistemi di produzione", LocalDate.of(2018, 6, 23)));
		
		//Punto 1
		System.out.println("Lista: \n");
		System.out.println(l.lista());
		
		//Punto 2
		List<Voto> venticinque = l.CercaVoto(25);
		for (Voto v: venticinque) {
		System.out.println(v.stampa());
		}
		
		//Punto 3
		System.out.println((l.CercaCorso("Economia")).getPunteggio());
		System.out.println((l.CercaCorso("Analisi I")).getPunteggio());
		
		//Punto 4
		Voto v= new Voto(28,"Sistemi di produzione", LocalDate.of(2018, 6, 23));
		l.add(v);
		System.out.println(l.esistenza(v));
		
		//Punto 5
		Voto voto= new Voto(28,"Economia", LocalDate.of(2018, 6, 23));
		l.add(voto);
		System.out.println(l.conflitto(voto));
	
		//Punto 6
		
	}

}
