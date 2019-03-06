/**
 * 
 */
package com.jbva.sportshop.modelo;

import java.util.Date;


/**
 * Clase que representa la base de datos en memoria
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:36:15
 */
public class BdMemoria {

	private static Cliente[] clientes;
	private static Producto[] productos;
	public static Usuario[] usuarios;
	public static TipoProducto[] tipoProductos;
	public static Proveedor[] proveedores;

	static {
		usuarios = new Usuario[3];
		proveedores = new Proveedor[4];
		inicializarUsuarios();

	}

	private static void inicializarUsuarios() {
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
