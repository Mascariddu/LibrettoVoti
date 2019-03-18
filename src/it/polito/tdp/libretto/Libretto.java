package it.polito.tdp.libretto;

import java.time.*;
import java.util.*;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto () {
		this.voti = new ArrayList<Voto>();
	}
	
	public void add(int voto, String corso, LocalDate data) {
		
	}
	
	public void add(Voto v) {
		voti.add(v);
	}
	
	public String lista() {
		
		String s="";
		for(Voto v: voti) {
			s+=v.getCorso()+", "+v.getPunteggio()+", "+v.getData()+"\n";
		}
		return s;
	}
	
	public List<Voto> CercaVoto(int voto){
		
		List<Voto> result = new ArrayList<Voto>();
		
		for(Voto v:  voti) {
			if(v.getPunteggio() == voto)
				result.add(v);
		}
		
		return result;
	}
	
	public Voto CercaCorso(String corso) {
		for(Voto v: voti) {
			if(v.getCorso().equals(corso))
				return v;
		}
		return null;
	}
	
	public boolean esistenza(Voto v) {
		for(Voto vot: voti) {
			if(vot.getCorso().equals(v.getCorso()))
				return true;
		}
		return false;
	}
	
}
