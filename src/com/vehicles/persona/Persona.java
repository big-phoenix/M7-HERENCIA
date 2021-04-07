package com.vehicles.persona;

import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
	
	protected String nom;
	protected String cognom;
	protected Date data_naixement;
	protected Llicencia llicencia;
	
	public Persona(String nom, String cognom, int ano, int mes, int dia, Llicencia llicencia) {
		
		this.nom = nom;
		this.cognom = cognom;
		
		GregorianCalendar calendar = new GregorianCalendar(ano,mes-1,dia);
		this.data_naixement = calendar.getTime();
		
		this.llicencia = llicencia;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getCognom() {
		return cognom;
	}
	
	public Date getData_Naixement() {
		return data_naixement;
	}

	public Llicencia getLlicencia() {
		return llicencia;
	}
	
}
