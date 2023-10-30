package POO.basket;

public class Jugador {

    private double altura;
    private double porcentaje_dobles;
    private double porcentaje_triples;

    //Cración de los constructores
    //Asignación de valores a los atributos
    public Jugador() {
        this.altura = 1.85;
        this.porcentaje_dobles = 40;
        this.porcentaje_triples = 25;
    }
    //Asignamos valores a los prámetros pasados al constructor
    public Jugador(double altura, double porcentaje_dobles, double porcentaje_triples) {
        this.altura = altura;
        this.porcentaje_dobles = porcentaje_dobles;
        this.porcentaje_triples = porcentaje_triples; 
    }

    //Getters y Setters de los Atributos
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return this.altura;
    }

    public void setPorcentaje_dobles(double porcentaje_dobles) {
        this.porcentaje_dobles = porcentaje_dobles;
    }
    public double getPorcentaje_dobles() {
        return this.porcentaje_dobles;
    }

    public void setPorcentaje_triples(double porcentaje_triples) {
        this.porcentaje_triples = porcentaje_triples;
    }
    public double getPorcentaje_triples() {
        return this.porcentaje_triples;
    }

    //Cración de los métodos
        //Lanzamientos
    public boolean lanzar_de_tres() {
        if (Math.random() < (this.porcentaje_triples / 100)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lanzar_de_dos() {
        if (Math.random() < (this.porcentaje_dobles / 100)) {
            return true;
        } else {
            return false;
        }
    }
        //Entrenamiento
    public void entrenar_dos() {
        if (Math.random() < 0.5 && this.porcentaje_dobles < 100) {
            this.porcentaje_dobles += 0.5;
        } else {

        }
    }

    public void entrenar_tres() {
        if (Math.random() < 0.5 && this.porcentaje_triples < 100) {
            this.porcentaje_triples += 0.5;
        } else {

        }
    }
        //Entremaniento por días
    public void entrenar_dos(int dias_entreno) {
        for (int i = 0; i < dias_entreno; i++){
            this.entrenar_dos();
        }
    }

    public void entrenar_tres(int dias_entreno) {
        for (int i = 0; i < dias_entreno; i++){
            this.entrenar_tres();
        }
    }
}

