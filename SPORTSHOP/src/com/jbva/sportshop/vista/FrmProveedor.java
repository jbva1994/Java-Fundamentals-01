/**
 * 
 */
package com.jbva.sportshop.vista;

import com.jbva.sportshop.controlador.ProveedorTrs;
import com.jbva.sportshop.modelo.Proveedor;
import com.jbva.sportshop.modelo.Usuario;
import com.jbva.sportshop.util.UtilLectura;



/**
 * Clase que representa el formulario del Proveedor
 * @author Joel
 *
 * 5 mar. 2019 - 22:57:24
 */
public class FrmProveedor {
	private Usuario usuarioSesion;
	
	// Constructor
	public FrmProveedor() {
		crearMenuProveedor();
	}

	/**
	 * Método para crear el menú del proveedor
	 */
	private void crearMenuProveedor() {
		int opcion = 0;
		ProveedorTrs adminProveedor = new ProveedorTrs();
		Object[] listaProveedores = null;
		String mensaje = null;
		//Proveedor proveedor = new Proveedor();
		Proveedor proveedor = null;
		String nombreProv = null;
		String descripcionProv = null;
		
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
				listaProveedores = adminProveedor.listar();
				for (Object tipProv : listaProveedores) {
					System.out.println(tipProv);
				}
				break;
			case 2:
				//1.Recuperando los valores
				System.out.println("Ingresar los datos del Proveedor");
				System.out.print("Id Proveedor:");
				int idProv = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Nombre Proveedor:");
				nombreProv = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción Proveedor:");
				descripcionProv = UtilLectura.leerDesdeTeclado();
				
				//2. Crear un registro (objeto de Proveedor)
				proveedor = new Proveedor();
				proveedor.setIdProveedor(idProv);
				proveedor.setNombreProv(nombreProv);
				proveedor.setDescripcionProv(descripcionProv);
				
				//3. Llamar al controlador (el tiene las operaciones)
				mensaje = adminProveedor.insertar(proveedor);
				
				//4.Procesar la información
				System.out.println(mensaje);
				
				break;
				
			case 3:
				// 1. A que registro le van actualizar
				System.out.print("Cuál registro requiere actualizar, ingrese el id:");
				int idProvAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 2. Recuperando los valores menos su id
				System.out.println("Ingresar los datos");
				System.out.print("Nombre:");
				nombreProv = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción:");
				descripcionProv = UtilLectura.leerDesdeTeclado();

				// 3. Crear un registro para actualizar (objeto de TipoProducto)
				proveedor = new Proveedor();
				proveedor.setIdProveedor(idProvAct);
				proveedor.setNombreProv(nombreProv);
				proveedor.setDescripcionProv(descripcionProv);

				// 4. Llamar al controlador (el tiene las operaciones)
				mensaje = adminProveedor.actualizar(idProvAct, proveedor);

				// 5. Procesar la informacion
				System.out.println(mensaje);
				break;
				
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				listaProveedores = adminProveedor.listar();
				for (Object tipProv : listaProveedores) {
					System.out.println(tipProv);
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idProvEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 3.Llamar al controlar para eliminar
				mensaje = adminProveedor.eliminar(idProvEli);
				System.out.println(mensaje);
				break;
				
			case 5:
				FrmMenuPrincipal frmMenuPrincipal = new FrmMenuPrincipal();
				
			default:
				System.err.println("Opción incorrecta!!!!");
				break;
			}

		} while (opcion != 5);
		
	}
		
}


