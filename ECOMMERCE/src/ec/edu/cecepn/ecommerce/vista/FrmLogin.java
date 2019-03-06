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
		// 2. Llamar a mi método de negocio, enviar la información para validación
		UsuarioTrs adminUsuario = new UsuarioTrs();
		usuarioSesion = adminUsuario.validarUsuario(usuario, clave);
		/*
		 * 3. Si el usuario es correcto se deberia ingresar a la aplicación y si no se
		 * encontró se debería emitir un mensaje de error
		 */
		if (usuarioSesion != null) { // Encontre el usuario
			FrmPrincipal frmPrincipal = new FrmPrincipal();
		} else {
			System.err.println("Usuario no encontrado!!!!");
		}

	}

}
