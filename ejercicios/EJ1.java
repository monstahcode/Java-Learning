import java.util.Scanner;

public class EJ1 {

        public static void main(String[] argv) {
               
                double pulgadas;
                double centimetros;

                Scanner teclado=new Scanner(System.in);
                System.out.println("Introduzca el número que quiera convertir: ");
                pulgadas=teclado.nextDouble();

                centimetros = pulgadas*2.54;

                System.out.println("El resultado de la conversion es: " + centimetros + " pulgadas");
                teclado.close();
        }
}
