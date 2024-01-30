package POO.herencia;

public class CuentaAhorro extends CuentaCorriente {
    private double interes;

    public CuentaAhorro(Titular titular, String numeroCuenta, double saldo, double interes) {
        super(titular,numeroCuenta,saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String numeroCuenta, double interes) {
        super(titular, numeroCuenta);
        this.interes = interes;
        this.saldo = 15.3;
    }
    
    public CuentaAhorro(Titular titular, String numeroCuenta) {
        super(titular, numeroCuenta);
        this.saldo = 15.3;
        this.interes = 2.5;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    public double getInteres() {
        return interes;
    }

    public void calcularInteres() {
        this.setSaldo(this.getSaldo()*(1+(this.interes/100)));
    }

}
