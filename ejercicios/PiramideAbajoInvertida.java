import java.util.Scanner;

public class PiramideAbajoInvertida {
        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                int altura, columnas, espacio, filas, impresion;

                do {
                        System.out.println("Introduce un número del 1-9:");
                        altura = input.nextInt();
                        
                } while (altura < 1 || altura > 9);

                for (filas = 0; filas < altura; filas ++) {
                        int i = altura;
                        impresion = (i - (altura - 1));
                        
                        for (espacio = altura; espacio < altura + filas; espacio++) {
                                System.out.print(" ");
                        }

                        for (columnas = altura - 1; columnas >= filas; columnas--) {
                                System.out.print(impresion++);
                        }
                        
                        System.out.println("");
                }
                input.close();
        }
}

