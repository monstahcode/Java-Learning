package  POO.examen1;

public class Dragon {
    private char color;
    private String nombreCiudad;
    private int fuerza;

    public Dragon(char color, String nombreCiudad, int fuerza) {
        // Validacion de color
        if (color != 'R' && color != 'V' && color != 'N') {
            // Si es incorrecto se pone en Verde
            this.color = 'V';
        } else {
            this.color = color;
        }
        this.nombreCiudad = nombreCiudad;
        this.fuerza = fuerza;
    }
    
    // Setters y Getters
    public void setColor(char color) {
        this.color = color;
    }
    public char getColor() {
        return color;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getFuerza() {
        return fuerza;
    }
    
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }

    // Methods
    // Método para promocinar al dragon dependiendo del color
    public void promocionaDragon() {
        switch (this.color) {
            case 'V':
                this.color = 'R';
                break;
            case 'R':
                this.color = 'N';
                break;
            case 'N':
                this.fuerza += 5;
                break;
        }
    }
}
