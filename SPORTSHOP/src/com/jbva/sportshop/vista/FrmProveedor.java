/**
 * 
 */
package com.jbva.sportshop.vista;

import com.jbva.sportshop.controlador.ProveedorTrs;
import com.jbva.sportshop.modelo.Proveedor;
import com.jbva.sportshop.util.UtilLectura;

/**
 * Clase que representa el formulario del Proveedor
 * @author Joel
 *
 * 5 mar. 2019 - 22:57:24
 */
public class FrmProveedor {
	
	/**
	 * 
	 */
	public FrmProveedor() {
		crearMenuProveedor();
	}

	/**
	 * Método para crear el menú del proveedor
	 */
	private void crearMenuProveedor() {
		int opcion = 0;
		ProveedorTrs adminProveedor = new ProveedorTrs();
		do {
			System.out.println("\n\n");
			System.out.println("**************************************");
			System.out.println("*     SPORTSHOP V 1.0 -> PROVEEDOR   *");
			System.out.println("**************************************");
			System.out.println("1. Listar");
			System.out.println("2. Insertar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar");
			System.out.print("... Seleccione una opción:");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			// Sentencias de decision - switch
			switch (opcion) { // solo entero o cadena
			case 1:
				//System.out.println(adminProveedor.listar());
				break;
			case 2:
				//1.Recuperando los valores
				System.out.println("\nIngresar los datos del Proveedor");
				System.out.print("Id Proveedor:");
				int idProv = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Nombre Proveedor:");
				String nombreProv = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción Proveedor:");
				String descripcionProv = UtilLectura.leerDesdeTeclado();
				
				//2. Crear un registro (objeto de Proveedor)
				Proveedor proveedor = new Proveedor();
				proveedor.setIdProveedor(idProv);
				proveedor.setNombreProv(nombreProv);
				proveedor.setDescripcionProv(descripcionProv);
				
				//3. Llamar al controlador (el tiene las operaciones)
				String mensaje = adminProveedor.insertar(proveedor);
				
				//4.Procesar la información
				System.out.println(mensaje);
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				FrmMenuPrincipal frmMenuPrincipal = new FrmMenuPrincipal();
				break;
			case 6:
				System.exit(0); // Acabar el programa

			default:
				System.err.println("Opción incorrecta!!!!");
				break;
			}

		} while (opcion != 5);
		
	}

}
