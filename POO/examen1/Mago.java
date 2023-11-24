package POO.examen1;

public class Mago {
    private String nombre;
    private int poder;
    private boolean estado;
    
    // Constructor
    public Mago(String nombre, int poder, boolean estado) {
        this.nombre = nombre;
        this.poder = poder;
        this.estado = estado;
    }

    // Setter y Getters
    public void setPoder(int poder) {
        this.poder = poder;
    }
    public int getPoder() {
        return poder;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean getEstado() {
        return estado;
    }

    // Methods 
    //Metodo para combatir al dragon
    public boolean combateDragon(Dragon dragon) {

        //Devolverá true o false dependiendo la si gana o pierde
        boolean victoria = true;
        boolean derrota = false;
        
        if (dragon.getColor() == 'V') {
            return victoria;
        } else {
            // Contador para saber el número de vocales que hay
            int contador = 0;
            for (int i = 0; i < this.nombre.length(); i++) {
                // Comprobación de las vocales
                if (this.nombre.charAt(i) == 'A' ||this.nombre.charAt(i) == 'E' || this.nombre.charAt(i) == 'I' || this.nombre.charAt(i) == 'O' || this.nombre.charAt(i) == 'U' || this.nombre.charAt(i) == 'a' ||this.nombre.charAt(i) == 'e' || this.nombre.charAt(i) == 'i' || this.nombre.charAt(i) == 'o' || this.nombre.charAt(i) == 'u') {
                    contador++;
                }
            }
            // Si hay 3 o más vocales devuelve victoria
            if (contador >= 3) {
                return victoria;
            } else {
                return derrota;
            }
        }
    }

    // Metodo para promocianar al mago dependiendo de su estado, poder y nombre
    public void promocionaMago() {
        // Contador de numero de 'h' y 'j'
        int contador = 0;
        // Comprobamos el estado y el poder
        if (this.estado && this.poder < 10) {
            for (int i = 0; i < this.nombre.length(); i++) {
                if (this.nombre.charAt(i) == 'h' || this.nombre.charAt(i) == 'j') {
                    // Suma 1 cada ver que hay una 'h' o 'j'
                    contador++;
                }
            }
            // Comprueba que la cantidad de 'h' y 'j' es mayor al poder
            if (contador > this.poder) {
                this.poder *= 2;
            }
        }
    }
}
