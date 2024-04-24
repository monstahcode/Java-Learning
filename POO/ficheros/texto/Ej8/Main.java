package POO.ficheros.texto.Ej8;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter wr = null;
        String line, modifyLine;
        int index;
        double x, y;
        // Expresion regular para buscar la palabra double
        String regex = "\\bdouble\\b";

        try {
            br = new BufferedReader(new FileReader("Test.java"));
            wr = new PrintWriter("CopyTest.java");
            line = br.readLine();
            index = line.indexOf(" double ");
            while (line != null) {
                if (index == -1) {
                    wr.println(line);
                } else {
                    modifyLine = line.substring(0, index) + " float" + line.substring(index + " double ".length());
                    wr.println(line);
                    line = br.readLine();
                }
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
