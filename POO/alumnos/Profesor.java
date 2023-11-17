package POO.alumnos;

public class Profesor {

    //Método para poner notas
    public static void ponerNotas(Alumno alumno){

        // Asignar las notas a las asignaturas
        alumno.getAsignatura1().setCalificacion(Math.random()*10);
        alumno.getAsignatura2().setCalificacion(Math.random()*10);
        alumno.getAsignatura3().setCalificacion(Math.random()*10);
    }

    public static double calucularMedia(Alumno alumno) {

        double calificacion1 = alumno.getAsignatura1().getCalificacion();
        double calificacion2 = alumno.getAsignatura2().getCalificacion();
        double calificacion3 = alumno.getAsignatura3().getCalificacion();

        return (calificacion1 + calificacion2 + calificacion3) / 3;
    }
}
