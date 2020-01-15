/**
 * 
 */
package es.pgg.sanluis.uml.prac2020.gestores;

/**
 * @author PGG
 *
 */
public class GestorNotificaciones {
	// atributos
	private static GestorNotificaciones uniqueGN = null;

	// metodos singleton
	private GestorNotificaciones() {
	}

	public static GestorNotificaciones getGestorNotificaciones() {
		if (GestorNotificaciones.uniqueGN == null) {
			System.out.println("Creando el Gestor de Notifocaciones");
			GestorNotificaciones.uniqueGN = new GestorNotificaciones();
		}
		return GestorNotificaciones.uniqueGN;
	}
}
