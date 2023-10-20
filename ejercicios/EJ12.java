import java.util.Scanner; 

public class EJ12 {
        
        public static void main(String[] agvs) {

                int num;

                Scanner input=new Scanner(System.in);

                System.out.println("Número :");
                num = input.nextInt();

                if ((num >= 10) && (num <= 100)) {
                        System.out.println("Está en Rango");
                } else {
                        System.out.println("NO está en rango");
                }
        }
}
