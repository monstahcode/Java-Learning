package POO.examen;

public class RobotInvestigacion extends Robot {
    private String investigacion;

    public RobotInvestigacion(String identificador, String modelo, int numPiezas, String investigacion) {
        super(identificador, modelo, numPiezas);
        this.investigacion = investigacion;
    }

    public String getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(String investigacion) {
        this.investigacion = investigacion;
    }

    public String toString() {
        return super.toString() + ", Investigacion: " + investigacion;
    }
}
