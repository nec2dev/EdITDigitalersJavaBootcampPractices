package com.educacionit.jse.integrador.entidades;

import com.educacionit.jse.integrador.utils.StringUtils;

/*
 * Persona.java
 *
 */

/**
 *
 * @author Sebastian S. Sanga <SebastianSanga@educacionIT.com.ar>
 */
public abstract class Persona {
	// Atributos
	private int id;
	private String nombre;
	private String apellido;
	private Telefono telefono;
	private Domicilio domicilio;

    /**
     * Creates a new instance of Persona
     */
    public Persona() {
    }

    public Persona(String nombre, String apellido, Domicilio domicilio, Telefono telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setDomicilio(domicilio);
        setTelefono(telefono);
    }


    public String toString() {
        return "Nombre: " + getNombreCompleto() + ". " + domicilio + ". " + telefono;
    }

    public String getNombreCompleto() {
		return StringUtils.wordToCamelCase(nombre) + ", " + StringUtils.wordToCamelCase(apellido);
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

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

  
}
