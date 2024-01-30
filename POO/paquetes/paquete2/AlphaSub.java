package POO.paquetes.paquete2;
import POO.paquetes.paquete1.Alpha;

public class AlphaSub extends Alpha {

   Alpha alpha = new Alpha();
    
    public void pruebaAlphaSub() {
        System.out.println(alpha.getPrueba1());
        System.out.println(alpha.getPrueba2());
        System.out.println(alpha.getPrueba3());
        System.out.println(alpha.getPrueba4());
    }
}
