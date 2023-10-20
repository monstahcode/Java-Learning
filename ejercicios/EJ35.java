import java.util.Scanner;

public class EJ35 {

        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                double capital,interes, precio_año, precio_año_doble;
                int i;

                System.out.println("Introduce el capital anual:");
                capital = input.nextDouble();
                System.out.println("Introduce el interés anual:");
                interes = input.nextDouble();

                precio_año = capital;
                precio_año_doble = precio_año * 2;
                i = 0;

                while (precio_año < precio_año_doble) {
                        precio_año = capital + (capital * (interes/100));
                        capital = precio_año;

                        i++;
                }

                System.out.println("Se han tardado " + i + " años");
                input.close();
        }
}
