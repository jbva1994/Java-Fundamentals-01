/**
 * 
 */
package com.jbva.sportshop.vista;

import java.util.Date;

import com.jbva.sportshop.controlador.ClienteTrs;
import com.jbva.sportshop.modelo.Cliente;
import com.jbva.sportshop.modelo.Usuario;
import com.jbva.sportshop.util.UtilLectura;

/**
 * Clase para representra el formulario del cliente
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:55:48
 */
public class FrmCliente {
	private Usuario usuarioSesion;

	// Constructor
	public FrmCliente() {
		crearMenuCliente();
	}

	/**
	 * Método para crear el menú del cliente
	 */
	private void crearMenuCliente() {
		int opcion = 0;
		ClienteTrs adminCliente = new ClienteTrs();
		Object[] listaClientes = null;
		String mensaje = null;
		Cliente cliente = null;
		String nombre = null;
		String apellido = null;
		String identificacion = null;
		// Date fechaNacimiento = null;
		String direccion = null;
		String telefono = null;
		String email = null;
		String tipoCliente = null;
		String direccionEnvio = null;

		do {
			System.out.println("\n\n");
			System.out.println("**************************************");
			System.out.println("*     SPORTSHOP V 1.0 -> CLIENTES    *");
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
				listaClientes = adminCliente.listar();
				for (Object cli : listaClientes) {
					System.out.println(cli);
				}

				break;
			case 2:
				// 1.Recuperando los valores
				System.out.println("Ingresar los datos del Cliente");
				System.out.print("Nombre Cliente:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Apellido Cliente:");
				apellido = UtilLectura.leerDesdeTeclado();
				System.out.print("Identificacion Cliente:");
				identificacion = UtilLectura.leerDesdeTeclado();
				// System.out.print("Fecha Cliente:");
				// fechaNacimiento = new Date (UtilLectura.leerDesdeTeclado());
				System.out.print("Direccion Cliente:");
				direccion = UtilLectura.leerDesdeTeclado();
				System.out.print("Telefono Cliente:");
				telefono = UtilLectura.leerDesdeTeclado();
				System.out.print("Email Cliente:");
				email = UtilLectura.leerDesdeTeclado();
				System.out.print("Id Cliente:");
				int idCli = Integer.parseInt(UtilLectura.leerDesdeTeclado());
				System.out.print("Tipo de Cliente:");
				tipoCliente = UtilLectura.leerDesdeTeclado();
				System.out.print("Direccion de envio Cliente:");
				direccionEnvio = UtilLectura.leerDesdeTeclado();

				// 2. Crear un registro (objeto de Cliente)
				cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setIdentificacion(identificacion);
				// cliente.setFechaNacimiento(fechaNacimiento);
				cliente.setDireccion(direccion);
				cliente.setTelefono(telefono);
				cliente.setEmail(email);
				cliente.setId(idCli);
				cliente.setTipoCliente(tipoCliente);
				cliente.setDireccionEnvio(direccionEnvio);

				// 3. Llamar al controlador (el tiene las operaciones)
				mensaje = adminCliente.insertar(cliente);

				// 4.Procesar la información
				System.out.println(mensaje);
				break;

			case 3:
				// 1. A que registro le van actualizar
				System.out.print("Cuál registro requiere actualizar, ingrese el id:");
				int idCliAct = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 2. Recuperando los valores menos su id
				System.out.println("Ingresar los datos del Cliente");
				System.out.print("Nombre Cliente:");
				nombre = UtilLectura.leerDesdeTeclado();
				System.out.print("Apellido Cliente:");
				apellido = UtilLectura.leerDesdeTeclado();
				System.out.print("Identificacion Cliente:");
				identificacion = UtilLectura.leerDesdeTeclado();
				// System.out.print("Fecha Cliente:");
				// fechaNacimiento = new Date (UtilLectura.leerDesdeTeclado());
				System.out.print("Direccion Cliente:");
				direccion = UtilLectura.leerDesdeTeclado();
				System.out.print("Telefono Cliente:");
				telefono = UtilLectura.leerDesdeTeclado();
				System.out.print("Email Cliente:");
				email = UtilLectura.leerDesdeTeclado();
				System.out.print("Tipo de Cliente:");
				tipoCliente = UtilLectura.leerDesdeTeclado();
				System.out.print("Direccion de envio Cliente:");
				direccionEnvio = UtilLectura.leerDesdeTeclado();

				// 3. Crear un registro para actualizar (objeto de Cliente)
				cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setIdentificacion(identificacion);
				// cliente.setFechaNacimiento(fechaNacimiento);
				cliente.setDireccion(direccion);
				cliente.setTelefono(telefono);
				cliente.setEmail(email);
				cliente.setId(idCliAct);
				cliente.setTipoCliente(tipoCliente);
				cliente.setDireccionEnvio(direccionEnvio);

				// 4. Llamar al controlador (el tiene las operaciones)
				mensaje = adminCliente.actualizar(idCliAct, cliente);
				// 5. Procesar la informacion
				System.out.println(mensaje);
				break;

			case 4:
				// 1.Mostramos todo lo que tenemos
				System.out.println("¿Cúal registro se requiere eliminar?");

				listaClientes = adminCliente.listar();
				for (Object cli : listaClientes) {
					System.out.println(cli);
				}

				// 2.Recuperamos el identificador del tipo de producto a eliminar
				System.out.print("Ingrese el id:");
				int idCliEli = Integer.parseInt(UtilLectura.leerDesdeTeclado());

				// 3.Llamar al controlar para eliminar
				mensaje = adminCliente.eliminar(idCliEli);
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
