/**
 * 
 */
package es.pgg.sanluis.uml.prac2020.gestores;

/**
 * @author PGG
 *
 */
public class GestorLogs {
	// atributos
	private static GestorLogs uniqueGL = null;

	// metodos singleton
	private GestorLogs() {
	}

	public static GestorLogs getGestorLogs() {
		if (GestorLogs.uniqueGL == null) {
			System.out.println("Creando el Gestor de Logs");
			GestorLogs.uniqueGL = new GestorLogs();
		}
		return GestorLogs.uniqueGL;
	}
}
