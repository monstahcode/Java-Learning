import java.util.Scanner;

public class EJ64 {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int i, j, k, primo;
                double root_check, num;

                System.out.println("Introduce un número:");
                num = input.nextInt();

                while (num < 0) {
                        System.out.println("Introduce un número:");
                        num = input.nextInt();
                }

                j = 0;

                i = 2;
                while (j++ < num) {
                        k = 1;
                        primo = 2;
                        root_check = Math.sqrt(i++);

                        while (k++ < root_check) {
                                if (i % k == 0) {
                                        primo = 3;
                                }
                                if (primo > 2) {

                                } else {
                                        System.out.println(i);
                                }
                                input.close();
                        }
                }
        }
}
