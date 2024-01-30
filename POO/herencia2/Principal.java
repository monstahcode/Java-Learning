package POO.herencia2;

public class Principal {
    public static void main(String[] args) {
        ProductoTextil textil = new ProductoTextil("Camiseta", 35, "000h1", 10);
        ProductoAlimentacion alimento = new ProductoAlimentacion("Melon", 5, "000A1", 10,"Fruta");
        ProductoElectronica electro = new ProductoElectronica("Movil", 700, "000T1", 10,"Tecnologia");
        
        textil.mostrarDatos();
        textil.mostrarTallas();
        alimento.mostrarDatos();
        alimento.mostrarAlimentos();
        electro.mostrarDatos();
        electro.mostrarTipos();
    }
}
