package POO.producto;

public class MainFabricante {
    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante("Asu4s", "11122233a", "@gmail.com");
        Producto cuenta = new Producto("A000a8", "a%%4", "a&&4", 2000.99, fabricante);

        fabricante.valida();
        cuenta.valida();
    }
}
