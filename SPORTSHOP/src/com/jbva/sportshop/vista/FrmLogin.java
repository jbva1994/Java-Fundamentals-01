/**
 * 
 */
package com.jbva.sportshop.vista;

import com.jbva.sportshop.controlador.UsuarioTrs;
import com.jbva.sportshop.modelo.Usuario;
import com.jbva.sportshop.util.UtilLectura;

/**
 * Clase que representa el login de inicio
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:56:04
 */
public class FrmLogin {

	public static Usuario usuarioLogin;

	public static void main(String[] args) {

		System.out.println("*******************************");
		System.out.println("*         SPORTSHOP           *");
		System.out.println("*******************************");
		System.out.println("\n");
		// 1.Recuperar valores
		System.out.print("Usuario:");
		String usuario = UtilLectura.leerDesdeTeclado();
		System.out.print("Clave:");
		String clave = UtilLectura.leerDesdeTeclado();
		// 2. Llamar a mi método de negocio, enviar la información para validación
		UsuarioTrs adminUsuario = new UsuarioTrs();
		usuarioLogin = adminUsuario.validarUsuario(usuario, clave);
		/*
		 * 3. Si el usuario es correcto se deberia ingresar a la aplicación y si no se
		 * encontró se debería emitir un mensaje de error
		 */
		if (usuarioLogin != null) { // Encontre el usuario
			FrmMenuPrincipal frmMenuPrincipal = new FrmMenuPrincipal();
		} else {
			System.err.println("Usuario no encontrado!!!!");
		}

	}

}
