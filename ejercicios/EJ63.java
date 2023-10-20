import java.util.Scanner;

public class EJ63 {

        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                double num, resultado;
                int i,primo;

                System.out.println("Introduce un número:");
                num = input.nextInt();

                while (num < 0) {
                        System.out.println("Introduce un número:");
                        num = input.nextInt();
                }
                i = 1;
                primo = 2;
                while (i++ < Math.sqrt(num)) {
                        if (num % i == 0) {
                                primo = 3;
                        }
                }
                if (primo > 2) {
                        System.out.println("No es primo");
                } else {
                        System.out.println("Es primo");
                }
                input.close();
        }
}
