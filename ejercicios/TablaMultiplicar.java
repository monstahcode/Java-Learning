import java.util.Scanner;

public class TablaMultiplicar {
        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                int i, resultado, numero1, j;

                System.out.println("Introduce un número:");
                numero1 = input.nextInt();

                j = 0;
                resultado = 0;

                while (j++ < numero1) {
                        i = 0;

                        while (i++ < 10) {
                                resultado = i * j;

                                System.out.println(j + " * " + i + " = " + resultado);
                        }

                }

                input.close();
        }
}
