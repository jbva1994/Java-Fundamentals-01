/**
 * 
 */
package ec.edu.cecepn.ecommerce.vista;

import javax.sound.midi.SysexMessage;

import ec.edu.cecepn.ecommerce.modelo.Usuario;
import ec.edu.cecepn.ecommerce.util.UtilLectura;

/**
 * Clase que representa el menu o formulario principal
 * 
 * @author jbva1994
 *
 *         25 feb. 2019 - 20:37:37
 */
public class FrmPrincipal {

	public FrmPrincipal() {
		crearMenuPrincipal();
	}

	/*
	 * Método para crear el menu principal
	 */
	private void crearMenuPrincipal() {
		int opcion = 0;
		System.out.println("\n\n**********************************");
		System.out.println("*            E-COMMERCE V 1.0        *");
		System.out.println("**************************************");
		System.out.println("1. TIPO PRODUCTO");
		System.out.println("2. PRODUCTO");
		System.out.println("3. CLIENTE");
		System.out.println("4. PROVEEDOR");
		System.out.println("5. COMPRAR");
		System.out.println("6. SALIR");
		System.out.print("... Seleccione una opción:");
		opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
		// Sentencias de decision - switch
		switch (opcion) { // solo entero o cadena
		case 1:
			FrmTipoProducto frmTipPro = new FrmTipoProducto();
			break;
		case 2:
			FrmProducto frmProducto = new FrmProducto();
			break;
		case 3:
			FrmCliente frmCliente = new FrmCliente();
			break;
		case 4:
			FrmProveedor frmProveedor = new FrmProveedor();
			break;
		case 5:
			FrmCompras frmCompras = new FrmCompras();
			break;
		case 6:
			System.exit(0); // Acabar el programa

		default:
			System.err.println("Opción incorrecta!!!!");
			break;
		}

	}

}
