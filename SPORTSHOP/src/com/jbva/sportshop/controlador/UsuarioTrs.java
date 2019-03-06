/**
 * 
 */
package com.jbva.sportshop.controlador;

import com.jbva.sportshop.modelo.BdMemoria;
import com.jbva.sportshop.modelo.Usuario;

/**
 * Clase que tendra las operaciones de negocio relacionadas con usuario
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:28:58
 */
public class UsuarioTrs {
	/**
	 * Método para validar un usuario a través de su nombre de usuario y clave
	 * 
	 * @param usuario nombre del usuario
	 * @param clave   nombre de clave
	 * @return
	 */
	public Usuario validarUsuario(String usuario, String clave) {
		Usuario user = null;
		// for each es para iterar en toda la estructura
		for (Usuario alias : BdMemoria.usuarios) {
			// Validacion - Sentencias de Decision
			if (alias != null && alias.getUser().equals(usuario) && alias.getPassword().equals(clave)) {
				user = alias;
				break; // Sentencia de ruptura, que rompe la sentencia de iteracion

			}

		}
		return user;

	}
}
