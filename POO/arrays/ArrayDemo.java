package POO.arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[][] numeros = new int[3][3];
        int[] suma = new int[numeros.length];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++){
            for(int j = 0; j <numeros[i].length; j++) {
                numeros[i][j] = input.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < numeros.length; i++){
            for(int j = 1; j <numeros[i].length; j++) {
                suma[i] =+ numeros[i][j];
            }
            System.out.println(suma[i]);
        }


        for (int i = 0; i < numeros.length; i++){
            for(int j = 0; j <numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        // String[] texto = {"John", "Mike", "James", "Javier", "Marcos"};
        //     String[] texto2;
        //
        //     texto2 = new String[5];
        // }
        //
        // private int contarCaracteresTotales(String[] texto) {
        //     int suma = 0;
        //
        //     for (int i = 0; i<texto.length; i++) {
        //         suma += texto[i].length();
        //     }
        //     return suma;
        // }
        //
        // private int contarLetrasTotales(String[] textos, char caracter) {
        //     int contadorIguales = 0;
        //     for (String texto:textos) {
        //         for (int i = 0; i < texto.length(); i++){
        //             if (texto.charAt(i) == caracter){
        //                 contadorIguales++;
        //             }
        //         }
        //     }
        //     return contadorIguales;
        //
        //

        // Devolver un el String con mayor caracteres en un String

        // String[] texto1 = {"Hola", "Buenos", "Días", "Tengo sueño"};
        // String[] texto2 = {""};
        //
        // int n_caracteres = 0;
        // int n_caracteresMayor = 0;
        // String mayor = "";
        //
        // for (int i = 0; i < texto1.length; i++) {
        //     n_caracteres = texto1[i].length();
        //
        //     if (n_caracteresMayor < n_caracteres) {
        //         mayor = texto1[i];
        //     }
        // }

        // Devolver un booleano si las string estan ordenadas alfabeticamente
        
        // boolean ordenado = true;
        //
        // for (int i = 1; i < texto.length; i++){
        //    if (texto[i - 1].compareTo(texto[i]) > 0){
        //         ordenado = false;
        //     }
        // }
        //
        // // Devolver el número de palíndromos;
        //
        // int contadorPalindromos = 0; 
        //
        // for (int i = 0; i < texto.length; i++) {
        //     for (int j = 0; j < texto[i].length(); j++) {
        //         if (texto[i].charAt(j) == texto[i].charAt(texto[i].length() - j)) {
        //             contadorPalindromos++;
        //         } 
        //     }
        // }
    
        // Calificar a los alumnos a traveś de arrays
        
        // Alumno alumno[] = new Alumno[3];
        // Asignatura asignatura1, asignatura2, asignatura3;
        // 
        // asignatura1 = new Asignatura(1);
        // asignatura2 = new Asignatura(2);
        // asignatura3 = new Asignatura(3);
        //
        // alumno[0] = new Alumno(1,asignatura1, asignatura2, asignatura3);
        // alumno[1] = new Alumno(2,asignatura1, asignatura2, asignatura3);
        // alumno[2] = new Alumno(3,asignatura1, asignatura2, asignatura3);
        //
        // Grupo grupo = new Grupo(alumno);
        // 
        // grupo.calificarAlumnos();
        // System.out.println(grupo.obtenerMediaAlumnos());
        // System.out.println(grupo.obtenerAlumnoMasNota());
        // System.out.println(grupo.obtenerMediaMasAlta());
    }
}
