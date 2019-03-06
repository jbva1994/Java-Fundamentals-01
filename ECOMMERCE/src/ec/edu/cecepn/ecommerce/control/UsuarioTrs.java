/**
 * 
 */
package ec.edu.cecepn.ecommerce.control;

import ec.edu.cecepn.ecommerce.modelo.MemoriaBdd;
import ec.edu.cecepn.ecommerce.modelo.Usuario;

/**
 * Clase que tendra las operaciones de negocio relacionadas con usuario
 * 
 * @author jbva1994
 *
 *         26 feb. 2019 - 20:29:08
 */
public class UsuarioTrs {
	/**
	 * Método para validar un usuario a través de su nombre de usuario y clave
	 * @param usuario nombre del usuario
	 * @param clave nombre de clave
	 * @return
	 */
	public Usuario validarUsuario(String usuario, String clave) {
		Usuario usuarioRec = null;
		// for each es para iterar en toda la estructura
		for (Usuario alias : MemoriaBdd.usuarios) {
			// Validacion - Sentencias de Decision
			if (alias != null && alias.getNombreUsu().equals(usuario) && alias.getClaveUsu().equals(clave)) {
				usuarioRec = alias;
				break; // Sentencia de ruptura, que rompe la sentencia de iteracion

			}

		}
		return usuarioRec;
	}
}
