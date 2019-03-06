package com.jbva.sportshop.util;

import java.util.Scanner;

/**
 * Clase que contendr� las operaciones de lectura
 * 
 * @author Joel
 *
 *         5 mar. 2019 - 22:26:03
 */
public class UtilLectura {

	/**
	 * M�todo para leer desde el teclado
	 * 
	 * @return
	 */

	public static String leerDesdeTeclado() {
		String valorALeer = null;
		// Construyendo un lector que lee desde la entrada estandar
		Scanner lector = new Scanner(System.in);
		// Leyendo el valor ingresado en formato cadena
		valorALeer = lector.next();
		// Cerrar el lector
		// lector.close();
		return valorALeer;

	}

}
