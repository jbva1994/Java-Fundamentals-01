/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que representa la base de datos en memoria Base de Datos - Estructura
 * de datos (Estáticas o dinámicas) - Varias tablas (contenedores de informacion
 * de un cierto tipo) - Relaciones Tablas (Forma se articula esos contenedores)
 * - Lenguaje para consultar esa información -SQL - Operaciones CRUD se realizan
 * sobre una o varias tablas - C (Create o insertar o guardar), R(Retrieve -
 * consultar), U(Update, Actualizar o modificar), D(Delete o eliminar o remover)
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:36:15
 */
public class BdMemoria {

	public static Cliente[] clientes;
	public static Usuario[] usuarios;
	public static TipoProducto[] tipoProductos;
	public static ArrayList<Producto> productos;
	public static Proveedor[] proveedores;
	// public static ArrayList<Carrito> carrito;

	static {
		usuarios = new Usuario[3];
		clientes = new Cliente[4];
		tipoProductos = new TipoProducto[4];
		productos = new ArrayList<Producto>();
		proveedores = new Proveedor[4];
		inicializar();

	}

	private static void inicializar() {
		//USUARIOS
		usuarios[0] = new Usuario("jvargas", "admin", new Date());
		usuarios[1] = new Usuario("admin", "admin", new Date());
		//CLIENTES
		clientes[0] = new Cliente("Emilia", "Vargas", "1721456478", new Date(), "El Panecillo", "0984213521",
				"emilia.v@hotmail.com", 1, "Ocasional", "Casa Agoyan");
		clientes[1] = new Cliente("Jose", "Naranjo", "1728954478", new Date(), "El Calzado", "098474101",
				"jose.50@hotmail.com", 2, "Permanente", "Trabajo Sede Cumbaya");
		clientes[2] = new Cliente("Josue", "Lita", "1846546478", new Date(), "La Argelia", "0984217830",
				"erick.lita@hotmail.com", 3, "Ocasional", "Departamento Sur");
		//TIPOS PRODUCTOS
		tipoProductos[0] = new TipoProducto(1, "Gorras", "Casuales", null);
		tipoProductos[1] = new TipoProducto(2, "Camisetas", "Polos", null);
		tipoProductos[2] = new TipoProducto(3, "Zapatos", "Futbol", null);
		//PROVEEDORES
		proveedores[0] = new Proveedor(10, "NIKE", "Tienda", null);
		proveedores[1] = new Proveedor(20, "ADIDAS", "Factory", null);
		proveedores[2] = new Proveedor(30, "PUMA", "Tienda", null);
		
		
	}

	public static void imprimirInfBdd() {
		System.out.println("BdMemoria V1.0 - Joel Vargas");
	}

	public static void main(String[] args) {
		BdMemoria bdd = new BdMemoria();
		// Para imprimir la informacion de la base de datos en memoria
		bdd.imprimirInfBdd();
	}

}
