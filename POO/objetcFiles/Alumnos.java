package POO.objetcFiles;

import java.io.*;

public class Alumnos implements Serializable {
    int numeroExpediente;
    String nombre;
    String apellidos;

    public Alumnos(int numeroExpediente, String nombre, String apellidos) {
        this.numeroExpediente = numeroExpediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public static Alumnos[] ordenarAlumnos(Alumnos[] arr) {
        // Ordenar alumnos por numero de expediente y almacenarlos en otro array
        Alumnos[] arrOrdenado = new Alumnos[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].numeroExpediente < arr[j].numeroExpediente) {
                    arrOrdenado[i] = arr[i];
                } else {
                    arrOrdenado[i] = arr[j];
                }
            }
        }
        return arrOrdenado;
    }

    public static void guardarAlumnos(Alumnos[] arr) {
        try {
            FileOutputStream fos = new FileOutputStream("/home/monstah/Clases/DW1A/Programación/Java/POO/objetcFiles/alumnos.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < arr.length; i++) {
                oos.writeObject(arr[i]);
            }
            oos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Alumnos guardados en alumnos.dat");
        }
    }
}
