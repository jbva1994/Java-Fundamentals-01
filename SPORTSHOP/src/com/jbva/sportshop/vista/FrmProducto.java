/**
 * 
 */
package com.jbva.sportshop.vista;

import java.math.BigDecimal;

import com.jbva.sportshop.controlador.ProductoTrs;
import com.jbva.sportshop.controlador.TipoProductoTrs;
import com.jbva.sportshop.modelo.Producto;
import com.jbva.sportshop.modelo.Proveedor;
import com.jbva.sportshop.controlador.ProveedorTrs;
import com.jbva.sportshop.modelo.TipoProducto;
import com.jbva.sportshop.util.UtilLectura;


/**
 * Clase que representa el formulario del Producto
 * @author Joel
 *
 * 5 mar. 2019 - 22:56:43
 */
public class FrmProducto {
	public FrmProducto() {
		crearMenuProducto();
	}

	/**
	 * Método para crear el menú de producto
	 */
	private void crearMenuProducto() {
		int opcion = 0;
		ProductoTrs adminPro = new ProductoTrs();
		TipoProductoTrs adminTipPro = new TipoProductoTrs();
		ProveedorTrs adminProv = new ProveedorTrs();
		Object[] listaProductos = null;
		String mensaje = null;
		TipoProducto tipoProducto = null;
		Proveedor proveedor = null;
		Producto producto = null;
		String nombre = null;
		BigDecimal costo = null;
		do {
			System.out.println("\n\n*************************************");
			System.out.println("*       SPORTSHOP V 1.0 -> PRODUCTOS    *");
			System.out.println("*****************************************");
			System.out.println("1. Listar");
			System.out.println("2. Insertar");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Regresar");
			System.out.print("... Seleccione una opción:");
			opcion = Integer.parseInt(UtilLectura.leerDesdeTeclado());
			switch (opcion) { 
			case 1:
				try {
					/*
					 * En el bloque try va todo el bloque de código que puede
					 * ocasionar error, solo existe un solo bloque try
					 */
					for (Object tipPro : adminPro.consultarTodos()) {
						System.out.println(tipPro);
					}
				} catch (Exception e) {
					/*
					 * Se puede tener más de un bloque catch y sirve para
					 * controlar el error.
					 */
					//Solo ocuparse en desarrollo, imprime la pila de error
					//e.printStackTrace();
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos:");
				System.out.print("Id:");
				int id = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Nombre:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Peso:");
				int peso = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Costo:");
				costo = new BigDecimal(UtilLectura.leerDesdeTeclado());
				/******************************************************
				 * Bloque para relacionar el objeto Tipo Producto
				 ********************************************************/
				System.out.print("Tipos de productos:");
				System.out.println(adminTipPro.imprimirListaFormateada());
				System.out.print("Ingreso el tipo de producto:");
				int idTipPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				tipoProducto = (TipoProducto) adminTipPro.consultarPorId(idTipPro);
				/*******************************************************************************/
				
				/******************************************************
				 * Bloque para relacionar el objeto Proveedor
				 ********************************************************/
				System.out.print("Proveedores:");
				System.out.println(adminProv.imprimirListaFormateada());
				System.out.print("Ingreso el proveedor:");
				int idProv = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				proveedor = (Proveedor) adminProv.consultarPorId(idProv);
				/*******************************************************************************/
				// 2.Crear un registro (objeto de TipoProducto)
				producto = new Producto(id, nombre, peso, costo, tipoProducto, proveedor);

				// 3. Llamar al controlador (el tiene las operaciones)
				try {
					mensaje = adminPro.insertar(producto);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				// 4. Procesar la información
				System.out.println(mensaje);

				break;
			case 3:
				// 1. A que registro le van a actualizar
				System.out.print("Cuál registro se requiere actualizar, colocar id:");
				int idPro = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 2.Recuperando los valores menos su id
				System.out.println("Ingresar los datos:");
				System.out.print("Nombre:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Peso:");
				int peso1 = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Costo:");
				costo = new BigDecimal(UtilLectura.leerDesdeTeclado());

				// 3.Crear un registro para actualizar (objeto de TipoProducto)
				/******************************************************
				 * Bloque para relacionar el objeto Tipo Producto
				 ********************************************************/
				System.out.print("Tipos de productos:");
				System.out.println(adminTipPro.imprimirListaFormateada());
				System.out.print("Ingreso el tipo de producto:");
				int idTipProAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				tipoProducto = (TipoProducto) adminTipPro.consultarPorId(idTipProAct);
				/*******************************************************************************/
				
				/******************************************************
				 * Bloque para relacionar el objeto Proveedor
				 ********************************************************/
				System.out.print("Proveedores:");
				System.out.println(adminProv.imprimirListaFormateada());
				System.out.print("Ingreso el proveedor:");
				int idAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				proveedor = (Proveedor) adminProv.consultarPorId(idAct);
				/*******************************************************************************/
				// 2.Crear un registro (objeto de TipoProducto)
				producto = new Producto(idPro,nombre,peso1, costo, tipoProducto , proveedor);

				// 4. Llamar al controlador (el tiene las operaciones)
				try {
					mensaje = adminPro.actualizar(producto);

				// 5. Procesar la información
				System.out.println(mensaje);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");
				try {
					for (Object pro : adminPro.consultarTodos()) {
						System.out.println(pro);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idProEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				try {
					Producto proEli = adminPro.consultarPorId(idProEli);

					// 3.Llamar al controlar para eliminar
					mensaje = adminPro.eliminar(proEli);
				} catch (Exception e) {
					System.err.println("Eror al consultor código:" + e.getMessage());
				}
				System.out.println(mensaje);
				break;
			case 5:
				FrmMenuPrincipal frmMenuPrincipal = new FrmMenuPrincipal();
			default:
				System.err.println("Opción Incorrecta!!!");
				break;

			}
		} while (opcion != 5);
	} 

}
