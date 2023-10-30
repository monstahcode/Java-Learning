package POO.nif;

public class MainNIF {

    public static void main(String[] args) {
        Nif nif;

        nif = new Nif(27742930);
        nif.calculoLetra();
        System.out.println(nif.mostrarNif());
    }
}
