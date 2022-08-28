package com.educacionit.jse.integrador.main;

import com.educacionit.jse.integrador.entidades.Cliente;
import com.educacionit.jse.integrador.entidades.Domicilio;
import com.educacionit.jse.integrador.entidades.Producto;
import com.educacionit.jse.integrador.entidades.Telefono;

public class Main {

	public static void main(String[] args) {
		
		Telefono telefono = new Telefono("Laboral", "4393-2212");
		Domicilio domicilio = new  Domicilio(1243, "Lavalle", "CABA");
		Cliente cliente = new Cliente("Juan", "Perez", domicilio, telefono, 221212);
		Producto producto = new Producto(22.21,"Cafe Molido");
		
		System.out.println(cliente);
		System.out.println(producto);
				

	}

}
