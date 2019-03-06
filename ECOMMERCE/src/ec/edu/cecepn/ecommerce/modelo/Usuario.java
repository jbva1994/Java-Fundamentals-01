/**
 * 
 */
package ec.edu.cecepn.ecommerce.modelo;

import java.util.Date;

/**
 * 
 * Clase que representa la tabla de Usuario
 * 
 * @author jbva1994
 *
 *         20 feb. 2019 - 19:04:52
 */

public class Usuario {
	private String nombreUsu;
	private String claveUsu;
	private Date fechaCreUsu;
	private boolean cambioConUsu;

	/**
	 * Constructor para crear un usuario sin argumentos Método especial tipo public
	 * Tiene el mismo nombre de la clase No devuelve nada ni tampoco se coloca void
	 */

	public Usuario() {

	}

	/**
	 * @param nombreUsu
	 * @param claveUsu
	 * @param fechaCreUsu
	 * @param cambioConUsu
	 */
	public Usuario(String nombreUsu, String claveUsu, Date fechaCreUsu, boolean cambioConUsu) {
		super();
		this.nombreUsu = nombreUsu;
		this.claveUsu = claveUsu;
		this.fechaCreUsu = fechaCreUsu;
		this.cambioConUsu = cambioConUsu;
	}

	/**
	 * Constructor para crear un usuario
	 * @param nombreUsu
	 * @param claveUsu
	 * @param fechaCreUsu
	 */
	public Usuario(String nombreUsu, String claveUsu, Date fechaCreUsu) {
		super();
		this.nombreUsu = nombreUsu;
		this.claveUsu = claveUsu;
		this.fechaCreUsu = fechaCreUsu;
	}

	/**
	 * 
	 * Se crean getters and setters para poder acceder a atributos privados
	 * @return the nombreUsu
	 */
	public String getNombreUsu() {
		return nombreUsu;
	}

	/**
	 * @param nombreUsu the nombreUsu to set
	 */
	public void setNombreUsu(String nombreUsu) {
		this.nombreUsu = nombreUsu;
	}

	/**
	 * @return the claveUsu
	 */
	public String getClaveUsu() {
		return claveUsu;
	}

	/**
	 * @param claveUsu the claveUsu to set
	 */
	public void setClaveUsu(String claveUsu) {
		this.claveUsu = claveUsu;
	}

	/**
	 * @return the fechaCreUsu
	 */
	public Date getFechaCreUsu() {
		return fechaCreUsu;
	}

	/**
	 * @param fechaCreUsu the fechaCreUsu to set
	 */
	public void setFechaCreUsu(Date fechaCreUsu) {
		this.fechaCreUsu = fechaCreUsu;
	}

	/**
	 * @return the cambioConUsu
	 */
	public boolean isCambioConUsu() {
		return cambioConUsu;
	}

	/**
	 * @param cambioConUsu the cambioConUsu to set
	 */
	public void setCambioConUsu(boolean cambioConUsu) {
		this.cambioConUsu = cambioConUsu;
	}
	
	

}
