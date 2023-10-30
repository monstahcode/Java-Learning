package POO.automovil;

public class CochecitoLere {

    public static void main(String[] args) {
        
        Automovil coche;

        coche = new Automovil('B',2003,200,'G',4,3,320,'n',100);

        coche.acelerar(20);
        coche.mostrarDatos();
        coche.desacelerar(50);
        coche.mostrarDatos();
        coche.frenar();
        coche.mostrarDatos();
    }
}
