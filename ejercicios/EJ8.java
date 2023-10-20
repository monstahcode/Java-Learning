import java.util.Scanner;

public class EJ8 {

        public static void main(String[] arvs) {

                double duracion, duracion_final ,precio_final;
                final double PRECIO_MIN;
                double PRECIO_MINUTOS;
                int i;

                PRECIO_MIN = 10;

                Scanner input=new Scanner(System.in);
                System.out.println("Introduzca la duración de la llamada:");
                duracion = input.nextDouble();

                duracion_final = duracion * 60;

                if (duracion_final > 180) {

                        i = 1;
                        PRECIO_MINUTOS = 5;
                        while (i < duracion) {

                                PRECIO_MINUTOS += 5;
                                ++i;

                        }
                        System.out.println("El precio de la llamada es: " + PRECIO_MINUTOS);

                } else {
                        System.out.println("La llamada cuesta: " + PRECIO_MIN);
                }

                input.close();

        }
}

