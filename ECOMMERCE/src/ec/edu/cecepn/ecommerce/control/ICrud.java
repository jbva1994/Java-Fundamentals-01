/**
 * 
 */
package ec.edu.cecepn.ecommerce.control;

/**
 *Tipo de clase que representa el contrato de negocio para las operaciones de la bdd
 *No tiene cuerpo siempre termina en ;
 *Solo define el comportamiento de algo
 *@author jbva1994
 *
 * 28 feb. 2019 - 20:00:23
 */
public interface ICrud {
	public String guardar(Object registro);
	
	public String actualizar(int id, Object registro);
	
	public String eliminar(int id);
	
	public Object[] listar();
	
	public Object consultarPorId(int id);

}
