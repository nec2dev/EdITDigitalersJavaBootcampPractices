package com.educacionit.jse.integrador.entidades;

public class Cliente extends Persona {
	int numeroCliente;
	
	public Cliente() {
	}

	public Cliente(String nombre, String apellido, Domicilio domicilio, Telefono telefono, int numeroCliente) {
		super(nombre, apellido, domicilio, telefono);
		this.numeroCliente = numeroCliente;
	}
	
	@Override
	public String toString() {
		return super.toString() + ". Número de Cliente: " + numeroCliente;
	}


	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

}
