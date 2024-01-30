package POO.herencia3;

public class Forma {
    private String color;
    private Punto centro;
    
    public Forma(String color, Punto centro) {
        super();
        this.color = color;
        this.centro = centro;
    }

    public void setPunto(Punto centro) {
        this.centro = centro;
    }
    public Punto getCentro() {
        return centro;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void imprimir() {
        System.out.println("Color: " + this.color);
        System.out.println("Centro: " + this.centro);
    }

    public void cambiarCentro(int cX, int cY) {
        this.centro.setY(cY);
        this.centro.setX(cX);
    }
}
