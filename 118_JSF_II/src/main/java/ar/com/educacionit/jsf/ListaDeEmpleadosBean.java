/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.jsf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Nicolás
 */
public class ListaDeEmpleadosBean {
    
    private List<Empleado> empleados;

    public ListaDeEmpleadosBean() {
        this.empleados = new ArrayList<Empleado>();
    }
    /**
     * @return the empleados
     */
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * @param empleados the empleados to set
     */
    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public void eliminarEmpleado(String dni) {
        for (Iterator<Empleado> it = empleados.iterator(); it.hasNext();) {
            Empleado empleado = it.next();
            if (dni.equalsIgnoreCase(empleado.getDni())) {
                it.remove();
                return;
            }
        }
    }

}
