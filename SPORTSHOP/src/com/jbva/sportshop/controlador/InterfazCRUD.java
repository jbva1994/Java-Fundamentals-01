/**
 * 
 */
package com.jbva.sportshop.controlador;

/**
 * Interfaz con los métodos CRUD para crear, leer, actualizar y eliminar
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:29:38
 */
public interface InterfazCRUD {

	public String insertar(Object registro);

	public String actualizar(int id, Object registro);

	public String eliminar(int id);

	public Object[] listar();

	public Object consultarPorId(int id);

}
