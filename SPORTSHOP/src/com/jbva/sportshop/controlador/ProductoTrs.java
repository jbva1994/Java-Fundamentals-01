/**
 * 
 */
package com.jbva.sportshop.controlador;

import java.util.List;

import com.jbva.sportshop.modelo.BdMemoria;
import com.jbva.sportshop.modelo.Producto;


/**
 * Clase que representa las operaciones de negocio para el producto
 * @author Joel
 *
 * 19 mar. 2019 - 16:20:10
 */
public class ProductoTrs implements InterfazCRUDCollections {

	
	@Override
	public String insertar(Object registro) throws Exception {
		if (registro != null) {
			/*
			 * Verificar la posicion del registro
			 */
			int pos = BdMemoria.productos.indexOf(registro);
			if (pos >= 0) {
				return "Registro Duplicado";
			} else {
				BdMemoria.productos.add((Producto) registro);
				return "Registro guardado correctamente";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	
	@Override
	public String actualizar(Object registro) throws Exception {
		if (registro != null) {
			/*
			 * Encontrar la posicion basada en el objeto, no interesa el id xq no viene
			 * incluido
			 */
			int pos = BdMemoria.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontro el valor es mayor o igual a 0, caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posicion, es decir se reemplaza
				BdMemoria.productos.set(pos, (Producto) registro);
				return "Registro actualizado correctamente";
			} else {
				return "No se encontro el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}

	
	@Override
	public String eliminar(Object registro) throws Exception {
		if (registro != null) {
			/*
			 * Encontrar la posicion basada en el objeto, no interesa el id xq no viene
			 * incluido
			 */
			int pos = BdMemoria.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontro el valor es mayor o igual a 0, caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posicion, es decir se reemplaza
				BdMemoria.productos.remove(pos);
				return "Registro eliminado correctamente";
			} else {
				return "No se encontro el registro";
			}
		} else {
			return "Debe llenar todos los datos";
		}
	}


	@Override
	public List<?> consultarTodos() throws Exception {
		return BdMemoria.productos;
	}

	/**
	 * Método para consultar por id
	 * 
	 * @param idProdEli
	 * @return
	 */
	public Producto consultarPorId(int idProdEli) throws Exception {
		Producto proEnc = null;
		// Error provocado en base a una condicion
		if (idProdEli == 0) {
			// Negocio o vista
			throw new Exception("Código incorrecto!!");
		}

		for (Producto proTmp : BdMemoria.productos) {
			if (proTmp.getIdProd() == idProdEli) {
				proEnc = proTmp;
			}
		}
		return proEnc;
	}
}
