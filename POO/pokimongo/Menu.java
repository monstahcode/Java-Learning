package POO.pokimongo;
import java.util.Scanner;

public class Menu {
    
    int opcion;
    Scanner input = new Scanner(System.in);

    public void menu1() {
        System.out.println("Elige una acción:");
        System.out.println("1.Moverse\n2.Salir");
        opcion= input.nextInt();
        switch(opcion) {
            case 1:
            menu4();
            break;
            case 2:
            break;
        }
    }

    public void menu2() {
        System.out.println("1.Atacar\n2.Cpaturar\n3.Huir\n4.Salir");
        opcion= input.nextInt();
        switch(opcion) {
            case 1:
            menu3();
            break;
            case 2:
            capturarPokimon();
            break;
            case 3:
            menu4();
            break;
            case 4:
            break;
        }
    }

    public void menu3() {
        System.out.println("1.Pokimon1\n2.Pokimon2\n3.Pokimon3");
        opcion= input.nextInt();
        switch(opcion) {
            case 1:
            pokimon1.luchar();
            break;
            case 2:
            pokimon2.luchar();
            break;
            case 3:
            pokimon3.luchar();
            break;
        }
    }

    public void menu4() {
        System.out.println("1.Arriba\n2.Derecha\n3.Abajo\n4.Izquierda");
        opcion = input.nextInt();
        switch (opcion) {
            case 1:
            moverArriba();
            while(!mover.arriba){
                menu
            }
            menu2();
            break;
            case 2:
            moverDerecha();
            menu2();
            break;
            case 3:
            moverAbajo();
            menu2();
            break;
            case 4:
            moverIzquierda();
            menu2();
            break;
        }
    }
}
