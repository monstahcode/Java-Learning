package POO.examen;

public class RobotIndustrial extends Robot {
    private int fabricante;

    public RobotIndustrial(String identificador, String modelo, int numPiezas, int fabricante) {
        super(identificador, modelo, numPiezas);
        this.fabricante = fabricante;
    }

    public int getFabricante() {
        return fabricante;
    }

    public void setFabricante(int fabricante) {
        this.fabricante = fabricante;
    }
}
