package POO.pilotos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GestionPilotos {
    ArrayList<Pilotos> pilotosActivos = new ArrayList<Pilotos>();
    Scanner scanner = new Scanner(System.in);

    public GestionPilotos(ArrayList<Pilotos> pilotosActivos) {
        this.pilotosActivos = pilotosActivos;
    }
    
    public void altaPiloto() {
        
        System.out.println("Introduce el núemero de licencia:");
        int numeroLicencia = scanner.nextInt();
        System.out.println("Introduce el núemero de licencia:");
        String nombre = scanner.next();
        System.out.println("Introduce el núemero de licencia:");
        String apellidos = scanner.next();
        System.out.println("Introduce el núemero de licencia:");
        String nacionalidad = scanner.next();
        System.out.println();
        
        Pilotos piloto = new Pilotos(numeroLicencia, nombre, apellidos, nacionalidad);
        System.out.println("Piloto registrado");
        pilotosActivos.add(piloto);
        scanner.close();
    }

    private void agregarPuntos(Pilotos piloto, int nptos) {
        piloto.carreras.add(nptos);
    }

    public void agregarTodoLosPuntos(Pilotos piloto) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Introdce los puntos de la carrera " + i);
            int ptos = scanner.nextInt();
            agregarPuntos(piloto, ptos);
        }
    }

    public void agrarPuntosUltCarrera(Pilotos piloto, int ptos) {
        piloto.carreras.add(ptos);
    }

    public ArrayList<Pilotos> listarDatos() {
        ArrayList<Pilotos> piloto = new ArrayList<Pilotos>();
        for (int i = 0; i < pilotosActivos.size()-1; i++) {
            if (pilotosActivos.get(i).getCarreras().get(i) < 5) {
                piloto.add(pilotosActivos.get(i));
            }
        } 
        return piloto;
    }

    public void sumarPuntos(Pilotos piloto1) {
        int suma = 0;
        for (int i = 0; i < piloto1.getCarreras().size(); i++) {
            suma += piloto1.getCarreras().get(i);
        }
        piloto1.setTotalPuntos(suma);
    }

    public Pilotos puntuacionMasAlta(ArrayList<Pilotos> listaPilotos) {
        int temp = 0;
        int tempto = 0;
        for (int i = 0; i < listaPilotos.size(); i++) {
            if (listaPilotos.get(i + 1).getTotalPuntos() < tempto) {
                temp = i + 1;
                tempto = listaPilotos.get(i + 1).getTotalPuntos();
            }
        }
        
        return listaPilotos.get(temp);
    }

    public ArrayList<String> correosOrdenados(ArrayList<Pilotos> listaPilotos){
        ArrayList<String> listaCorreosOrdenados = new ArrayList<String>();
        
        for (int i = 0; i < listaPilotos.size() -1 ; i++) {
            listaCorreosOrdenados.add(listaPilotos.get(i).getNombre());
        }
        Collections.sort(listaCorreosOrdenados);
        return listaCorreosOrdenados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pilotos> pilotosActivos = new ArrayList<>();
        GestionPilotos gestion = new GestionPilotos(pilotosActivos);
        int opc = 0;
        
        System.out.println("menu");
        opc = scanner.nextInt();

        while (opc != 7) {
            switch (opc) {
                case 1:
                    gestion.altaPiloto();
                    break;
                case 2:
                    gestion.agregarTodoLosPuntos();;
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
            }           
        }
        scanner.close();
    }
}
