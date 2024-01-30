package POO.programame;
import java.util.Scanner;

public class Problema1 {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int numCasos = Integer.parseInt(scanner.nextLine());
        while (numCasos > 0) {
            int suma = 0;
            int[] E = new int[7];
            
            for (int i = 0; i < E.length; i++) {
                E[i] = scanner.nextInt();
            }
            for (int j = 1; j < E.length; j++) {
                suma += E[j];
            }
            suma = E[0] - suma;
            if (suma > 0 || suma == 0) {
                System.out.println(suma); 
            }
            
            numCasos--;
        }
    }
}
