/**
 * 
 */
package com.jbva.sportshop.vista;

import com.jbva.sportshop.controlador.TipoProductoTrs;
import com.jbva.sportshop.modelo.TipoProducto;
import com.jbva.sportshop.modelo.Usuario;
import com.jbva.sportshop.util.UtilLectura;

/**
 * Clase que representa el tipo de producto
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:57:42
 */
public class FrmTipoProducto {
	private Usuario usuarioLogin;

	// Constructor
	public FrmTipoProducto() {
		crearMenuTipoProducto();
	}

	/**
	 * Método para crear el menú tipo de producto
	 */
	private void crearMenuTipoProducto() {
		int opcion = 0;
		TipoProductoTrs adminTipoPro = new TipoProductoTrs();
		Object[] listaTipoProductos = null;
		String mensaje = null;
		TipoProducto tipoProducto = new TipoProducto();
		// TipoProducto tipoProducto = null;
		String nombreTipoPro = null;
		String descripcionTipoPro = null;

		do {
			System.out.println("\n\n**********************************");
			System.out.println("*  SPORTSHOP V 1.0 -> TIPO PRODUCTO  *");
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
				listaTipoProductos = adminTipoPro.listar();
				for (Object tipoPro : listaTipoProductos) {
					System.out.println(tipoPro);
				}
				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos");
				System.out.print("Id:");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Nombre:");
				nombreTipoPro = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción:");
				descripcionTipoPro = UtilLectura.leerDesdeTeclado();

				// 2. Crear un registro (objeto de TipoProducto)
				tipoProducto = new TipoProducto();
				tipoProducto.setIdTipoPro(id);
				tipoProducto.setNombreTipoPro(nombreTipoPro);
				tipoProducto.setDescripcionTipoPro(descripcionTipoPro);

				// 3. Llamar al controlador (el tiene las operaciones)
				mensaje = adminTipoPro.insertar(tipoProducto);

				// 4.Procesar la información
				System.out.println(mensaje);

				break;
			case 3:
				// 1. A que registro le van actualizar
				System.out.print("Cuál registro requiere actualizar, colocar id:");
				int idTipoProAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 2. Recuperando los valores menos su id
				System.out.println("Ingresar los datos");
				System.out.print("Nombre:");
				nombreTipoPro = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción:");
				descripcionTipoPro = UtilLectura.leerDesdeTeclado();

				// 3. Crear un registro para actualizar (objeto de TipoProducto)
				tipoProducto = new TipoProducto();
				tipoProducto.setIdTipoPro(idTipoProAct); // NO cambia es el id
				tipoProducto.setNombreTipoPro(nombreTipoPro);
				tipoProducto.setDescripcionTipoPro(descripcionTipoPro);

				// 4. Llamar al controlador (el tiene las operaciones)
				mensaje = adminTipoPro.actualizar(idTipoProAct, tipoProducto);

				// 5. Procesar la informacion
				System.out.println(mensaje);
				break;
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				listaTipoProductos = adminTipoPro.listar();
				for (Object tipoPro : listaTipoProductos) {
					System.out.println(tipoPro);
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idTipoProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 3.Llamar al controlar para eliminar
				mensaje = adminTipoPro.eliminar(idTipoProEli);
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
