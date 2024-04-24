package POO.examen;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(3, 4);
        matriz.setElemento(0, 0, "a");
        matriz.setElemento(0, 1, "2");
        matriz.setElemento(0, 2, "3");
        matriz.setElemento(0, 3, "3");
        matriz.setElemento(1, 0, "4");
        matriz.setElemento(1, 1, "5");
        matriz.setElemento(1, 2, "6");
        matriz.setElemento(1, 3, "6");
        matriz.setElemento(2, 0, "7");
        matriz.setElemento(2, 1, "8");
        matriz.setElemento(2, 2, "9");
        matriz.setElemento(2, 3, "9");
 
        int[][] resultado = matriz.procesarDatos(matriz.getMatriz());
        
        for (int i = 0; i < resultado[0].length; i++) {
            System.out.println("Columna: " + i + " Fila: " + resultado[0][i] + " Mayor: " + resultado[1][i]);
        }

    }
}
