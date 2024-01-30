package POO.arrays;

public class Alumno {
    // Atributos privados de tipo Asignatura
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;
    private int id_alumno;

    // Constructor que recibe los objetos de tipo Asignatura
    public Alumno(int id_alumno, Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.id_alumno = id_alumno;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    // Constructor que recibe int y crea objetos Asignatura
    public Alumno(int id1, int id2, int id3) {
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }

    //Gettes para los atributos de tipo Asignatura
    public Asignatura getAsignatura1() {
        return asignatura1;
    }
    public Asignatura getAsignatura2() {
        return asignatura2;
    }
    public Asignatura getAsignatura3() {
        return asignatura3;
   }

    public void mostrarDatos() {
        System.out.println(
            "Id: " + this.id_alumno + "\n" +
            "Calificacion asignatura 1: " + this.asignatura1.getCalificacion() + "\n" +
            "Calificacion asignatura 2: " + this.asignatura2.getCalificacion() + "\n" +
            "Calificacion asignatura 3: " + this.asignatura3.getCalificacion() + "\n"
        );
    }
}
