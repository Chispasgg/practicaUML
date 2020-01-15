/**
 * 
 */
package es.pgg.sanluis.uml.prac2020.gestores;

/**
 * @author PGG
 *
 */
public class GestorUsuarios {
	// atributos
	private static GestorUsuarios uniqueGU = null;

	// metodos singleton
	private GestorUsuarios() {
	}

	public static GestorUsuarios getGestorUsuarios() {
		if (GestorUsuarios.uniqueGU == null) {
			System.out.println("Creando el Gestor de Usuarios");
			GestorUsuarios.uniqueGU = new GestorUsuarios();
		}
		return GestorUsuarios.uniqueGU;
	}
}
