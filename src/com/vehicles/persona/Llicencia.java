package com.vehicles.persona;

import java.util.*;

public class Llicencia {
	
	private int ID;
	private String tipus;
	private String nom;
	private Date caducidad;
	
	public Llicencia(int ID, String tipus, String nom, int ano, int mes, int dia) {
		
		this.ID = ID;
		this.tipus = tipus;
		this.nom = nom;
		
		GregorianCalendar calendar = new GregorianCalendar(ano,mes-1,dia);
		this.caducidad = calendar.getTime();
		
	}
	
	public int getID() {
		return ID;
	}
	
	public String getTipus() {
		return tipus;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Date getCaducidad() {
		return caducidad;
	}

}
