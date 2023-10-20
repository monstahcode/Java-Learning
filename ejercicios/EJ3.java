import java.util.Scanner;

public class EJ3 {

        public static void main (String[] arvs) {

                double hipotenusa;
                double catetoA;
                double catetoB;

                Scanner input=new Scanner(System.in);
                System.out.println("Introduzca el valor del cateto A: ");
                catetoA=input.nextDouble();
                System.out.println("Introduzca el valor del cateto B: ");
                catetoB=input.nextDouble();

                hipotenusa = Math.pow(catetoA,2)+Math.pow(catetoB,2);
                hipotenusa = Math.sqrt(hipotenusa);             
                System.out.println("El resultado de la hipotenusa es: " + hipotenusa);
                input.close();
        }
}
