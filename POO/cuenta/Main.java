package POO.cuenta;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Titular titular1, titular2;
        Cuenta cuenta1, cuenta2;

        Date fecha = new Date();

        titular1 = new Titular("000111222","Ivan", "Arroyo Gonzalez", fecha);
        titular2 = new Titular("000111222","Ivan", "Arroyo Gonzalez", fecha);
        cuenta1 = new Cuenta(01,1000.45,titular1);
        cuenta2 = new Cuenta(02,1000.45,titular2);
        
        // cuenta1.mostrar();
        // cuenta2.mostrar();
        // cuenta1.ingresar(50);
        // cuenta2.ingresar(100);
        // cuenta1.mostrar();
        // cuenta2.mostrar();
        // cuenta1.retirar(2);
        // cuenta2.retirar(60);
        // cuenta1.mostrar();
        // cuenta2.mostrar();
        cuenta1.compararTitular(cuenta2);
        cuenta1.compararIdCuenta(cuenta2);
        cuenta1.compararTitularCuentaSimilar(cuenta2);
    }   
}
