package POO.banco;

public class MainCuenta {

    public static void main(String[] args) {
        Cuenta cuentaBancaria;

        cuentaBancaria = new Cuenta(1,100.45);

        System.out.println(cuentaBancaria.getCantidad());
        cuentaBancaria.ingresar(1000.45);
        System.out.println(cuentaBancaria.getCantidad());
        cuentaBancaria.retirar(0.90);
        System.out.println(cuentaBancaria.getCantidad());
    }
}
