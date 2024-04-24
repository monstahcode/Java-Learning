package POO.streams.ej;

import java.io.*;
import java.util.Scanner;

// programa que cree un fichero binario
public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String nombreFichero = "~/Clases/DW1A/Programación/Java/POO/streams/ej/numeros.bin";
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(nombreFichero)));
            System.out.println("Introduce números enteros. Para terminar introduce un número negativo:");
            int num = sc.nextInt();
            while (num >= 0) {
                out.writeInt(num);
                num = sc.nextInt();
            }
            out.close();
            System.out.println("Fichero creado correctamente.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        sc.close();
    }
}
