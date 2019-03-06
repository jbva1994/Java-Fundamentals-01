/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.Date;

/**
 * Clase que representa al cliente y hereda de la clase padre Persona
 * 
 * @author Joel
 *
 *         25 feb. 2019 - 10:53:38
 */
public class Cliente extends Persona {

	private int id;
	private String tipoCliente;
	private String direccionEnvio;

	/**
	 * 
	 */
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param tipoCliente
	 * @param direccionEnvio
	 */
	public Cliente(int id, String tipoCliente, String direccionEnvio) {
		super();
		this.id = id;
		this.tipoCliente = tipoCliente;
		this.direccionEnvio = direccionEnvio;
	}

	/**
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @param fechaNacimiento
	 * @param direccion
	 * @param telefono
	 * @param email
	 * @param id
	 * @param tipoCliente
	 * @param direccionEnvio
	 */
	public Cliente(String nombre, String apellido, String identificacion, Date fechaNacimiento, String direccion,
			String telefono, String email, int id, String tipoCliente, String direccionEnvio) {
		super(nombre, apellido, identificacion, fechaNacimiento, direccion, telefono, email);
		this.id = id;
		this.tipoCliente = tipoCliente;
		this.direccionEnvio = direccionEnvio;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the tipoCliente
	 */
	public String getTipoCliente() {
		return tipoCliente;
	}

	/**
	 * @param tipoCliente the tipoCliente to set
	 */
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	/**
	 * @return the direccionEnvio
	 */
	public String getDireccionEnvio() {
		return direccionEnvio;
	}

	/**
	 * @param direccionEnvio the direccionEnvio to set
	 */
	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}

}
