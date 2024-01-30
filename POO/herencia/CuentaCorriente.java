package POO.herencia;

public class CuentaCorriente {
    private Titular titular;
    private String numeroCuenta;
    private double saldo;

    // Constructores
    public CuentaCorriente(Titular titular, String numeroCuenta, double saldo) {
        titular = this.titular;
        numeroCuenta = this.numeroCuenta;
        saldo = this.saldo;
    }

    public CuentaCorriente(Titular titular, String nuemeroCuenta) {
        titular = this.titular;
        nuemeroCuenta = this.numeroCuenta;
        saldo = 15.3;
    }

    //Getters Y Setters
    public double getSaldo() {
        return saldo;
    }
    public Titular getTitular() {
        return titular;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void ingresarSaldo(double ingresoSaldo) {
        ingresoSaldo += this.saldo;
        setSaldo(ingresoSaldo);
    }
    public void retiroSaldo(double retiroSaldo) {
        retiroSaldo -= this.saldo;
        setSaldo(retiroSaldo);
    }
    
    public void informacionCuenta() {
        System.out.println("Numero cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
    }

    public boolean cuntasIguales(CuentaCorriente cuenta1, CuentaCorriente cuenta2) {
        boolean iguales = false;
        String n1 = cuenta1.getNumeroCuenta();
        String n2 = cuenta2.getNumeroCuenta();
        
        if (n1.compareTo(n2) < 0){
            iguales = false;
        } else {
            iguales = true;
        }

        return iguales;
    }
    
}
