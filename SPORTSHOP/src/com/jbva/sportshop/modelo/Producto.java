/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.math.BigDecimal;


/**
 * Clase para representar la tabla de producto
 * @author Joel
 *
 * 25 feb. 2019 - 10:33:46
 */
public class Producto {
	private int idProd;
	private String nombreProd;
	private int pesoProd;
	private BigDecimal costoProd;
	private TipoProducto tipoProducto;
	private Proveedor proveedor;
	/**
	 * @param idProd
	 * @param nombreProd
	 * @param pesoProd
	 * @param costoProd
	 * @param tipoProducto
	 * @param proveedor
	 */
	public Producto(int idProd, String nombreProd, int pesoProd, BigDecimal costoProd, TipoProducto tipoProducto,
			Proveedor proveedor) {
		super();
		this.idProd = idProd;
		this.nombreProd = nombreProd;
		this.pesoProd = pesoProd;
		this.costoProd = costoProd;
		this.tipoProducto = tipoProducto;
		this.proveedor = proveedor;
	}
	/**
	 * @return the idProd
	 */
	public int getIdProd() {
		return idProd;
	}
	/**
	 * @param idProd the idProd to set
	 */
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	/**
	 * @return the nombreProd
	 */
	public String getNombreProd() {
		return nombreProd;
	}
	/**
	 * @param nombreProd the nombreProd to set
	 */
	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}
	/**
	 * @return the pesoProd
	 */
	public int getPesoProd() {
		return pesoProd;
	}
	/**
	 * @param pesoProd the pesoProd to set
	 */
	public void setPesoProd(int pesoProd) {
		this.pesoProd = pesoProd;
	}
	/**
	 * @return the costoProd
	 */
	public BigDecimal getCostoProd() {
		return costoProd;
	}
	/**
	 * @param costoProd the costoProd to set
	 */
	public void setCostoProd(BigDecimal costoProd) {
		this.costoProd = costoProd;
	}
	/**
	 * @return the tipoProducto
	 */
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}
	/**
	 * @param tipoProducto the tipoProducto to set
	 */
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}
	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProd;
		result = prime * result + ((nombreProd == null) ? 0 : nombreProd.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (idProd != other.idProd)
			return false;
		if (nombreProd == null) {
			if (other.nombreProd != null)
				return false;
		} else if (!nombreProd.equals(other.nombreProd))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Producto [idProd=" + idProd + ", nombreProd=" + nombreProd + ", pesoProd=" + pesoProd + ", costoProd="
				+ costoProd + ", tipoProducto=" + getTipoProducto().getNombreTipoPro()+ ", proveedor=" + getProveedor().getNombreProv()+"]";
	}
	
	
	

}
