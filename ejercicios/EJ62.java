import java.util.Scanner;

public class EJ62 {
        public static void main(String[] args) {

                Scanner input=new Scanner(System.in);

                double nota, mediaA, mediaB;
                int pares, impares;
                
                mediaA = 0;
                impares = 0;
                mediaB = 0;
                pares = 0;
                for (int i = 0; i < 5; i++) {

                        System.out.println("Introduce la nota de tu exámen: ");
                        nota = input.nextDouble();

                        if (i % 2 == 0) {
                                mediaB += nota;
                                pares++;
                        } else {
                                mediaA += nota;
                                impares++;
                        } 
                }

                mediaA = mediaA / impares;
                mediaB = mediaB / pares;
                System.out.println("La media del exámenA es: " + mediaA + "\n" + "La media del exámenB es: " + mediaB);

                input.close();
        }
}
