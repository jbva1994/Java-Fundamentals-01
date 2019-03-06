/**
 * 
 */
package ec.edu.cecepn.ecommerce.vista;

import ec.edu.cecepn.ecommerce.control.UsuarioTrs;
import ec.edu.cecepn.ecommerce.modelo.Usuario;
import ec.edu.cecepn.ecommerce.util.UtilLectura;

/**
 * Clase que representa el login de inicio
 * 
 * @author jbva1994
 *
 *         25 feb. 2019 - 20:31:24
 */
public class FrmLogin {
	
	public static Usuario usuarioSesion; 

	public static void main(String[] args) {
		System.out.println("*********************************");
		System.out.println("*        E-COMMERCE             *");
		System.out.println("*********************************");
		System.out.println("\n");
		// 1.Recuperar valores
		System.out.print("Usuario:");
		String usuario = UtilLectura.leerDesdeTeclado();
		System.out.print("Clave:");
		String clave = UtilLectura.leerDesdeTeclado();
		// 2. Llamar a mi m�todo de negocio, enviar la informaci�n para validaci�n
		UsuarioTrs adminUsuario = new UsuarioTrs();
		usuarioSesion = adminUsuario.validarUsuario(usuario, clave);
		/*
		 * 3. Si el usuario es correcto se deberia ingresar a la aplicaci�n y si no se
		 * encontr� se deber�a emitir un mensaje de error
		 */
		if (usuarioSesion != null) { // Encontre el usuario
			FrmPrincipal frmPrincipal = new FrmPrincipal();
		} else {
			System.err.println("Usuario no encontrado!!!!");
		}

	}

}
