package POO.herencia3;

public class Rectangulo extends Forma{
    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String color, Punto centro ,double ladoMenor, double ladoMayor) {
        super(color, centro);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
    public double getLadoMayor() {
        return ladoMayor;
    }
    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }
    public double getLadoMenor() {
        return ladoMenor;
    }

    public void imprimirR() {
        System.out.println(this.ladoMenor);
        System.out.println(this.ladoMayor);
    }

    public double calularArea() {
        double area;
        area = this.ladoMayor * this.ladoMenor;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro;
        perimetro = (2*this.ladoMenor) + (2*this.ladoMayor);
        return perimetro;
    }

    public void cambiarTamaño(double factorEscala) {
        setLadoMayor(this.ladoMayor * factorEscala);
    }
}
