package com.utn.clase8;

public class Persona {
	
	private String nombre;
	private String Apelido ;
	
	public Persona () {}
	
	public Persona (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelido() {
		return Apelido;
	}
	public void setApelido(String apelido) {
		Apelido = apelido;
	}
	
	

}
