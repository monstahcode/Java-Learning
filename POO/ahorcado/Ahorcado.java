package POO.ahorcado;

import java.util.Scanner;

public class Ahorcado {

    private String palabra;
    private int intentos;

    public Ahorcado(String palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public void jugar() {
        Scanner input = new Scanner(System.in);
        String palabraMostrar = "";
        int contador = 0;

        palabraMostrar = generarPalabraOculta(this.palabra.length());
        System.out.println(palabraMostrar);

        while (contador < this.intentos && !(palabraMostrar.equals(palabra))) {
            System.out.println("Letra: ");
            char letra = input.next().charAt(0);

            if (this.palabra.indexOf(letra) == -1) {
                contador++;
            } else {
                palabraMostrar = generarPalabraMostrar(letra, palabraMostrar);
                System.out.println(palabraMostrar);
            }
        }
        input.close();
    }

    private String generarPalabraOculta(int longitud) {
        String palabraOculta = "";
        for (int i = 0; i < longitud; i++) {
            palabraOculta += "?";
        }
        return palabraOculta;
    }

    private String generarPalabraMostrar(char letra, String palabraMostrar) {
        String palabraGenerar = palabraMostrar;
        for (int i = 0; i < this.palabra.length(); i++){
            if (this.palabra.charAt(i) == letra && palabraMostrar.charAt(i) != letra) {
                palabraGenerar = palabraGenerar.substring(0,i) + letra + palabraGenerar.substring(i+1);
            }
        }
        return palabraGenerar;
    }
}
