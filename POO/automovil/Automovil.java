package POO.automovil;

public class Automovil {

    private char marca;
    private int modelo;
    private int motor;
    private char combustible;
    private int tipo_auto;
    private int n_puertas;
    private int c_asientos;
    private int max_velocidad;
    private char color;
    private int current_velocidad;

    public Automovil(char marca, int modelo, int motor, char combustible, int tipo_auto, int n_puertas, int max_velocidad, char color, int current_velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.combustible = combustible;
        this.tipo_auto = tipo_auto;
        this.n_puertas = n_puertas;
        this.max_velocidad = max_velocidad;
        this.color = color;
        this.current_velocidad = current_velocidad;
    }

    // methods
    // getters y setters
    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public char getCombustible() {
        return combustible;
    }

    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }

    public int getTipo_auto() {
        return tipo_auto;
    }

    public void setTipo_auto(int tipo_auto) {
        this.tipo_auto = tipo_auto;
    }

    public int getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }

    public int getC_asientos() {
        return c_asientos;
    }
    public void setC_asientos(int c_asientos) {
        this.c_asientos = c_asientos;
    }

    public int getMax_velocidad() {
        return max_velocidad;
    }

    public void setMax_velocidad(int max_velocidad) {
        this.max_velocidad = max_velocidad;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public int getCurrent_velocidad() {
        return current_velocidad;
    }

    public void setCurrent_velocidad(int current_velocidad) {
        this.current_velocidad = current_velocidad;
    }

    // method Acelerar, Desacelerar y Frenar
    public int acelerar(int velocidad) {
        if (velocidad > this.max_velocidad) {
            this.current_velocidad = this.max_velocidad;
        }
        this.current_velocidad += velocidad;

        return this.current_velocidad;
    }
    public int desacelerar(int velocidad) {
        for (int i = 0; i < velocidad; i++) {
            if (velocidad < 0) {
                this.current_velocidad = 0;
            }
            this.current_velocidad -= 1;
        }
        return this.current_velocidad;
    }
    public int frenar() {
        this.current_velocidad = 0;
        return this.current_velocidad;
    }

    public int tiempo_estimado_llegada(int distancia) {
        int tiempo_estimado = 0; 
        tiempo_estimado = distancia / this.current_velocidad;

        return tiempo_estimado;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + this.getMarca() + "\n" + "Modelo: " + this.getModelo() + "\n" + "Motor: " + this.getMotor() + "\n" + "Combustible: " + this.getCombustible() + "\n" + "Automovil: " + this.getTipo_auto() + "\n" + "Numero puertas: " + this.getN_puertas() + "\n" + "Cantidad asientos: " + this.getC_asientos() + "\n" + "Velocidad máxima: " + this.getMax_velocidad() + "\n" + "Color: " + this.getColor() + "\n" +"Velocidad actual: " + this.getCurrent_velocidad() + "\n");
    }
}

