import java.util.Scanner;

public class examples {

        public static void main(String[] argv) {

                int edad;

                Scanner input=new Scanner(System.in);  
                System.out.println("Introduzca la edad:"); 
                edad = input.nextInt();

                if (edad >= 18) {
                        System.out.println("Eres mayor de edad");
                } else {
                        System.out.println("Eres menor de edad");
                }
        }
}
