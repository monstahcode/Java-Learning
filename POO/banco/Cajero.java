package POO.banco;

public class Cajero {

    //Metodos
    public void mostrar(Cuenta cuenta) {
        System.out.println("Numero de cuenta: " + cuenta.getId() + "\n" + "Dinero en la cuenta: " + cuenta.getCantidad());
    }

    public void ingresar(Cuenta cuenta) {
        cuenta.getId().setCantidad();
    }

    public void retirar(Cuenta cuenta) {
        cuenta.getId().getCantidad(); 
    }
}
