package POO.cesar;
import java.util.Scanner;
public class Cifrado {

    public String cifrar(String texto) {
        Scanner input = new Scanner(System.in);
        String textoCifrado = "";
        int cifrado;
        System.out.println("Introduce el tipo de cifrado:");
        cifrado = input.nextInt();
        input.nextLine();

        //Eliminación de vueltas al abecedario
        cifrado = cifrado % 26;
        for (int i = 0; i < texto.length(); i++) {
            int caracterCifrado = texto.charAt(i) + (cifrado);
            if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
                if (caracterCifrado < 97) {
                    int caracterCifradoNumeroPosicion = caracterCifrado - 97;
                    caracterCifrado = 122 - caracterCifradoNumeroPosicion;
                } else {
                    if (caracterCifrado > 122) {
                        int caracterCifradoNumeroPosicion = caracterCifrado  - 122;
                        caracterCifrado = caracterCifradoNumeroPosicion + 96;
                    }
                }
            }
            if (texto.charAt(i) >= 65 && texto.charAt(i) <= 90) {
                if (caracterCifrado < 65) {
                    int caracterCifradoNumeroPosicion = caracterCifrado - 65;
                    caracterCifrado = 90 - caracterCifradoNumeroPosicion;
                } else {
                    if (caracterCifrado > 90) {
                        int caracterCifradoNumeroPosicion = caracterCifrado  - 90;
                        caracterCifrado = caracterCifradoNumeroPosicion + 64;
                    }
                }
            }
            textoCifrado += (char)caracterCifrado;
        }
        input.close();
        return textoCifrado;
    }

    public void palindromo(String texto){
        int contadorIguales = 0;
        texto = texto.replaceAll("1234567890!·$%&/()=|@#~½¬[]()€`+*^¨-_.;,:","");
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == texto.charAt(texto.length() - i -1)) {
                contadorIguales++;
            }
        }
        if (contadorIguales == texto.length()) {
            System.out.println("La palabra es palíndroma");
        } else {
            System.out.println("La palabra NO es palíndroma");
        }
    }
}
