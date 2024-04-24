package POO.ficheros.texto.Ej7;

import java.io.*;

public class Main {
    // Main que lea de un fichero html y buscque las imgaenes de tipo pgn
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter wr = null;
        String line;
        // Expresion regular para buscar la palabra double
        String regex = "\\s*<\\s*img\\s+src\\s*=\\s*\\\".*\\.png\\\"\\s*.*>\\s*";
        try {
            br = new BufferedReader(new FileReader("/home/monstah/Clases/DW1A/Programación/Java/POO/ficheros/texto/Ej7/index.html"));
            wr = new PrintWriter("/home/monstah/Clases/DW1A/Programación/Java/POO/ficheros/texto/Ej7/CopyIndex.html");
            line = br.readLine();
            while (line != null) {
                if (line.matches(regex)) {
                    wr.println(line);
                }
                line = br.readLine();
            }
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
        } finally {
            if (br != null) {
                br.close();
            }
            if (wr != null) {
                wr.close();
            }
        }
    }
}
