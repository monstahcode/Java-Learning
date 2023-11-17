package POO.cesar;
import java.util.Scanner;

public class Cesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cifrado cifrado;
        cifrado = new Cifrado();
        String texto;

        System.out.println("Introduce el texto para cifrar");
        texto = input.nextLine();
        cifrado.palindromo(texto);
        System.out.println(cifrado.cifrar(texto));
        input.close();
    }
}
