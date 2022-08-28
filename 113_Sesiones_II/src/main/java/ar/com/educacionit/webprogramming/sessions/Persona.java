/*
 * Persona.java
 *
 */

package ar.com.educacionit.webprogramming.sessions;

/**
 *
 * @author Educacion IT
 */
public class Persona {
    
    /** Creates a new instance of Persona */
    public Persona() {
    }
    
    public Persona(String n, String a) {
        nombre = n;
        apellido = a;
    }
    
    // Atributos
    private String nombre;
    private String apellido;
    
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
    
}
