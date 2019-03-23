/**
 * 
 */
package com.jbva.sportshop.controlador;

import java.util.List;

/**
 * Interface para definir los m�todos CRUD utilizando Collections
 * @author Joel
 *
 * 13 mar. 2019 - 22:13:15
 */
public interface InterfazCRUDCollections {
	
	public String insertar(Object registro)throws Exception;
	public String actualizar(Object registro)throws Exception;
	public String eliminar(Object registro)throws Exception;
	/*
	 * Con el wildcard ? se devuelve cualquier lista de objetos de alg�n tipo
	 * Solo se hace en interfaces
	 */
	public List<?> consultarTodos()throws Exception;

}
