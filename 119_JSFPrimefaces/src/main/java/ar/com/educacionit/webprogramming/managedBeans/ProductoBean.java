package ar.com.educacionit.webprogramming.managedBeans;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.educacionit.jse.integrador.baseDeDatos.ProductoDAO;
import com.educacionit.jse.integrador.entidades.Producto;
import com.educacionit.jse.integrador.excepciones.CafeStoreException;
import com.educacionit.jse.integrador.excepciones.NegocioException;
@ManagedBean(name = "productoBean")
@SessionScoped
public class ProductoBean {
	private Producto producto = new Producto();
	private String descripcion;
	
	public String busca() {
		try {
			producto = ProductoDAO.getProducto(descripcion);
		} catch (NegocioException e) {
			e.printStackTrace();
		} catch (CafeStoreException e) {
			e.printStackTrace();
		}
		return "buscado";
	}
	
	public String inserta() {
		try {
			ProductoDAO.inserta(producto);
		} catch (NegocioException e) {
			e.printStackTrace();
		} catch (CafeStoreException e) {
			e.printStackTrace();
		}
		return "insertado";
	}
	
	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
