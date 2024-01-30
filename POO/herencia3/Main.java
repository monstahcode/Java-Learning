package POO.herencia3;

public class Main {
    public static void main(String[] args) {
        Punto centro = new Punto(10, 5);
        Forma forma = new Forma("azul", centro);
        Rectangulo rec = new Rectangulo("azul", centro, 20, 10);

        forma.imprimir();
        forma.cambiarCentro(2, 2);
        forma.imprimir();

        rec.imprimir();
        System.out.println(rec.calcularPerimetro());
        System.out.println(rec.calularArea());
        rec.cambiarTamaño(2);
        rec.imprimir();
    }
}
