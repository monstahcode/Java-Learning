import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int num, factorial;

                System.out.println("Introduzca un número:");
                num = input.nextInt();

                while (num < 1) {
                        System.out.println("Introduzca un número:");
                        num = input.nextInt();
                }

                factorial = 1;
                for (int i = 1; i <= num; i++) {
                        factorial *= i;
                }

                System.out.println(factorial);
                input.close();
        }
}
