package ar.com.educacionit.jsf;

public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private Double remuneracion;
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String dni, Double remuneracion) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.remuneracion = remuneracion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the remuneracion
     */
    public Double getRemuneracion() {
        return remuneracion;
    }

    /**
     * @param remuneracion the remuneracion to set
     */
    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }


}
