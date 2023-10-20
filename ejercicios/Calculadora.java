import java.util.Scanner;

public class Calculadora {
        public static void main(String[] agvs) {

                Scanner input=new Scanner(System.in);

                int opcion;
                double resultado, num1, num2;

                System.out.println("1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir");
                opcion = input.nextInt();
                switch (opcion) {
                        case 1:

                        System.out.println("Introduce dos números");
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();

                        resultado = num1 + num2;
                        System.out.println("El restuldado es: " + resultado);
                        break;

                        case 2:

                        System.out.println("Introduce dos números");
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();

                        resultado = num1 - num2;
                        System.out.println("El resutlado es: " + resultado);
                        break;

                        case 3:

                        System.out.println("Introduce dos números");
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();

                        resultado = num1 * num2;
                        System.out.println("El resutlado es: " + resultado);
                        break;
                        case 4:

                        System.out.println("Introduce dos números");
                        num1 = input.nextDouble();
                        num2 = input.nextDouble();

                        if (num2 == 0) {

                                System.out.println("No se puede dividir por 0");
                        }

                        resultado = num1 / num2;
                        System.out.println("El resutlado es: " + resultado);
                        break;

                }
                input.close();
        }
}
