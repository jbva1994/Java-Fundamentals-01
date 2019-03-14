/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.ArrayList;
import java.util.Date;




/**
 * Clase que representa la base de datos en memoria
 * Base de Datos 
 * - Estructura de datos (Estáticas o dinámicas) 
 * - Varias tablas (contenedores de informacion de un cierto tipo) 
 * - Relaciones Tablas (Forma se articula esos contenedores)
 * - Lenguaje para consultar esa información -SQL 
 * - Operaciones CRUD se realizan sobre una o varias tablas - C (Create
 * 	 o insertar o guardar), R(Retrieve - consultar), U(Update, Actualizar o
 * 	 modificar), D(Delete o eliminar o remover)
 * @author Joel
 *
 *         5 mar. 2019 - 22:36:15
 */
public class BdMemoria {

	private static Cliente[] clientes;
	public static Usuario[] usuarios;
	public static TipoProducto[] tipoProductos;
	public static ArrayList<Producto> productos;
	public static Proveedor[] proveedores;

	static {
		usuarios = new Usuario[3];
		tipoProductos = new TipoProducto[4];
		productos = new ArrayList<Producto>();
		proveedores = new Proveedor[4];
		inicializar();

	}

	private static void inicializar() {
		usuarios[0] = new Usuario("jvargas", "admin", new Date());
		usuarios[1] = new Usuario("admin", "admin", new Date());
	}
	
	public static void imprimirInfBdd() {
		System.out.println("BdMemoria V1.0 - Joel Vargas");
	}
	
	public static void main(String[] args) {
		BdMemoria bdd = new BdMemoria();
		//Para imprimir la informacion de la base de datos en memoria
		bdd.imprimirInfBdd();
	}
	
	

}
