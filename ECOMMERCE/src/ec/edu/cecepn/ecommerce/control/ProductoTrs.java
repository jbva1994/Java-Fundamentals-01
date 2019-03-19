/**
 * 
 */
package ec.edu.cecepn.ecommerce.control;

import java.util.List;

import ec.edu.cecepn.ecommerce.modelo.MemoriaBdd;
import ec.edu.cecepn.ecommerce.modelo.Producto;

/**
 * Clase que representa el Producto Transaccional
 * 
 * @author jbva1994
 *
 *         12 mar. 2019 - 20:34:12
 */
public class ProductoTrs implements ICrudC {

	@Override
	public String guardar(Object registro) throws Exception {
		if (registro != null) {
			/*
			 * Verificar la posicion del registro
			 */
			int pos = MemoriaBdd.productos.indexOf(registro);
			if (pos >= 0) {
				return "Registro Duplicado";
			} else {
				MemoriaBdd.productos.add((Producto) registro);
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
			int pos = MemoriaBdd.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontro el valor es mayor o igual a 0, caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posicion, es decir se reemplaza
				MemoriaBdd.productos.set(pos, (Producto) registro);
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
			int pos = MemoriaBdd.productos.lastIndexOf(registro);
			/*
			 * Si es que le encontro el valor es mayor o igual a 0, caso contrario es -1
			 */
			if (pos >= 0) {
				// Actualiza la lista en una posicion, es decir se reemplaza
				MemoriaBdd.productos.remove(pos);
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
		return MemoriaBdd.productos;
	}

	/**
	 * Método para consultar por id
	 * 
	 * @param idProEli
	 * @return
	 */
	public Producto consultarPorId(int idProEli) throws Exception {
		Producto proEnc = null;
		// Error provocado en base a una condicion
		if (idProEli == 0) {
			// Negocio o vista
			throw new Exception("Código incorrecto!!");
		}

		for (Producto proTmp : MemoriaBdd.productos) {
			if (proTmp.getIdPro() == idProEli) {
				proEnc = proTmp;
			}
		}
		return proEnc;
	}

}
