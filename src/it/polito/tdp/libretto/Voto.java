package it.polito.tdp.libretto;

import java.time.*;

public class Voto {
	
	private int punteggio;
	private String corso;
	private LocalDate data;
	
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punteggio = voto;
		this.corso = corso;
		this.data = data;
	}
	
	public int getPunteggio() {
		return punteggio;
	}
	
	public void setVoto(int voto) {
		this.punteggio = voto;
	}
	
	public String getCorso() {
		return corso;
	}
	
	public void setCorso(String corso) {
		this.corso = corso;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public String stampa() {
		return "Punteggio: "+this.punteggio+", corso: "+this.corso+", data: "+this.data+"\n";
	}
}
