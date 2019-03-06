/**
 * 
 */
package ec.edu.cecepn.ecommerce.modelo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Clase que permitirá testear a la clase Cliente
 * 
 * @author jbva1994
 *
 *         20 feb. 2019 - 20:32:07
 */
public class ClienteTest {

	public static void main(String[] args) {
		// Plantilla Objeto instanciacion a traves del constructor
		Cliente clienteA = new Cliente();
		clienteA.setNombrePer("Joel");
		clienteA.setApellidoPer("Vargas");
		clienteA.setCorreoPer("joel-v1994@hotmail.com");

		Cliente clienteB = new Cliente();
		clienteB.setNombrePer("Jose");
		clienteB.setApellidoPer("Naranjo");
		clienteB.setCorreoPer("jsoe-n1993@hotmail.com");

		MedioPago medioPago = new MedioPago();
		//TODO me falta imprimir la informacion del cliente C
		Cliente clienteC = new Cliente("Emilia", "Vargas", "1721478521", new Date(), "El Calzado", "023178224",
				"jperez@gmail.com", new BigDecimal("345"), medioPago);

		// Imprimir a consola
		System.out.println("Nombre:" + clienteC.getApellidoPer());

	}

}
