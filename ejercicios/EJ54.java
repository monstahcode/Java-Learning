import java.util.Scanner;

public class EJ54 {
        public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int num, num2, resultado;

                for (int i = 0; i < 10; i++) {

                        System.out.println("Introduzca un número:");
                        num = input.nextInt();
                        System.out.println("Introduzca otro número");
                        num2 = input.nextInt();

                        resultado = 0;
                        for (int j = 1; j <= num; j++) {
                                resultado += num2;
                        }

                        System.out.println("El resutlado es: " + resultado);
                }

                input.close();
        }
}
