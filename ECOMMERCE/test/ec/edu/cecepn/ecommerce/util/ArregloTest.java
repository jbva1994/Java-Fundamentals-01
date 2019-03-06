/**
 * 
 */
package ec.edu.cecepn.ecommerce.util;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * Clase que permitir� ejemplificar el uso de los arreglos
 * 
 * @author jbva1994
 *
 *         21 feb. 2019 - 20:40:06
 */
public class ArregloTest {
	// Declarar un arreglo
	// Arreglos de tipos de datos objetos o primitivos
	// Crearse al final del tipo de dato o de la variable ambas son validas
	// Los arreglos almacenan un solo tipo de dato
	// Arreglos estructura de datos fijos
	// Siemrpe comienzan en 0 y terminan uno menos

	public String[] provincias;
	private double[] promediosAcademicos;
	Date fechasPermiso[]; // default package
	protected BigDecimal sueldos[];
	// Se puede declarar arreglos de n dimensiones
	private int[][] matriz;

	// Declarar e inicializar
	private int[] digitos = { 1, 2, 3, 4 };

	public ArregloTest() {
		// instanciar o crear esos arreglos

		this.provincias = new String[24];
		this.promediosAcademicos = new double[10];
		this.fechasPermiso = new Date[8];
		this.sueldos = new BigDecimal[12];
		this.matriz = new int[5][3];
	}

	/**
	 * M�todo para a�adir valores al arreglo
	 */
	public void anadirValoresArreglo() {
		this.provincias[0] = "Pichincha";
		this.provincias[1] = "Guayas";
		this.promediosAcademicos[0] = 14.5;
		this.promediosAcademicos[1] = 20;
		this.fechasPermiso[0] = new Date(); // fecha actual
		Calendar calendario = Calendar.getInstance();
		calendario.set(2019, 10, 21);
		this.fechasPermiso[1] = calendario.getTime();
		this.sueldos[0] = new BigDecimal(5);
		this.sueldos[1] = new BigDecimal(5.3);
		this.sueldos[1] = new BigDecimal("5.6");// ***
		this.matriz[0][1] = 7;
		this.matriz[2][2] = 9;

		// A partir de la posicion 2 pongo cada provincia con el valor de "N/A"
		for (int i = 2; i < provincias.length; i++) {
			provincias[i] = "N/A";
		}

		// A�adir promedios y sueldos
		//TODO

	}

	/**
	 * M�todo para imprimir los valores de un arreglo
	 * 
	 */

	public void imprimirValores() {
		// Sentencia de iteracion, iterar en los valores de la estructura
		System.out.println("Arreglo de Provincias");
		for (int i = 0; i < provincias.length; i++) {
			System.out.println("Posici�n[" + i + "] = " + provincias[i]);
		}

		// Imprimir promedios y sueldos
		//TODO

		/*
		 * Cuando se itera en un arreglo bidimensional se debe iterar primero en las
		 * filas y luego en las columnas matriz.length => tama�o de las filas
		 * matriz[i].length => tama�o de las columnas de esa fila
		 * 
		 */

		System.out.println("Arreglo bidimensional - matriz");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Matriz[" + i + "] [" + j + "] = " + matriz[i][j]);

			}

		}

	}

	public static void main(String[] args) {
		ArregloTest arrUno = new ArregloTest();
		arrUno.anadirValoresArreglo();
		arrUno.imprimirValores();

	}

}
