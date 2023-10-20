import java.util.Scanner;

public class EJ6 {

        public static void main(String[] arvs) {
                
                float distancia, precio, descuento;
                int dias;

                Scanner input=new Scanner(System.in);
                System.out.println("Introduzca la distancia del viaje:");
                distancia = input.nextFloat();
                System.out.println("Introduzca los días de su estancia:");
                dias = input.nextInt();

                while (distancia < 0 || dias < 0) {
                        System.out.println("Error. Datos introducidos erroneamente, pruebe de nuevo:");
                        System.out.println("Introduzca la distancia del viaje:");
                        distancia = input.nextFloat();
                        System.out.println("Introduzca los días de su estancia:");
                        dias = input.nextInt();
                }

                precio = distancia*(float)8.5;

                if (distancia >= 1000 && dias >= 7) {
                        descuento = precio * (float)0.3;
                        System.out.println("Se le ha aplicado un descuento, su precio final es de: " + descuento);
                } else {
                        System.out.println("No se le ha aplicado el descuento, su precio es de: " + precio);
                }
        }

}
