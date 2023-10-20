import java.util.Scanner;

public class EJ69 {
        public static void main(String[] args) {
                int opc, i;
                double num1, num2, resultado;

                Scanner input = new Scanner(System.in);
                opc = 0;

                System.out.println("Introduce dos números\nNumero 1:");
                num1 = input.nextDouble();
                System.out.println("Numero 2:");
                num2 = input.nextDouble();

                while (opc != 5) {

                        System.out.println("Escoge una opción: \n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Salir");
                        opc = input.nextInt();

                        switch (opc) {
                                case 1:
                                resultado = num1 + num2;
                                System.out.println("El resultado de la suma es :" + resultado);
                                break;
                                case 2:
                                resultado = num1 - num2;
                                System.out.println("El resultado de la resta es: " + resultado);
                                break;
                                case 3:
                                resultado = num1 * num2;
                                System.out.println("El resultado dela multiplicación es: " + resultado);
                                break;
                                case 4:
                                if (num2 == 0) {
                                        System.out.println("Lo siento pero no se puede dividir entre 0");
                                } else {
                                        resultado = num1 / num2;
                                        System.out.println("El resultado de la división es: " + resultado);
                                }
                                break;
                        }

                }
                input.close();
        }
}
