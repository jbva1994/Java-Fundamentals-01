/**
 * 
 */
package ec.edu.cecepn.ecommerce.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase para ejemplificar el uso de fechas
 * 
 * @author jbva1994
 *
 *         11 mar. 2019 - 19:57:11
 */
public class DateTest {
	public String convertirFechaACadena(Date fecha, String formato) {
		SimpleDateFormat formateadorFecha = new SimpleDateFormat(formato);
		return formateadorFecha.format(fecha);
	}

	public static void main(String[] args) {
		DateTest tesFec = new DateTest();
		Date fechaActual = new Date();
		System.out.println("Fecha Actual");
		System.out.println(tesFec.convertirFechaACadena(fechaActual, "yyyy/MM/dd"));
		System.out.println(tesFec.convertirFechaACadena(fechaActual, "yyyy-MM-dd"));
		System.out.println(tesFec.convertirFechaACadena(fechaActual, "yyyy/MM/dd HH:mm:ss"));

	}

}
