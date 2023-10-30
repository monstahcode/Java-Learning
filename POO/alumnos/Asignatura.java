package POO.alumnos;

public class Asignatura {
    // Atributos privados
    private int id;
    private double calificacion;

    // Constructor con parámeto de tipo int
    public Asignatura(int id) {
        this.id = id;
    }
    
    //Getter para el atributo id
    public int getId() {
        return this.id;
    }
    // Getter para el atribto indentificador
    public double getCalificacion() {
        return this.calificacion;
    }
    // Setter para el atributo calificación
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

}
