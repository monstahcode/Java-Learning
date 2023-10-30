package POO.banco;

public class Cuenta {
    
    private int id;
    private double cantidad;

    public Cuenta(int id, double cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    //Setters y Getters
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getCantidad() {
        return cantidad;
    }

    public void mostrar() {
        System.out.println("Numero de cuenta: " + this.id + "\n" + "Dinero en la cuenta: " + this.cantidad);
    }

    public void ingresar(double cantidad) {
        this.cantidad += cantidad;
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
    }

}
