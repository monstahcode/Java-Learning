import java.util.Scanner;

public class Piramide {
        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                int altura, columnas, filas;

                do {
                        System.out.println("Introduce la altura de la pirámide (1-9):");
                        altura = input.nextInt();
                } while (altura < 1 || altura > 9);
                input.close();

                for (filas = 1; filas <= altura; filas++) {

                        int impresion = 0;

                        for (columnas = 0; columnas < filas; columnas++) {
                                System.out.print(filas - impresion++);
                        }
                        System.out.println("");
                }

        }
}
