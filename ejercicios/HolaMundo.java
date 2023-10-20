import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {		

		int numeroEntero;
		double numeroReal;

		Scanner teclado=new Scanner(System.in);
		System.out.println("Entero: ");
		numeroEntero=teclado.nextInt();
		System.out.println("Real: ");
		numeroReal=teclado.nextDouble();
		System.out.println("Hola Mundo");	

		 int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;			   
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);

		teclado.close();
	}
}

