import java.util.Scanner;

public class PiramideAbajo {
        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                int altura, columnas, espacio, filas, impresion;

                do {
                        System.out.println("Introduce un número del 1-9:");
                        altura = input.nextInt();
                        
                } while (altura < 1 || altura > 9);

                int i = altura;
                for (filas = 0; filas < altura; filas++) {
                        impresion = i;
                        for (columnas = altura - 1 ; columnas >= filas; columnas--) {
                                System.out.print(impresion--);
                        }
                        i--;
                        for (espacio = 0; espacio < altura - filas; espacio++) {
                                System.out.print(" ");
                        }
                        System.out.println("");
                }
                input.close();
        }
}

