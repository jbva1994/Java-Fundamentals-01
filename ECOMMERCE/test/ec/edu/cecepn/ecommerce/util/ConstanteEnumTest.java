/**
 * 
 */
package ec.edu.cecepn.ecommerce.util;

/**
 *Tipo de clase para definir constantes con más de un valor.
 * OJO: las constantes no pueden cambiar su valor. no pueden haber setters.
 *@author jbva1994
 *
 * 6 mar. 2019 - 20:12:30
 */
public enum ConstanteEnumTest {
	
	EMPRESA("Matoosfe", "17236547001"),
	COLOR_BLANCO("Blanco", "#fffff");
	
	private String nombre;
	private String valor;
	
	//El constructor es necesario cuando se tiene valores
	private ConstanteEnumTest(String nombre, String valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	
	

}
