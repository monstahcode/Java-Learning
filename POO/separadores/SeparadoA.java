package POO.separadores;
import java.util.Scanner;

public class SeparadoA {
    public static void main(String[] args) {
        String texto = "Buenos días,hoy.estoy,muy cansado";
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra a buscar:");
        String palabra = input.nextLine();
        int cantidadPalabras = contarPalabras(texto);
        System.out.println("La cantidad de palabras es: " + cantidadPalabras);
        System.out.println(buscarPalabra(palabra, texto));
        input.close();
    }

    public static int contarPalabras(String texto) {
        int count = 0;
        boolean esPalabra = false;
        
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isLetter(texto.charAt(i))) {
                esPalabra = true;
            } else {
                if (esPalabra) {
                    count++;
                    esPalabra = false;
                }
            }
        }
        if (esPalabra) {
            count++;
            esPalabra = false;
        }
        return count;
    }

    public static boolean buscarPalabra(String palabra, String texto) {
        boolean encontrada = false;
        String palabraGenerada = "";
        texto = formateoTexto(texto);
        System.out.println(texto);
        texto+=" ";
        for (int i = 0; i < texto.length();i++) {
            if (texto.charAt(i) != ' ') {
                palabraGenerada += texto.charAt(i);
            } else {
                if (palabraGenerada.equals(palabra)) {
                    return true;
                }
                palabraGenerada = "";
            }
        }
        return encontrada;
    }

    private static String formateoTexto(String texto) {
        texto = texto.replaceAll(".", " ");
        texto = texto.replaceAll(",", " ");
        return texto;
    }
}
