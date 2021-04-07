package com.vehicles.persona;

public class Titular extends Persona {
	
	private boolean segur;
	private boolean garatge;
	private Llicencia llicencia;

	public Titular(String nom, String cognom, int ano, int mes, int dia, Llicencia llicencia, boolean segur, boolean garatge) {
		super(nom, cognom, ano, mes, dia, llicencia);
		
		this.llicencia = llicencia;
		this.segur = segur;
		this.garatge = garatge;
	}
	
	public boolean getSegur() {
		return segur;
	}
	
	public boolean getGaratge() {
		return garatge;
	}
	
	public String getLlicencia(Llicencia llicencia) {
		return llicencia.getTipus();
	}
	
	public String info_Titular() {
		return "Nombre del Titular: " +nom+ " Apellido: " +cognom+ " Fecha de Nacimiento: " +data_naixement+ 
				" Licencia: " +llicencia+ " Segur: " +segur+ " Garatge: " +garatge;
	}

}
