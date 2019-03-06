/**
 * 
 */
package ec.edu.cecepn.ecommerce.util;

import java.util.Scanner;

/**
 *Clase que contendrá las operaciones utilitarias de lectura
 *@author jbva1994
 *
 * 27 feb. 2019 - 19:30:51
 */
public class UtilLectura {
	
	/**
	 * Método para leer desde el teclado
	 * @return
	 */
	
	public static String leerDesdeTeclado() {
		String valorALeer = null;
		//Construyendo un lector que lee desde la entrada estandar
		Scanner lector = new Scanner(System.in);
		//Leyendo el valor ingresado en formato cadena
		valorALeer = lector.next();
		//Cerrar el lector
		//lector.close();
		return valorALeer;
		
	}

}
