/**
 * 
 */
package es.pgg.sanluis.uml.prac2020.gestores;

/**
 * @author PGG
 *
 */
public class GestorAlmacenamiento {

//	 atributos privados
	private static GestorAlmacenamiento uniqueGA = null;

//	atributos publicos

	// metodos singleton
	private GestorAlmacenamiento() {
	}

	public static GestorAlmacenamiento getGestorAlmacenamiento() {
		if (GestorAlmacenamiento.uniqueGA == null) {
			System.out.println("Creando el Gestor de Almacenamiento");
			GestorAlmacenamiento.uniqueGA = new GestorAlmacenamiento();
		}
		return GestorAlmacenamiento.uniqueGA;
	}

	/* escribir ordenadamente las funciones privadas y publicas */
//	funciones privadas del gestor

//	funciones publicas del gestor

}
