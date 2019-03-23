/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.List;

/**
 * Clase que representa la tabla del tipo de producto
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:39:41
 */
public class TipoProducto {
	private int idTipoPro;
	private String nombreTipoPro;
	private String descripcionTipoPro;
	private List<Producto> productos;

	public TipoProducto() {

	}
	
	

	/**
	 * @param idTipoPro
	 * @param nombreTipoPro
	 * @param descripcionTipoPro
	 * @param productos
	 */
	public TipoProducto(int idTipoPro, String nombreTipoPro, String descripcionTipoPro, List<Producto> productos) {
		super();
		this.idTipoPro = idTipoPro;
		this.nombreTipoPro = nombreTipoPro;
		this.descripcionTipoPro = descripcionTipoPro;
		this.productos = productos;
	}



	/**
	 * @return the idTipoPro
	 */
	public int getIdTipoPro() {
		return idTipoPro;
	}

	/**
	 * @param idTipoPro the idTipoPro to set
	 */
	public void setIdTipoPro(int idTipoPro) {
		this.idTipoPro = idTipoPro;
	}

	/**
	 * @return the nombreTipoPro
	 */
	public String getNombreTipoPro() {
		return nombreTipoPro;
	}

	/**
	 * @param nombreTipoPro the nombreTipoPro to set
	 */
	public void setNombreTipoPro(String nombreTipoPro) {
		this.nombreTipoPro = nombreTipoPro;
	}

	/**
	 * @return the descripcionTipoPro
	 */
	public String getDescripcionTipoPro() {
		return descripcionTipoPro;
	}

	/**
	 * @param descripcionTipoPro the descripcionTipoPro to set
	 */
	public void setDescripcionTipoPro(String descripcionTipoPro) {
		this.descripcionTipoPro = descripcionTipoPro;
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

	@Override
	public String toString() {
		return "TipoProducto [ID Tipo Producto=" + idTipoPro + ", Nombre Tipo Producto=" + nombreTipoPro
				+ ", Descripcion Tipo Producto=" + descripcionTipoPro + "]";
	}

}
