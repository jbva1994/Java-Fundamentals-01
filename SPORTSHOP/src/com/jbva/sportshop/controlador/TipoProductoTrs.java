/**
 * 
 */
package com.jbva.sportshop.controlador;

import com.jbva.sportshop.modelo.BdMemoria;
import com.jbva.sportshop.modelo.TipoProducto;

/**
 * Clase que tendrá las operaciones de negocio relacionadas con tipo de producto
 * 
 * @author Joel
 *
 *         13 mar. 2019 - 22:16:38
 */
public class TipoProductoTrs implements InterfazCRUD {

	@Override
	public String insertar(Object registro) {
		boolean banIng = false;
		if (registro != null) {
			for (int i = 0; i < BdMemoria.tipoProductos.length; i++) {
				if (BdMemoria.tipoProductos[i] == null) {
					BdMemoria.tipoProductos[i] = (TipoProducto) registro;
					banIng = true;
					break;
				}
			}
			if (banIng) { // la bandera automaticamente esta en verdadero
				return "Tipo Producto guardado correctamente";
			} else {
				return "El tamaño máximo permitido es de 5 tipos de productos para la versión demo";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}

	}

	@Override
	public String actualizar(int id, Object registro) {
		/**************************************************
		 * BLOQUE PARA BUSCAR
		 **************************************************/
		int posEnc = 0;
		boolean banEnc = false;
		for (TipoProducto tipoPro : BdMemoria.tipoProductos) {
			if (tipoPro != null && tipoPro.getIdTipoPro() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/**************************************************/

		if (banEnc) {
			BdMemoria.tipoProductos[posEnc] = (TipoProducto) registro;
			return "Registro actualizado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public String eliminar(int id) {
		int posEnc = 0;
		boolean banEnc = false;
		for (TipoProducto tipoPro : BdMemoria.tipoProductos) {
			if (tipoPro != null && tipoPro.getIdTipoPro() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}

		if (banEnc) {
			BdMemoria.tipoProductos[posEnc] = null;
			return "Registro eliminado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public Object[] listar() {
		return BdMemoria.tipoProductos;
	}

	@Override
	public Object consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
