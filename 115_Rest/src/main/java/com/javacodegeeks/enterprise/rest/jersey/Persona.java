package com.javacodegeeks.enterprise.rest.jersey;

public class Persona {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;

	public Persona() {

	}

	public Persona(String fname, String lname, int age, int id) {
		this.nombre = fname;
		this.apellido = lname;
		this.edad = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return new StringBuffer(" Nombre : ").append(this.nombre).append(" Apellido : ").append(this.apellido)
				.append(" Edad : ").append(this.edad).append(" ID : ").append(this.id).toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}