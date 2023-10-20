import java.util.Scanner;

public class EJ11 {

        public static void main(String[] arvs) {
                
                int numero1, numero2, numero3, aux;

                Scanner input=new Scanner(System.in);
                System.out.println("Introduce un número:");
                numero1 = input.nextInt();
                System.out.println("Introduce un número:");
                numero2 = input.nextInt();
                System.out.println("Introduce un número:");
                numero3 = input.nextInt();


                if (numero1 < numero2 && numero1 < numero3) {
                        System.out.println("Los número estan en orden creciente");
                } else {
                        System.out.println("Los número NO estan en orden creciente");
                }
        }


}

