/**
 * 
 */
package com.jbva.sportshop.vista;

import com.jbva.sportshop.util.UtilLectura;

/**
 * Clase que representa el menu o formulario principal
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:56:20
 */
public class FrmMenuPrincipal {

	public FrmMenuPrincipal() {
		crearMenuPrincipal();
	}

	/**
	 * Método para crear el menu principal
	 */
	private void crearMenuPrincipal() {
		int opcion = 0;
		System.out.println("\n\n");
		System.out.println("*************************************");
		System.out.println("*            SPORTSHOP V 1.0        *");
		System.out.println("*************************************");
		System.out.println("1. CLIENTES");
		System.out.println("2. TIPO DE PRODUCTO");
		System.out.println("3. PRODUCTO");
		System.out.println("4. PROVEEDOR");
		System.out.println("5. CARRITO");
		System.out.println("6. SALIR");
		System.out.print("... Seleccione una opción:");
		opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
		// Sentencias de decision - switch
		switch (opcion) { // solo entero o cadena
		case 1:
			FrmCliente frmCliente = new FrmCliente();
			break;
		case 2:
			FrmTipoProducto frmTipPro = new FrmTipoProducto();
			break;
		case 3:
			FrmProducto frmProducto = new FrmProducto();
			break;
		case 4:
			FrmProveedor frmProveedor = new FrmProveedor();
			break;
		case 5:
			FrmCarrito frmCompras = new FrmCarrito();
			break;
		case 6:
			System.exit(0); // Acabar el programa

		default:
			System.err.println("Opción incorrecta!!!!");
			break;
		}

	}

}
