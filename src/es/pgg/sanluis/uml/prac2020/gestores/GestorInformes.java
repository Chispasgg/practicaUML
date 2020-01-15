/**
 * 
 */
package es.pgg.sanluis.uml.prac2020.gestores;

/**
 * @author PGG
 *
 */
public class GestorInformes {
	// atributos
	private static GestorInformes uniqueGI = null;

	// metodos singleton
	private GestorInformes() {
	}

	public static GestorInformes getGestorInformes() {
		if (GestorInformes.uniqueGI == null) {
			System.out.println("Creando el Gestor de Informes");
			GestorInformes.uniqueGI = new GestorInformes();
		}
		return GestorInformes.uniqueGI;
	}

}
