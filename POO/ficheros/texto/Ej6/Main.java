package POO.ficheros.texto.Ej6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter wr = null;

        //Crear un fichero que se llame imagenes.txt
        try {
            wr = new PrintWriter("imagenes.txt");
            // Leer el fichero imagenes.html
            br = new BufferedReader(new FileReader("imagenes.html"));
            String line = br.readLine();
            // Encontar el nombre de las imagenes
            while (line != null) {
                if (line.contains(".img src = \"\\w+\\.png\".+")) {
                    // Encontrar el nombre de la imagen
                    String[] parts = line.split(".img src = \"");
                    String imgName = parts[1];
                    wr.println(imgName);
                }
            }

            // TODO: arreglar bucle, da infinito y no se porque.
            
            
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error: No se puede leer/escribir el fichero");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }
}
