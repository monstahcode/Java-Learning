package POO.interfaces;

import java.util.ArrayList;

public class Pila implements EstructurarDatos {
    
    public void introducirDato(int[] lista, int dato, int posicion) {
        lista[posicion] = dato;       
    }

    public int obtenerDato(int[] lista, int posicion) {
        return lista[posicion];
    }
}
