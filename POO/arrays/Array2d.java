package POO.arrays;

public class Array2d {
    public static void main(String[] args) {
        
    }

    public int[][] trasponerMatriz(int[][] matriz) {
        int[][] matrizTraspuesta;

        matrizTraspuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length;j++) {
                matrizTraspuesta[j][i] = matriz[i][j]; 
            }
        }
        return matrizTraspuesta;
    }

    public int[] mayorPorFila(int[][] numeros) {
        
        int[] mayor = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            mayor[i] = numeros[i][0];
            for (int j = 0; numeros[i].length; j++) {
                if (mayor[i] < numeros[i][j]) {
                    mayor[i] = numeros[i][j];
                }
            }
        }
        return mayor;
    }
}
