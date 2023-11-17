package POO.fechas;

public class Fecha {

	private int dia;
	private int mes;
	private int año;

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.año = 1900;
	}

	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.valida();
	}

	public boolean bisiesto() {
		boolean esBisiesto = false;

		if ((this.año % 4 == 0) && (this.año % 100 != 0) || (this.año % 400 == 0)) {
			esBisiesto = true;
		}

		return esBisiesto;

	}

	public int diaMes() {
		int dias;

		switch (this.mes) {

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dias = 30;
				break;
			case 2:
				if (bisiesto()) {
					dias = 29;
				} else {
					dias = 28;
				}
				break;
			default:
				dias = -1;
		}
		return dias;
	}

	public void mostrarFecha() {
		System.out.println(this.dia + "-" + this.mes + "-" + this.año);
	}

	private void valida() {

		if (this.año < 1900 || this.año > 2050) {
			this.año = 1900;
		}
		if (this.mes < 1 || this.mes > 12) {
			this.mes = 1;
		}

		if (this.dia < 1 || this.dia > this.diaMes()) {
			this.dia = 1;
		}
	}

	public void siguiente() {
		dia++;
		if (dia > this.diaMes()) {
			dia = 1;
			mes++;
			if (mes > 12) {
				mes = 1;
				año++;
				valida();
			}
		}
	}

	public void anterior() {
		dia--;
		if (dia < this.diaMes()) {
			mes--;
			if (mes < 1) {
				mes = 12;
				año--;
				valida();
			}
		}
	}

	public boolean igualQue(Fecha fecha) {
		if (fecha.dia == this.dia && fecha.mes == this.mes && fecha.año == this.año) {
			return true;
		} else {
			return false;
		}
	}

	public boolean menorQue(Fecha fecha) {
		if (this.año < fecha.año) {
			return true;
		} else if(this.año == fecha.año) {
			if (this.mes < fecha.mes)
				return true;
			} else if (this.mes == fecha.mes) {
			if (this.dia < fecha.dia) {
				return true;
			}
		}
		return false;
	}

	public boolean mayorQue(Fecha fecha) {
		if (this.año > fecha.año) {
			return true;
		} else if(this.año == fecha.año) {
			if (this.mes > fecha.mes)
				return true;
			} else if (this.mes == fecha.mes) {
			if (this.dia > fecha.dia) {
				return true;
			}
		}
		return false;
	}

	public int diferenciaDias(Fecha otra) {
		Fecha fecha1, fecha2;
		int contadorDias = 0;
		
		if (this.menorQue(otra)) {
			fecha1 = new Fecha(this.dia, this.mes, this.año);
			fecha2 = new Fecha(otra.dia, otra.mes, otra.año);
		} else {
			if (this.mayorQue(otra)){
				fecha1 = new Fecha(otra.dia, otra.mes, otra.año);
				fecha2 = new Fecha(this.dia, this.mes, this.año);
			} else {
				return contadorDias;
			}
		}
		while (!fecha1.igualQue(fecha2)){
			contadorDias++;
			fecha1.siguiente();
		}
		return contadorDias;
	}
}
