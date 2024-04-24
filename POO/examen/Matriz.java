package POO.examen;

import java.util.Arrays;

//Matriz que tiene almacenadas cadenas de texto;
public class Matriz {
    private String[][] matriz;

    public Matriz(int filas, int columnas) {
        matriz = new String[filas][columnas];
    }

    // Método que devuelvva si una cadena de texto es un número entero positivo sin usar excepciones.
    public boolean esEnteroPositivo(String [][] matriz, int columna, int filas) {
        int numero = Integer.parseInt(matriz[filas][columna]);
        if (numero > 0) {
            return true;
        } else {
            return false;
        }
    }

    // Método que reciba la matriz y procese los datos por columnas.
    // Para cada columna comprueba con el metodo esEnteroPositivo si el elemento es un número entero positivo.
    // En caso de que sea positivo buscara el número mayor de cada columna.
    // Devolverá un array de enteros de 2 dimensiones. El array tendría 2 filas y tantas columnas como matriz.
    // En la segunda fila se almacenará el mayor valor de cada columna de la matriz original.
    // En la primera fila se almacenará la posición de la columna en la que se encuentra el mayor valor.
    // Si existieran varias filas en la misma columna con el mismo valor mas alto, se elegirá el de menos valor.
    // Si no hay ningun valor número se devolverá -1 tanto para el mayor valor como para la fila donde ese encuentra.
    public int[][] procesarDatos(String[][]matriz) {
        int[][] resultado = new int[2][matriz[0].length];
        // Recorremos las columnas
        for (int i = 0; i < matriz[0].length; i++) {
            // Inicializamos el mayor y la fila
            int mayor = -1;
            int filaMayor = -1;
            // Recorremos las filas
            for (int j = 0; j < matriz.length; j++) {
                // Comprobamos si el elemento es un número entero positivo
                if (esEnteroPositivo(matriz, i, j)) {
                    int numero = Integer.parseInt(matriz[j][i]);
                    // Comprobamos si el número es mayor que el mayor de la columna
                    if (numero > mayor) {
                        // Almacenamos el mayor y la fila
                        mayor = numero;
                        filaMayor = j;
                    }
                }
            }
            // Almacenamos el resultado
            resultado[0][i] = filaMayor;
            resultado[1][i] = mayor;
        }

        // Imprimir el resultado
        return resultado;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setElemento(int fila, int columna, String elemento) {
        matriz[fila][columna] = elemento;
    }

    public String getElemento(int fila, int columna) {
        return matriz[fila][columna];
    }

    public int getFilas() {
        return matriz.length;
    }

    public int getColumnas() {
        return matriz[0].length;
    }

    public void imprimir() {
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

