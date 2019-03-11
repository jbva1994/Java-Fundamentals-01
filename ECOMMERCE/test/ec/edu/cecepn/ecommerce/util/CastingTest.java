/**
 * 
 */
package ec.edu.cecepn.ecommerce.util;

import java.math.BigDecimal;

import ec.edu.cecepn.ecommerce.modelo.Cliente;
import ec.edu.cecepn.ecommerce.modelo.MedioPago;
import ec.edu.cecepn.ecommerce.modelo.Persona;

/**
 * Clase para ejemplificar como realizar el Casting Casting - Realizar una
 * conversion de un tipo a otro
 * 
 * @author jbva1994
 *
 *         6 mar. 2019 - 20:34:14
 */
public class CastingTest {

	/**
	 * Método para castear un tipo de dato primitivo a su Wrapper (Contenedor) de
	 * manera automática, apartir de la version 1.5 Tipo primitivos: byte, short,
	 * int, long, float, double, char, boolean Wrapper -> Tipo de objeto del
	 * primitivo: Byte, Short, Integer, Long, Float, Double, Character, Boolean
	 */
	public void testearAuboxing() {
		System.out.println("Casting automatico de primitivo a Wrapper");
		int numeroA = 5;
		Integer numeroB = numeroA;
		System.out.println(numeroB.byteValue());

	}

	/**
	 * Método para castear un tipo de dato Wrapper a primitivo a su de manera
	 * automática, apartir de la version 1.5 Tipo primitivos: byte, short, int,
	 * long, float, double, char, boolean Wrapper -> Tipo de objeto del primitivo:
	 * Byte, Short, Integer, Long, Float, Double, Character, Boolean
	 */
	public void testearInboxing() {
		System.out.println("Casting automatico de Wrapper a primitivo");
		Integer numeroB = new Integer(5);
		int numeroA = numeroB;
		System.out.println(numeroA);

	}

	/**
	 * Método para castear un tipo de dato primitivo o objeto de menor a mayor de
	 * manera automática. Tipo primitivos: byte, short, int, long, float, double,
	 * char, boolean
	 */
	public void testearCastingImplicito() {
		System.out.println("Casting implicito primitivos");
		int numeroA = 6;
		double numeroB = numeroA;
		short numeroShortA = 2;
		float numeroFloatA = numeroShortA;

		System.out.println("Casting implícito objetos - herencia");
		Cliente cliente = new Cliente("Marcelo", "Barrera", "1615789542", null, "Ambato", "0225457896",
				"mbarrera@gmail.com", new BigDecimal(1000), new MedioPago());
		System.out.println(cliente);
		System.out.println(cliente.getCuotaVenCli());
		Persona persona = cliente;
		System.out.println(persona);
		System.out.println(persona.getCorreoPer());
	}

	/**
	 * Método para castear un tipo de dato primitivo o objeto de mayor a menor de
	 * manera manual. Tipo primitivos: byte, short, int, long, float, double, char,
	 * boolean
	 */
	public void testearCastingExplicito() {
		double numeroB = 5.3d;
		double numeroC = 6.8;
		int numeroA = (int) numeroB;
		System.out.println(numeroA);

		System.out.println("Casting explícito objetos");
		Persona persona = new Persona("Marcelo", "Barrera", "1615789542", null, "Ambato", "0225457896",
				"mbarrera@gmail.com");
		Cliente cliente = (Cliente) persona; // Error
		System.out.println(cliente.getCuotaVenCli());
	}

	public static void main(String[] args) {
		CastingTest ct = new CastingTest();
		ct.testearCastingImplicito();
		ct.testearCastingExplicito();
	}

}
