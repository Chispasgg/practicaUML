/**
 * 
 */
package es.pgg.sanluis.uml.prac2020;

import es.pgg.sanluis.uml.prac2020.cus.clase.CUClase;
import es.pgg.sanluis.uml.prac2020.cus.practica.g1.CUGrupo1;
import es.pgg.sanluis.uml.prac2020.cus.practica.g2.CUGrupo2;
import es.pgg.sanluis.uml.prac2020.cus.practica.g3.CUGrupo3;
import es.pgg.sanluis.uml.prac2020.gestores.GestorAlmacenamiento;
import es.pgg.sanluis.uml.prac2020.gestores.GestorInformes;
import es.pgg.sanluis.uml.prac2020.gestores.GestorLogs;
import es.pgg.sanluis.uml.prac2020.gestores.GestorNotificaciones;
import es.pgg.sanluis.uml.prac2020.gestores.GestorUsuarios;

/**
 * @author PGG Esta clase es la clase principal del proyecto, donde deben
 *         realizarse todos los metodos de los casos de uso
 */
public class SistemaDeFichajes {

	// atributos
	// Singleton
	private static SistemaDeFichajes uniqueGF = null;
	// Gestores
	private GestorAlmacenamiento ga;
	private GestorInformes gi;
	private GestorLogs gl;
	private GestorNotificaciones gn;
	private GestorUsuarios gu;

	// metodos singleton
	private SistemaDeFichajes() {
	}

	public static SistemaDeFichajes getSistemaDeFichajes() {
		if (SistemaDeFichajes.uniqueGF == null) {
			System.out.println("Creando el Gestor de fichajes");
			SistemaDeFichajes.uniqueGF = new SistemaDeFichajes();
		}
		return SistemaDeFichajes.uniqueGF;
	}

	public void loadFirstData() {
		System.out.println("Cargando los gestores");
		this.ga = GestorAlmacenamiento.getGestorAlmacenamiento();
		this.gi = GestorInformes.getGestorInformes();
		this.gl = GestorLogs.getGestorLogs();
		this.gn = GestorNotificaciones.getGestorNotificaciones();
		this.gu = GestorUsuarios.getGestorUsuarios();
		System.out.println("Cargando los datos");
		// TODO: cargar los datos
	}

//	METODOS DE LOS CASOS DE USO
	public void ejecutarCUGrupo1() {
		// CU grupo 1
		CUGrupo1 cug1 = new CUGrupo1();
		cug1.AltaNuevoUsuario();
		cug1.realizarFichaje();
	}

	public void ejecutarCUGrupo2() {
		// CU grupo 2
		CUGrupo2 cug2 = new CUGrupo2();
		cug2.ConsultaEstadoDeLosFichajes();
		cug2.ConsultarInformesDeFichajesDeUnEmpleado();
		cug2.ModificarManualmenteFichajeDeEmpleado();
		cug2.NotificarAlEmpleadoUnMensaje();
		cug2.VerInformesDeTodosLosEmpleados();
		cug2.GenerarHorarioDeEmpleadosPorSusFichajes();
		cug2.RegistrarEventosRealizadosEnElSistema();
	}

	public void ejecutarCUGrupo3() {
		// CU grupo 3
		CUGrupo3 cug3 = new CUGrupo3();
		cug3.SistemaAutomatizadoDeCierreDeFichajes();
		cug3.SistemaAutomatizadoDeGeneracionDeInformes();
	}

	public void ejecutarCUClase(String tipoCU) {
		// CU de clase
		CUClase cuClase = new CUClase();
		cuClase.CUActual(tipoCU);

	}

}
