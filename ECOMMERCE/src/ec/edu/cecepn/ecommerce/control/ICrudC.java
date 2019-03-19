/**
 * 
 */
package ec.edu.cecepn.ecommerce.control;

import java.util.List;

/**
 * Interface para definir los m�todos CRUD utilizando Collections
 * 
 * @author jbva1994
 *
 *         12 mar. 2019 - 20:06:29
 */
public interface ICrudC {

	/**
	 * Definici�n de m�todo para guardar
	 * 
	 * @param registro
	 * @return
	 */
	public String guardar(Object registro) throws Exception;

	/**
	 * Definici�n de m�todo para actualizar
	 * 
	 * @param registro
	 * @return
	 */
	public String actualizar(Object registro) throws Exception;

	/**
	 * Definici�n de m�todo para eliminar
	 * 
	 * @param registro
	 * @return
	 */
	public String eliminar(Object registro) throws Exception;

	/**
	 * Definici�n de m�todo para consultar
	 * 
	 * @return
	 */
	/*
	 * Con el wildcard ? se devuelve cualquier lista de objetos de alg�n tipo
	 */
	public List<?> consultarTodos() throws Exception;
}
