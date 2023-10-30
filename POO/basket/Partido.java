package POO.basket;
public class Partido {

    public static void main(String[] args) {
        //Creacion de jugadores
        Jugador jugador1, jugador2;

        jugador1 = new Jugador();
        jugador2 = new Jugador(1.98,59.4,32.3);

        //10 días de entrenamiento
        jugador1.entrenar_dos(10);
        jugador1.entrenar_tres(10);
        jugador2.entrenar_dos(10);
        jugador2.entrenar_tres(10);
        System.out.println("Jugador 1:" + jugador1.getPorcentaje_dobles() + " de tiros dobles y " + jugador1.getPorcentaje_triples() + "tiros triples\n" + "Jugador 2: " + jugador2.getPorcentaje_dobles() + "de tiros dobles y " + jugador2.getPorcentaje_triples() + " de tiros triples");
        //Continuar entrenando hasta min 65% y min 45%
        while (jugador1.getPorcentaje_dobles() < 65 && jugador1.getPorcentaje_triples() < 45) {
            jugador1.entrenar_dos();
            jugador1.entrenar_tres();
        }
        while (jugador2.getPorcentaje_dobles() < 65 && jugador2.getPorcentaje_triples() < 45) {
            jugador2.entrenar_dos();
            jugador2.entrenar_tres();
        }

        //Lanzamiento de tiros
        int i = 0;
        while (i < 10) {
            jugador1.lanzar_de_dos();
            if (jugador1.lanzar_de_dos() == true) {
                i++;
            } else {
            }
            i = 0;
            while (i < 4) {
                jugador1.lanzar_de_tres();
                if (jugador1.lanzar_de_tres() == true) {
                    i++;
                } else {

                }
            }

            System.out.println("El jugador 1 ha logrado las canastas deseadas");

            i = 0;
            while (i < 10) {
                jugador2.lanzar_de_dos();
                if (jugador2.lanzar_de_dos() == true) {
                    i++;   
                } else {

                }
            }
            i = 0; 
            while (i < 4) {
                jugador2.lanzar_de_tres();
                if (jugador2.lanzar_de_tres() == true) {
                    i++;   
                } else {

                }
            }
            System.out.println("El jugador 2 ha logrado las canastas deseadas");
        }
    }
}

