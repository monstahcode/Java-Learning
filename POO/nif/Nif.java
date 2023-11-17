package POO.nif;

public class Nif {

    private long n_DNI;
    private char letra_DNI;

    public Nif(long n_DNI) {
        this.n_DNI = n_DNI;
        this.letra_DNI = letra_DNI;
    }

    public Nif() {
        System.out.println("NIF no válido");
    }

    // methods
    public String mostrarNif() {
        return (n_DNI + "-" + letra_DNI);
    }

    public char calculoLetra(){
        int calculo = (int)n_DNI % 23;
        switch (calculo) {
            case 0:
            letra_DNI = 'T';
            break;
            case 1:
            letra_DNI = 'R';
            break;
            case 2:
            letra_DNI = 'W';
            break;
            case 3:
            letra_DNI = 'A';
            break;
            case 4:
            letra_DNI = 'G';
            break;
            case 5:
            letra_DNI = 'M';
            break;
            case 6:
            letra_DNI = 'Y';
            break;
            case 7:
            letra_DNI = 'F';
            break;
            case 8:
            letra_DNI = 'P';
            break;
            case 9:
            letra_DNI = 'D';
            break;
            case 10:
            letra_DNI = 'X';
            break;
            case 11:
            letra_DNI = 'B';
            break;
            case 12:
            letra_DNI = 'N';
            break;
            case 13:
            letra_DNI = 'J';
            break;
            case 14:
            letra_DNI = 'Z';
            break;
            case 15:
            letra_DNI = 'S';
            break;
            case 16:
            letra_DNI = 'Q';
            break;
            case 17:
            letra_DNI = 'V';
            break;
            case 18:
            letra_DNI = 'H';
            break;
            case 19:
            letra_DNI = 'L';
            break;
            case 20:
            letra_DNI = 'C';
            break;
            case 21:
            letra_DNI = 'K';
            case 22:
            letra_DNI = 'E';
            break;
        }
        return letra_DNI;
    }
}
