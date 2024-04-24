package POO.generador_contraseñas;

public class Generador {
    private String contraseña;
    private int longitud;
    private String caracteres;

    public Generador(int longitud, String caracteres) {
        this.longitud = longitud;
        this.caracteres = caracteres;
        this.contraseña = "";
    }

    public String getContraseña() {
        return contraseña;
    }

    public void generarContraseña() {
        for (int i = 0; i < longitud; i++) {
            int aleatorio = (int)(Math.random() * caracteres.length());
            contraseña += caracteres.charAt(aleatorio);
        }
    }

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getCaracteres() {
		return caracteres;
	}

	public void setCaracteres(String caracteres) {
		this.caracteres = caracteres;
	}


}
