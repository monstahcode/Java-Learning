package POO.arrays;

public class Grupo {
    private Alumno[] alumno;

    public Grupo(Alumno[] alumno) {
        this.alumno = alumno;
    }

    public Alumno[] getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno[] alumno) {
        this.alumno = alumno;
    }

    // Methods
    public void calificarAlumnos() {
        for (int i = 0; i < this.alumno.length; i++) {
            Profesor.ponerNotas(this.alumno[i]);
        }
    }
    
    // TODO
    // Solo 30 alumnos max, constructor para crear un grupo sin alumnos, un metodo para añadir alumno, y un metodo para borrar alumno, crear una clase que se llama Escuela y en un objeto de la clase vamos a poder almacenar máximo 30 grupos, va a tener calificar a todos los alumnos de la escuela, obtener la media de la escuela, obtener el alumno con la nota más alta en toda la escuela,  y con la media más alta y uno con la nota más baja y luego una clase Provincia con todo lo anterior.
    public double obtenerMediaAlumnos() {
        double media = 0;
        int contadorAlumnos = 0;
        for (int i = 0; i < this.alumno.length; i++) {
            media += Profesor.calucularMedia(this.alumno[i]);
            contadorAlumnos++;
        }
        media = media / contadorAlumnos;
        return media;
    }

    public Alumno obtenerAlumnoMasNota() {
        double mayorMedia = 0;
        int posicionAlumno = 0;

        for (int i = 0; i < this.alumno.length; i++) {
            this.alumno[i].getAsignatura1().getCalificacion();
            this.alumno[i].getAsignatura2().getCalificacion();
            this.alumno[i].getAsignatura3().getCalificacion();

            if (this.alumno[i].getAsignatura1().getCalificacion() > mayorMedia) {
                posicionAlumno = i;
                mayorMedia = this.alumno[i].getAsignatura1().getCalificacion(); 
            } else {
                if (this.alumno[i].getAsignatura2().getCalificacion() > mayorMedia) {
                    posicionAlumno = i;
                    mayorMedia = this.alumno[i].getAsignatura2().getCalificacion(); 
                } else {
                    if (this.alumno[i].getAsignatura3().getCalificacion() > mayorMedia) {
                        posicionAlumno = i;
                        mayorMedia = this.alumno[i].getAsignatura3().getCalificacion(); 
                    }
                }
            }
        }
        return this.alumno[posicionAlumno];
    }

    public Alumno obtenerMediaMasAlta() {
        double mayor = 0;
        double media = 0;
        int contadorAlumno = 0;
        for (int i = 0; i < this.alumno.length; i++) {
            media = Profesor.calucularMedia(this.alumno[i]);
            if (media > mayor) {
                mayor = media;
                contadorAlumno = i;
            }
        }
        return this.alumno[contadorAlumno];
    }
}
