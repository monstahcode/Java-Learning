import java.util.Scanner;

public class EJ43 {
        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                int i, edades, masJoven, sum, clase;
                double media;

                i = 1;
                clase = 5;
                System.out.println("Introduce una edad:");
                edades = input.nextInt();
                masJoven = edades;
                sum = edades;
                while (i++ < 5) {
                        System.out.println("Introduce una edad:");
                        edades = input.nextInt();

                        if (masJoven > edades) {
                                masJoven = edades;
                        }

                        sum += edades;
                }

                media = sum / clase;

                System.out.println("La media de la clase es de: " + media + "\nEl más joven es: " + masJoven +"\nLa suma de todas las edades es: " + sum);

                input.close();
        }
}
