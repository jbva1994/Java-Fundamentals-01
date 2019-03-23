/**
 * 
 */
package com.jbva.sportshop.controlador;

import com.jbva.sportshop.modelo.BdMemoria;
import com.jbva.sportshop.modelo.Cliente;
import com.jbva.sportshop.modelo.Cliente;

/**
 * Clase que representa las operaciones de negocio para clientes
 * @author Joel
 *
 * 5 mar. 2019 - 22:29:14
 */
public class ClienteTrs implements InterfazCRUD{

	@Override
	public String insertar(Object registro) {
		boolean banIng = false;
		if (registro != null) {
			for (int i = 0; i < BdMemoria.clientes.length; i++) {
				if (BdMemoria.clientes[i] == null) {
					BdMemoria.clientes[i] =  (Cliente) registro;
					banIng = true;
					break;
				}
			}
			if (banIng) { // la bandera automaticamente esta en verdadero
				return "Cliente guardado correctamente";
			} else {
				return "El tamaño máximo permitido es de 4 clientes para la versión demo";
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
		for (Cliente cli : BdMemoria.clientes) {
			if (cli != null && cli.getId() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/**************************************************/
		
		if (banEnc) {
			BdMemoria.clientes[posEnc] = (Cliente) registro;
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
		for (Cliente cli : BdMemoria.clientes) {
			if (cli != null && cli.getId() == id) {
				// Recuperarme la posición donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/**************************************************/
		
		if (banEnc) {
			BdMemoria.clientes[posEnc] = null;
			return "Registro actualizado correctamente";
		} else {
			return "No se encontró registro";
		}
	}

	@Override
	public Object[] listar() {
		return BdMemoria.clientes;
	}

	@Override
	public Object consultarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
