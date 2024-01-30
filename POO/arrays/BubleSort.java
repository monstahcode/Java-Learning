package POO.arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] numeros = { 2, 5, 4, 6, 9, 3, 10, 8 };

        System.out.println(BubleSort.sortMenor(numeros, 3));
        BubleSort.printArray(numeros);
    }

    public static void sort(int[] numeros) {
        int temp;
        boolean swapped;
        for (int i = 0; i < numeros.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    public static boolean sortMenor(int[] numeros, int busqueda) {
        boolean found = false;

        while (found == false) {
            if (numeros[numeros.length / 2] < busqueda) {
                for (int i = numeros.length / 2; i > 0; i--) {
                    if (numeros[i] == busqueda) {
                        found = true;
                        break;
                    }
                }
            }

            if (numeros[numeros.length / 2] > busqueda) {
                for (int i = numeros.length / 2; i > 0; i++) {
                    if (numeros[i] == busqueda) {
                        found = true;
                        break;
                    }
                }
            }
        }
        return found;
    }

    public static void printArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }
}
