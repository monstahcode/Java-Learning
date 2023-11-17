package POO.alumnos;

public class MediaAlumno {

    public static void main(String[] args) {
        
        Asignatura asignatura1, asignatura2, asignatura3;

        asignatura1 = new Asignatura(1);
        asignatura2 = new Asignatura(2);
        asignatura3 = new Asignatura(3);

        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        Profesor.ponerNotas(alumno);

        double mediaAlumno = Profesor.calucularMedia(alumno);
        System.out.println("La media del alumno es: " + mediaAlumno);
    }
}
