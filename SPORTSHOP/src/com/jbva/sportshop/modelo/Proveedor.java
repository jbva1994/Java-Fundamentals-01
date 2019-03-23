/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.List;



/**
 * Clase para representra la tabla del proveedor
 * 
 * @author Joel
 *
 *         25 feb. 2019 - 10:34:14
 */
public class Proveedor {

	private int idProveedor;
	private String nombreProv;
	private String descripcionProv;
	private List<Producto> productos;

	public Proveedor() {

	}

	

	/**
	 * @param idProveedor
	 * @param nombreProv
	 * @param descripcionProv
	 * @param productos
	 */
	public Proveedor(int idProveedor, String nombreProv, String descripcionProv, List<Producto> productos) {
		super();
		this.idProveedor = idProveedor;
		this.nombreProv = nombreProv;
		this.descripcionProv = descripcionProv;
		this.productos = productos;
	}



	/**
	 * @return the idProveedor
	 */
	public int getIdProveedor() {
		return idProveedor;
	}

	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	/**
	 * @return the nombreProv
	 */
	public String getNombreProv() {
		return nombreProv;
	}

	/**
	 * @param nombreProv the nombreProv to set
	 */
	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}

	/**
	 * @return the descripcionProv
	 */
	public String getDescripcionProv() {
		return descripcionProv;
	}

	/**
	 * @param descripcionProv the descripcionProv to set
	 */
	public void setDescripcionProv(String descripcionProv) {
		this.descripcionProv = descripcionProv;
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
		return "Proveedor [idProveedor=" + idProveedor + ", nombreProv=" + nombreProv + ", descripcionProv="
				+ descripcionProv + "]";
	}

}
