package POO.examen3;

import java.util.ArrayList;
import java.io.*;

public class FormateoTexto {
    public static void main(String[] args) {
        // LLamamos a los métodos
        formatearFichero("paises.txt");
        escribirFicheroBinario(leerFichero("paisesConFormato.txt"));
    }

    public static void formatearFichero(String fichero) {
        // El fichero paises.txt tiene el siguiente formato:
        //Nombre
        //Poblacion
        //Extension
        //PIB
        // Método que recibe el fichero paises.txt y crea otro llamado
        // paisesConFormato.txt
        // con el siguiente formato:
        // Nombre;Poblacion*Extension;PIB

        try {
            // Creamos un BufferedReader para leer el fichero paises.txt
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            BufferedWriter bw = new BufferedWriter(new FileWriter("paisesConFormato.txt"));
            String linea;
            
            // Leemos el fichero línea por línea y escribimos en el nuevo fichero
            while ((linea = br.readLine()) != null) {
                bw.write(linea + ";");
                linea = br.readLine();
                bw.write(linea + "*");
                linea = br.readLine();
                bw.write(linea + ";");
                linea = br.readLine();
                bw.write(linea + "\n");
            }

            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Desarrollar un método que reciba el fichero paisesConFormato.txt y devuelva un ArrayList
    // Con los elementos de tipo Pasis, Nombre, Poblacion, Extension, PIB
    // En el ArrayList se almacenarán únicamente los países cuya extension sea mayor que 500000 y su poblacion enté entre 30 y 250 millones
    
    public static ArrayList<String> leerFichero(String fichero) {
        // Creamos un ArrayList para almacenar los países
        ArrayList<String> paises = new ArrayList<String>();
        
        // Leemos el fichero paisesConFormato.txt
        try {
            // Creamos un BufferedReader para leer el fichero
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;

            // Leemos el fichero línea por línea
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("[;*]");
                String nombre = datos[0];
                double poblacion = Double.parseDouble(datos[1]);
                double extension = Double.parseDouble(datos[2]);
                double pib = Double.parseDouble(datos[3]);
                
                // Si la extensión es mayor que 500000 y la población está entre 0.3 y 250.0 millones
                if (extension > 500000 && poblacion >= 0.3 && poblacion <= 250.0) {
                    paises.add(nombre);
                    paises.add(Double.toString(poblacion));
                    paises.add(Double.toString(extension));
                    paises.add(Double.toString(pib));
                }
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return paises;
    }

    // Desarrollar un método que a partir de los datos contenidos en el ArrayList 
    // genere un fichero binario donde se alamacene informacion sobre los países con 
    // poblacion mayor a 60.0 millones.
    // La Informacion almacenada sera su nombre y su pobracion en int y double respectivamente.
    // El fichero binario solo podrá alamacenar un texto, luego un núero real, a continuacion otro texto, otro numero real, etc.
    // No se permite alamcenar los datos de ninguna otra manera.

    public static void escribirFicheroBinario(ArrayList<String> paises) {
        try {
            // Creamos un DataOutputStream para escribir en el fichero binario
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("paises.bin"));

            for (int i = 0; i < paises.size(); i += 4) {
                String nombre = paises.get(i);
                double poblacion = Double.parseDouble(paises.get(i + 1));

                if (poblacion > 60.0) {
                    dos.writeUTF(nombre);
                    dos.writeDouble(poblacion);
                }
            }
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
