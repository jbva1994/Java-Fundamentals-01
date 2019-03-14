/**
 * 
 */
package com.jbva.sportshop.controlador;

import com.jbva.sportshop.modelo.BdMemoria;
import com.jbva.sportshop.modelo.Proveedor;


/**
 * Clase que tendrá las operaciones de negocio relacionadas con el proveedor
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:29:27
 */
public class ProveedorTrs implements InterfazCRUD {

	@Override
	public String insertar(Object registro) {
		boolean banIng = false;
		if (registro != null) {
			for (int i = 0; i < BdMemoria.proveedores.length; i++) {
				if (BdMemoria.proveedores[i] == null) {
					BdMemoria.proveedores[i] = (Proveedor) registro;
					banIng = true;
					break;
				}
			}
			if (banIng) { // la bandera automaticamente esta en verdadero
				return "Proveedor guardado correctamente";
			} else {
				return "El tamaño máximo permitido es de 4 proveedores para la versión demo";
			}
		} else {
			return "Debe llenar todos los datos!!!!";
		}
	}

	@Override
	public String actualizar(int id, Object registro) {
		/**************************************************
		 * BLOQUE PARA BUSCAR
		 **************************************************/
		int posEnc = 0;
		boolean banEnc = false;
		for (Proveedor tipPro : BdMemoria.proveedores) {
			if (tipPro != null && tipPro.getIdProveedor() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/**************************************************/
		
		if (banEnc) {
			BdMemoria.proveedores[posEnc] = (Proveedor) registro;
			return "Registro actualizado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public String eliminar(int id) {
		/**************************************************
		 * BLOQUE PARA BUSCAR
		 **************************************************/
		int posEnc = 0;
		boolean banEnc = false;
		for (Proveedor tipPro : BdMemoria.proveedores) {
			if (tipPro != null && tipPro.getIdProveedor() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/**************************************************/
		
		if (banEnc) {
			BdMemoria.proveedores[posEnc] = null;
			return "Registro eliminado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public Object[] listar() {
		return BdMemoria.proveedores;
	}

	@Override
	public Object consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
