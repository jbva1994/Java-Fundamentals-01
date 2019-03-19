/**
 * 
 */
package ec.edu.cecepn.ecommerce.modelo;

import java.util.List;

/**
 * Clase que representa
 * 
 * @author jbva1994
 *
 *         28 feb. 2019 - 20:18:37
 */
public class TipoProducto {
	private int idTipPro;
	private String nombreTipPro;
	private String descripcionTipPro;
	// Relacion de muchos
	// OJO. En Java se mapea en ambos lados
	private List<Producto> productos;

	/**
	 * 
	 */
	public TipoProducto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the idTipPro
	 */
	public int getIdTipPro() {
		return idTipPro;
	}

	/**
	 * @param idTipPro the idTipPro to set
	 */
	public void setIdTipPro(int idTipPro) {
		this.idTipPro = idTipPro;
	}

	/**
	 * @return the nombreTipPro
	 */
	public String getNombreTipPro() {
		return nombreTipPro;
	}

	/**
	 * @param nombreTipPro the nombreTipPro to set
	 */
	public void setNombreTipPro(String nombreTipPro) {
		this.nombreTipPro = nombreTipPro;
	}

	/**
	 * @return the descripcionTipPro
	 */
	public String getDescripcionTipPro() {
		return descripcionTipPro;
	}

	/**
	 * @param descripcionTipPro the descripcionTipPro to set
	 */
	public void setDescripcionTipPro(String descripcionTipPro) {
		this.descripcionTipPro = descripcionTipPro;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	/*
	 *Para poder visualizar o mostrar los datos en pantalla
	 */
	@Override
	public String toString() {
		return "TipoProducto [idTipPro=" + idTipPro + ", nombreTipPro=" + nombreTipPro + ", descripcionTipPro="
				+ descripcionTipPro + "]";
	}

}
