package POO.arraylist;
import java.util.ArrayList;

public class EjemploLista {
    
    public static void main(String[] args) {
        
    }


    
    public static void invertir(ArrayList<String> lista) {
        String aux;

        for (int i = 0; i < lista.size()/2; i++) {
            aux = lista.get(i);
            lista.set(i, lista.get(lista.size()-i-1));
            lista.set(lista.size()-i-1, aux);
        }
    }
}
