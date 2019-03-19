/**
 * 
 */
package ec.edu.cecepn.ecommerce.control;

import ec.edu.cecepn.ecommerce.modelo.MemoriaBdd;
import ec.edu.cecepn.ecommerce.modelo.TipoProducto;

/**
 * Clase que tendr� las operaciones de negocio relacionadas con tipo de producto
 * 
 * @author jbva1994
 *
 *         28 feb. 2019 - 19:54:37
 */
public class TipoProductoTrs implements ICrud {

	@Override
	public String guardar(Object registro) {
		boolean banIng = false;
		if (registro != null) {
			for (int i = 0; i < MemoriaBdd.tipoProductos.length; i++) {
				if (MemoriaBdd.tipoProductos[i] == null) {
					MemoriaBdd.tipoProductos[i] = (TipoProducto) registro;
					banIng = true;
					break;
				}
			}
			if (banIng) { // la bandera automaticamente esta en verdadero
				return "Tipo Producto guardado correctamente";
			} else {
				return "El tama�o m�ximo permitido es de 5 tipos de productos para la versi�n demo";
			}
		} else {
			return "Debe llenar todos los datos!!!";
		}

	}

	@Override
	public String actualizar(int id, Object registro) {
		/**************************************************
		 * BLOQUE PARA BUSCAR
		 **************************************************/
		int posEnc = 0;
		boolean banEnc = false;
		for (TipoProducto tipPro : MemoriaBdd.tipoProductos) {
			if (tipPro != null && tipPro.getIdTipPro() == id) {
				// Recuperarme la posici�n donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}
		/**************************************************/

		if (banEnc) {
			MemoriaBdd.tipoProductos[posEnc] = (TipoProducto) registro;
			return "Registro actualizado correctamente";
		} else {
			return "No se encontr� registro";
		}
	}

	@Override
	public String eliminar(int id) {
		int posEnc = 0;
		boolean banEnc = false;
		for (TipoProducto tipPro : MemoriaBdd.tipoProductos) {
			if (tipPro != null && tipPro.getIdTipPro() == id) {
				// Recuperarme la posici�n donde le encontre
				banEnc = true;
				break;
			}
			posEnc++;
		}

		if (banEnc) {
			MemoriaBdd.tipoProductos[posEnc] = null;
			return "Registro eliminado correctamente";
		} else {
			return "No se encontr� registro";
		}
	}

	@Override
	public Object[] listar() {
		return MemoriaBdd.tipoProductos;
	}

	@Override
	public Object consultarPorId(int id) {
		TipoProducto tipProEnc = null;
		for (int i = 0; i < MemoriaBdd.tipoProductos.length; i++) {
			if(MemoriaBdd.tipoProductos[i].getIdTipPro() == id) {
				tipProEnc = MemoriaBdd.tipoProductos[i];
				break;
			}
			
		}
		return tipProEnc;
	}

	/**
	 * Metodo para imprimir los tipos de productos
	 * 
	 * @return
	 */
	public String imprimirListaFormateada() {
		// Cuando quieran unir un monton de cadenas
		StringBuilder tipoProLis = new StringBuilder();
		for (TipoProducto tipProTmp : MemoriaBdd.tipoProductos) {
			if (tipProTmp != null) {
				tipoProLis.append(tipProTmp.getIdTipPro()).append("-").append(tipProTmp.getNombreTipPro())
						.append(" !! ");
			}

		}
		return tipoProLis.toString();
	}

}
