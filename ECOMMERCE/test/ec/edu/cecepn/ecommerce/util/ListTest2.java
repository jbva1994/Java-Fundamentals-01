/**
 * 
 */
package ec.edu.cecepn.ecommerce.util;

import java.util.ArrayList;
import java.util.List;

import ec.edu.cecepn.ecommerce.modelo.MedioPago;
import ec.edu.cecepn.ecommerce.modelo.TipoProducto;

/**
 *Clase para ejemplificar el uso de collections
 * - Estructura con tamaño dinamico
 * - Almacenar multiples tipos de datos -> Mejora Generics - un solo tipo
 * - List, Set, Queue, las 3 son interfaces -> Especial no es colleccion -> Map
 * - java.util es el paquete
 * - Para utilizar se utiliza las implementaciones de cada una 
 *@author jbva1994
 *
 * 12 mar. 2019 - 19:40:25
 */
public class ListTest2 {
	/*
	 * Caracteristicas de las Listas:
	 * - El orden no importa
	 * - Permite
	 */
	// Declarando las listas
	private List<TipoProducto> listaTipoProductos;
	
	//1. Declarando la lista
	private ArrayList listaValores;
	private ArrayList<String> listaCadenasDos;
	private ArrayList<String> listaCadenas;
	
	
	public ListTest2() {
		// 2. Inicializar
		this.listaValores = new ArrayList();
		this.listaCadenasDos = new ArrayList<String>();
		this.listaCadenas = new ArrayList<String>();
	}
	
	/**
	 * Metodo para añadir valores
	 */
	public void anadirValores(String valor) {
		/*
		 * Añadir valores de diferentes tipos, pero en este escenario se dificulto
		 * el procesamiento de esta información xq requeria mas capacidades y existia errores de conversion
		 */
		this.listaValores.add(5);
		this.listaValores.add("Ecuador");
		this.listaValores.add(new MedioPago());
		
		//Añadir un valor de un mismo tipo a traves de generics
		this.listaCadenasDos.add(valor);
		this.listaCadenasDos.add(valor);
		//this.listaCadenas.add(5); //error
		
		
		//Añadir un valor
		this.listaCadenasDos.add(valor);
		//Añadir en una posicion especifica
		this.listaCadenasDos.add(4, valor);
		//Añadir una lista de valores
		this.listaCadenasDos.addAll(listaCadenas);
		this.listaCadenasDos.add("Pepe");
		this.listaCadenasDos.add("Pepe");
	
	}
	
	public void actualizarValores(int pos, String valor) {
		this.listaCadenasDos.set(pos, valor);
	}
	
	public void eliminarValores (int pos) {
		this.listaCadenasDos.remove(pos);
	}
	
	public String consultarObjeto(String valor) {
		int pos = this.listaCadenasDos.indexOf(valor);
		return this.listaCadenasDos.get(pos);
	}
	
	public void inicializarInterfaz() {
		/*
		 * Las interfaces no se instancian, pero se puede instanciar una clase concreta
		 * y asociarle a una interfaz para garantizar la seguridad de la clase y mejorar
		 * el estilo de programación
		 */
		this.listaCadenas = new ArrayList<String>();
		this.listaCadenas.add("Joel");
	}
	

}
