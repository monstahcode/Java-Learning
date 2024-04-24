// Programa que cree un fichero llamado notas.txt con un númro entero en cada lína. Loos datos se leerán por el teclado.
package POO.ficheros.texto.Ej1;

import java.io.*;
import java.util.Scanner;

public class NumeroEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        String nombreFichero = "notas.txt";
        try {
            PrintWriter pr = new PrintWriter(new FileWriter(nombreFichero));
            BufferedWriter bw = new BufferedWriter(pr);
            System.out.println("Introduce números enteros. Para terminar introduce un número negativo:");
            num = sc.nextLine();
            // Funciona tanto para positivos como para negativos
            // Para cerrar el programa, introduce un número el simbolo "<"
            while (sc.hasNextInt()) {
                bw.write(num + "\n");
                num = sc.nextLine();
            }
            bw.close();
            System.out.println("Fichero creado correctamente.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        sc.close();
    }
}
