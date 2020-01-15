/**
 * 
 */
package es.pgg;

import es.pgg.sanluis.uml.prac2020.SistemaDeFichajes;

/**
 * @author PGG
 *
 */
public class MAIN {

	/**
	 * @param args
	 * @info Esta clase es la que inicia el sistema y llama a diferentes casos de
	 *       uso
	 */
	public static void main(String[] args) {
		System.out.println("INICIO");

		// Instanciar el sistema de fichajes
		SistemaDeFichajes sf = SistemaDeFichajes.getSistemaDeFichajes();
		sf.loadFirstData();
		boolean cuClase = true;

		System.out.println("================================================================");
		System.out.println("================================================================");
		if (cuClase) {
			clase(sf);
		} else {
			practica(sf);
		}
		System.out.println("================================================================");
		System.out.println("================================================================");
		System.out.println("FIN");
	}

	private static void clase(SistemaDeFichajes sf) {
		// CU clase
		String tipoCU = "Prueba";
		sf.ejecutarCUClase(tipoCU);
		System.out.println("                 CU " + tipoCU + " de clase terminado");
		System.out.println("================================================================");
	}

	private static void practica(SistemaDeFichajes sf) {
		// CU grupo 1
		sf.ejecutarCUGrupo1();
		System.out.println("                 Grupo 1 terminado");
		System.out.println("================================================================");
		// CU grupo 2
		sf.ejecutarCUGrupo2();
		System.out.println("                 Grupo 2 terminado");
		System.out.println("================================================================");
		// CU grupo 3
		sf.ejecutarCUGrupo3();
		System.out.println("                 Grupo 3 terminado");
	}

}
