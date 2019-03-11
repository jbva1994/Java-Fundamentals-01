/**
 * 
 */
package ec.edu.cecepn.ecommerce.vista;

import ec.edu.cecepn.ecommerce.control.TipoProductoTrs;
import ec.edu.cecepn.ecommerce.modelo.TipoProducto;
import ec.edu.cecepn.ecommerce.modelo.Usuario;
import ec.edu.cecepn.ecommerce.util.UtilLectura;

/**
 * Clase que representa el tipo de producto
 * 
 * @author jbva1994
 *
 *         27 feb. 2019 - 20:47:02
 */
public class FrmTipoProducto {
	private Usuario usuarioSesion;

	// Constructor
	public FrmTipoProducto() {
		crearMenuTipoProducto();
	}

	/**
	 * Método para crear el menú tipo de producto
	 */
	private void crearMenuTipoProducto() {
		int opcion = 0;
		TipoProductoTrs adminTipPro = new TipoProductoTrs();
		Object[] listaTipoProductos = null;
		String mensaje = null;
		do {
			System.out.println("\n\n**********************************");
			System.out.println("*  E-COMMERCE V 1.0 -> TIPO PRODUCTO *");
			System.out.println("**************************************");
			System.out.println("1. Listar");
			System.out.println("2. Guardar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar");
			System.out.print("... Seleccione una opción:");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			// Sentencias de decision - switch
			switch (opcion) { // solo entero o cadena
			case 1:
				listaTipoProductos = adminTipPro.listar();
				for (Object tipPro : listaTipoProductos) {
					System.out.println(tipPro);
				}
				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos:");
				System.out.print("Id:");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Nombre:");
				String nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Descripción:");
				String descripcion = UtilLectura.leerDesdeTeclado();

				// 2. Crear un registro (objeto de TipoProducto)
				TipoProducto tipoProducto = new TipoProducto();
				tipoProducto.setIdTipPro(id);
				tipoProducto.setNombreTipPro(nombre);
				tipoProducto.setDescripcionTipPro(descripcion);

				// 3. Llamar al controlador (el tiene las operaciones)
				mensaje = adminTipPro.guardar(tipoProducto);

				// 4.Procesar la información
				System.out.println(mensaje);

				break;
			case 3:
				break;
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				listaTipoProductos = adminTipPro.listar();
				for (Object tipPro : listaTipoProductos) {
					System.out.println(tipPro);
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idTipProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 3.Llamar al controlar para eliminar
				mensaje = adminTipPro.eliminar(idTipProEli);
				System.out.println(mensaje);
				break;
			case 5:
				FrmPrincipal frmPrincipal = new FrmPrincipal();
				
			default:
				System.err.println("Opción incorrecta!!!!");
				break;
			}

		} while (opcion != 5);

	}

}
