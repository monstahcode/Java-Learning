package POO.excepciones;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) throws IOException {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        HashSet<String> set = new HashSet<String>();
        ArrayList<String> lista = new ArrayList<String>();

        try {
            inputStream = new BufferedReader(new FileReader("/home/monstah/Clases/DW1A/Programación/Java/POO/excepciones/xanadu.txt"));
            outputStream = new PrintWriter(new FileWriter("/home/monstah/Clases/DW1A/Programación/Java/POO/excepciones/characteroutput.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                set.add(l);
                lista.add(l);
                outputStream.println(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }

        System.out.println(CopyLines.ordenarLineas(lista));
        System.out.println(CopyLines.ordenarLineas(set));
    }

    //Ordenar las líneas del ArrayList alfabéticamente
    public static ArrayList<String> ordenarLineas(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).compareTo(lista.get(j)) < 0) {
                    String temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
        }
        return lista;
    }

    // Ordenar las líneas del HashSet alfabéticamente
}
