import java.util.Scanner;

public class EJ2 {
        
        public static void main(String[] arvs) {
                
                double altura;
                double radio;
                double superficie;
                double volumen;

                Scanner teclado=new Scanner(System.in);
                System.out.println("Introduce la altura del cilindro:");
                altura=teclado.nextDouble();
                System.out.println("Introduce el radio del cilindro:");
                radio=teclado.nextDouble();

                superficie=2*Math.PI*radio*altura;
                volumen=Math.PI*Math.pow(radio,2)*altura;

                System.out.println("La superficie del cilindro es: " + superficie);
                System.out.println("El volumen del cilindro es: " + volumen);

                teclado.close();
        }

}
