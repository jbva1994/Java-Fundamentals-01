/**
 * 
 */
package ec.edu.cecepn.ecommerce.modelo;

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
 * 
 * @author jbva1994
 *
 *         26 feb. 2019 - 18:58:02
 */
public class MemoriaBdd {
	/*
	 * Cuando se coloca a una variable como static solamente se crea un espacio en memoria insdependientemente,
	 * si crean n objetos. Ejm. Contador de pagina web
	 */
	private static Cliente[] clientes;
	private static Producto[] productos;
	public static Usuario[] usuarios;
	public static TipoProducto[] tipoProductos;
	
	
//	public MemoriaBdd() {
//		usuarios = new Usuario[3];
//		inicializarUsuarios(); //no static
//	}
	
	/*
	 * Bloque static es un bloque automático que solo soporta temas static
	 */
	static {
		usuarios = new Usuario[4];
		tipoProductos = new TipoProducto[5];
		inicializarUsuarios(); // Solo se acepta métodos static
	}

	private static void inicializarUsuarios() {
		usuarios[0] = new Usuario("jvargas", "admin", new Date());
		usuarios[1] = new Usuario("admin", "admin", new Date());
		usuarios[2] = new Usuario("barcos", "admin", new Date());
	}
	
	/*
	 * Método para imprimir la informacion de la bdd, el cual es marcado static
	 * porque es un metodo que se utiliza con muca frecuencia y seria desgastante en
	 * recursos instanciar un objeto para utilizar el metodo
	 */
	public static void imprimirInfoBdd() {
		System.out.println("MemoriaBdd V1.0 - Joel Vargas");
	}
	
	public static void main(String[] args) {
		//1)Se debe crear un objeto para utilizar el método
		MemoriaBdd bddDes = new MemoriaBdd();
		bddDes.imprimirInfoBdd();
		
		//2)Utilizar el método directamente
		MemoriaBdd.imprimirInfoBdd();
		
		MemoriaBdd bddTes = new MemoriaBdd();
	}

}
