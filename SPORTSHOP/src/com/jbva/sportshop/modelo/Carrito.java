/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.Date;

/**
 * Clase que representa el carrito de compra
 * 
 * @author Joel
 *
 *         25 feb. 2019 - 10:53:51
 */
public class Carrito extends Cliente {

	private String numeroProductos;
	private String tipoPago;
	private Date fechaPago;
	private double valorTotal;

	/**
	 * 
	 */
	public Carrito() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroProductos
	 * @param tipoPago
	 * @param fechaPago
	 * @param valorTotal
	 */
	public Carrito(String numeroProductos, String tipoPago, Date fechaPago, double valorTotal) {
		super();
		this.numeroProductos = numeroProductos;
		this.tipoPago = tipoPago;
		this.fechaPago = fechaPago;
		this.valorTotal = valorTotal;
	}

	/**
	 * @param id
	 * @param tipoCliente
	 * @param direccionEnvio
	 * @param numeroProductos
	 * @param tipoPago
	 * @param fechaPago
	 * @param valorTotal
	 */
	public Carrito(int id, String tipoCliente, String direccionEnvio, String numeroProductos, String tipoPago,
			Date fechaPago, double valorTotal) {
		super(id, tipoCliente, direccionEnvio);
		this.numeroProductos = numeroProductos;
		this.tipoPago = tipoPago;
		this.fechaPago = fechaPago;
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the numeroProductos
	 */
	public String getNumeroProductos() {
		return numeroProductos;
	}

	/**
	 * @param numeroProductos the numeroProductos to set
	 */
	public void setNumeroProductos(String numeroProductos) {
		this.numeroProductos = numeroProductos;
	}

	/**
	 * @return the tipoPago
	 */
	public String getTipoPago() {
		return tipoPago;
	}

	/**
	 * @param tipoPago the tipoPago to set
	 */
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	/**
	 * @return the fechaPago
	 */
	public Date getFechaPago() {
		return fechaPago;
	}

	/**
	 * @param fechaPago the fechaPago to set
	 */
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	/**
	 * @return the valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
