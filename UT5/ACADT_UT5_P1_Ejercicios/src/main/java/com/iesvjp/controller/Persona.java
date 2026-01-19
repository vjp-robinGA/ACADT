package com.iesvjp.controller;

public class Persona {

	// Atributos
	
	private String nombre, apellidos;
	private int edad;
	
	// Constructores
	
	public Persona() {
		
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		
	}
	
	// Getter y Setter
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getApellidos() {
		
		return apellidos;
		
	}
	
	public void setApellidos(String apellidos) {
		
		this.apellidos = apellidos;
		
	}
	
	public int getEdad() {
		
		return edad;
		
	}
	
	public void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	
}
