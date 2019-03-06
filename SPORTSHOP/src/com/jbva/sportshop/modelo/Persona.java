/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.Date;

/**
 * Clase que representa a una persona
 * 
 * @author Joel
 *
 *         25 feb. 2019 - 10:47:43
 */
public class Persona {

	private String nombre;
	private String apellido;
	private String identificacion;
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;
	private String email;

	/**
	 * Constructor sin argumentos para persona
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor con todos los atributos de la clase persona
	 * 
	 * @param nombre
	 * @param apellido
	 * @param identificacion
	 * @param fechaNacimiento
	 * @param direccion
	 * @param telefono
	 * @param email
	 */
	public Persona(String nombre, String apellido, String identificacion, Date fechaNacimiento, String direccion,
			String telefono, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
