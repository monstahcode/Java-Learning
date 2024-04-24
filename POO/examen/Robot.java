package POO.examen;
// En un arraylist se amacenarña inforamación referida a robots. Hay dos tipos de robots: Industrialles y de investigación.
// La información común que se antiene por cada robot es: indentificador, modelo, número de piezas.
// Los robots industriales guardan además el nombre del favricante.
// Los robors de investigación almacenan el número de horas de funcionamiendo.

// se pide que se introduzcan 10 robots. Luego se pedirá el indentificador.
// En caso de que no haya robots con ese indentifica dor se mostrará un mensaje de error.
// Si el identificador existe mostrará la información del robot. Se llama a un método que para todos los robots con el mismo número de piezas y buscará al robot que siendo del mismo ntipo tiene un nombre de modelo ordenado alfabeticamente mayor al resto.
public class Robot {
    private String identificador;
    private String modelo;
    private int numPiezas;

    public Robot(String identificador, String modelo, int numPiezas) {
        this.identificador = identificador;
        this.modelo = modelo;
        this.numPiezas = numPiezas;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    public String toString() {
        return "Identificador: " + identificador + ", Modelo: " + modelo + ", Número de piezas: " + numPiezas;
    }
}
