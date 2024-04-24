package POO.streams.ej;

import java.io.*;

public class EJ2 {
    public static void main(String[] args) {
        int media = 0;
        int[] valores;
        try {
            media = calcularMedia("notas.dat");
            System.out.println("suma: " + valores[0]);
            System.out.println("contador: " + valores[1]);



        } catch (IOException e) {
            System.out.println("Error de lectura");
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("La media es: " + media);
    }
    }

    private static int calcularMedia(String string) throws IOException {
        int media = 0, suma = 0, contador = 0, nota;
        int[] resultado = new int[2];

        try (DataInputStream leer = new DataInputStream(
            new BufferedInputStream(new FileInputStream(string)));) {
            while (true) {
                nota= leer.readInt();
                suma += nota;
                contador++;
            }
        }
        catch (EOFException e) {
            if (contador >0) {
                media = suma/contador;
                resultado[0] = suma;
                resultado [1] = contador;
            }
            media = suma / contador;
        }

        return media;
    }

    private static int filtrarPorMedia(int media, String origen, String destino) {
        int nota = 0;
        try (DataInputStream leer = new DataInputStream(
            new BufferedInputStream(new FileInputStream(origen)));
            DataOutputStream escribir = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(destino)));) {
            while (true) {
                nota = leer.readInt();
                if (nota >= media) {
                    escribir.writeInt(nota);
                }
            }
        } catch (EOFException e) {
            System.out.println("Fin de lectura");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }
        return nota;
    }
}
