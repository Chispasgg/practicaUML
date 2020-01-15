/**
 * 
 */
package es.pgg.sanluis.uml.prac2020.cus.clase;

/**
 * @author PGG
 *
 */
public class CUClase {

	public CUClase() {
		System.out.println("Casos de uso generados en clase");
	}

	public boolean CUActual(String tipoCU) {
		Boolean resultado = false;
		System.out.println("Ejecutando el caso de uso actual, llamado " + tipoCU);
		return resultado;
	}

}
