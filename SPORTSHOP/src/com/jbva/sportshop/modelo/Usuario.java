/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.Date;

/**
 * Clase para representar la tabla usuario
 * 
 * @author Joel
 *
 *         25 feb. 2019 - 10:25:22
 */
public class Usuario {

	private String user;
	private String password;
	private Date fechaCreacion;

	/**
	 * Constructor vacio sin argumentos
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor para crear un usuario
	 * 
	 * @param user
	 * @param password
	 * @param fechaCreacion
	 */
	public Usuario(String user, String password, Date fechaCreacion) {
		super();
		this.user = user;
		this.password = password;
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

}
