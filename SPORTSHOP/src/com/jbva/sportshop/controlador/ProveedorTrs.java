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
		if (registro != null) {
			BdMemoria.proveedores[0] = (Proveedor) registro;
			return "\nProveedor guardado correctamente";
		} else {
			return "Debe llenar todos los datos!!!!";
		}
	}

	@Override
	public String actualizar(int id, Object registro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eliminar(int id) {
		// TODO Auto-generated method stub
		return null;
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
