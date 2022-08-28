package com.educacionit.jse.integrador.entidades;

public class Producto {
	private int id;
	private double precio;
	private String descripcion;

	public Producto() {
	}

	public Producto(double precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", descripcion=" + descripcion + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}
