package POO.interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Pila pila = new Pila();
        int[] lista = new int[5];
        int[] datos = {1,2,3,4,5};

        for (int i = 0; i < lista.length; i++) {
            cola.introducirDato(lista, datos[i], i);
        }
           
        for (int i = 0; i < lista.length; i++) {
            pila.introducirDato(lista, datos[i], i);
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(cola.obtenerDato(lista, i));
        }

        for (int i = lista.length -1 ; i >= 0; i--) {
            System.out.println(pila.obtenerDato(lista, i));
        }
    }
}
