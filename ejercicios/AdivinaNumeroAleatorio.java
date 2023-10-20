import java.util.Scanner;

public class AdivinaNumeroAleatorio {
        public static void main(String[] args) {
                
                Scanner input=new Scanner(System.in);

                int num, i, numAleatorio;
                final int intentos = 2;

                i = 0;
                do {
                        System.out.println("Introduce un número entre 1-10:");
                        num = input.nextInt();

                        numAleatorio = (int)Math.random()*10 + 1;

                        if (num < numAleatorio) {
                                System.out.println("El numero introducido es mayor");
                        } else if (num > numAleatorio) {
                                System.out.println("El numero introducido es menor");
                        } else if (num == numAleatorio){
                                i = 2;
                                System.out.println("Enhorabuena has ganado!");
                        }

                } while (i++ <= intentos);
                input.close();
        }
}
