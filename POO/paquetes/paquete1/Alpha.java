package POO.paquetes.paquete1;

public class Alpha {
    public int prueba1 = 1;
    protected int prueba2 = 2;
    int prueba3 = 3;
    private int prueba4 = 4;

    public Alpha() {
        super();

        int prueba1 =this.prueba1;
        int prueba2 =this.prueba2;
        int prueba3 =this.prueba3;
        int prueba4 =this.prueba4;
    }

    public int getPrueba1() {
        return prueba1;
    }
    protected int getPrueba2() {
        return prueba2;
    }
    int getPrueba3() {
        return prueba3;
    }
    private int getPrueba4() {
        return prueba4;
    }
}
