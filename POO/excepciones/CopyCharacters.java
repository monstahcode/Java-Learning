package  POO.excepciones;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {
        
        FileReader in = null;
        FileWriter out = null;

        try {
            // Crea un objeto que crea un fichero desde el que se puede leer
            in = new FileReader("/home/monstah/Clases/DW1A/Programación/Java/POO/excepciones/xanadu.txt");
            
            // Crea un objeto que crea un fichero en el que se puede escribir
            out = new FileWriter("/home/monstah/Clases/DW1A/Programación/Java/POO/excepciones/outagain.txt");
            int c;

            // Lee el fichero xanadu.txt y escribe su contenido en outagain.txt
            // El método read lee un byte de datos del archivo y se mueve a la siguiente posición esperando a leer de nuevo.
            // El método read devuelve -1 cuando se llega al final del archivo
            while ((c = in.read()) != -1) {
                // El método write escribe el byte especificado en el archivo
                out.write(c);
            }
        } catch (IOException e)  /*Captura la excepción*/ {
            System.err.println("Error en copia. Información de depuradción:");
            // Imprime la pila de llamadas
            e.printStackTrace();
        } finally {
            // Se asegura de que se cierren los archivos
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
