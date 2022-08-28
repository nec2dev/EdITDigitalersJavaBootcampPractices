/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.jsf;

/**
 *
 * @author Nicolás
 */
public class EmpleadoBean {
    private Empleado empleado = new Empleado();
    private ListaDeEmpleadosBean listaDeEmpleadosBean  = new ListaDeEmpleadosBean();


    /**
     * @param listaDeEmpleados the listaDeEmpleados to set
     */
    
    
    public String agregar() {
        
        this.getListaDeEmpleadosBean().agregarEmpleado(empleado);
        
        return "agregar";
    }
    
    public String eliminar() {
        
        this.getListaDeEmpleadosBean().eliminarEmpleado(empleado.getDni());
        return "agregar";
    }

    /**
     * @return the listaDeEmpleados
     */
   
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public ListaDeEmpleadosBean getListaDeEmpleadosBean() {
		return listaDeEmpleadosBean;
	}

	public void setListaDeEmpleadosBean(ListaDeEmpleadosBean listaDeEmpleadosBean) {
		this.listaDeEmpleadosBean = listaDeEmpleadosBean;
	}

  
}
