package POO.fechas;

/**
 * MainFecha
 */
public class MainFecha {

	public static void main(String[] args) {
		Fecha fecha1, fecha2;

		fecha1 = new Fecha();
		fecha2 = new Fecha (31,12,1900);

		fecha1.mostrarFecha();
		int diferenciaDias = fecha1.diferenciaDias(fecha2);
		fecha1.mostrarFecha();
		System.out.println("Días de diferencia: " + diferenciaDias);
	}
}
