package POO.cuenta;
import java.util.Date;
public class Cuenta {
    int id;
    double saldo;
    Titular titular;

    public Cuenta(int id, double saldo, Titular titular){
        this.id = id;
        this.saldo = saldo;
        this.titular = titular;
    }

    //Setters y getters
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    public Titular getTitular() {
        return titular;
    }

    //Methods
    public void mostrar() {
        System.out.println("ID: " + this.id + "\n" + "Saldo: " + this.saldo + "\n" + "Titular: " + this.titular.getNif() + "\n" + this.titular.getFecha() + "\n" + this.titular.getNombre() + "\n" + this.titular.getApellidos());
    }
    public double ingresar(long ingreso){
        if (ingreso < 0) {
            System.out.println("ERROR: Has introducido un valor negativo");
        }
        this.saldo += ingreso;
        return this.saldo;
    }
    public double retirar(long retiro) {
        this.saldo -= retiro;

        if (this.saldo < 0) {
            this.saldo = 0;
        }
        return this.saldo;
    }

    public boolean compararIdCuenta(Cuenta cuenta2) {
        if (this.id == cuenta2.id) {
            System.out.println("Son iguales");
            return true;
        } else {
            System.out.println("No son iguales");
            return false;
        }
    }

    public boolean compararTitular (Cuenta cuenta2) {
        if (this.titular.getNombre() == cuenta2.titular.getNombre() && this.titular.getApellidos() == cuenta2.titular.getApellidos()) {
            System.out.println("Son iguales");
            return true;         
        } else {
            System.out.println("No son iguales");
            return false;
        }
    }

    public boolean compararTitularCuentaSimilar(Cuenta cuenta2) {
        if (this.compararCadenas(this.titular.getNif(), cuenta2.titular.getNif()) == true && this.compararCadenas(this.titular.getNombre(),cuenta2.titular.getNombre()) == true && this.compararCadenas(this.titular.getApellidos(), cuenta2.titular.getApellidos()) == true && this.compararFechas(this.titular.getFecha(), cuenta2.titular.getFecha()) == true) {
            System.out.println("Hay diferencia");
            return true;
        } else {
            System.out.println("No hay diferencia");
            return false;
        }
    }

    private boolean compararCadenas(String srt1, String srt2) {
        int diferencia = 0;

        for (int i = 0; i < srt1.length(); i++) {
            if (srt1.charAt(i) != srt2.charAt(i)){
                diferencia++;
            }
        }

        if (diferencia==1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean compararFechas(Date fech1, Date fech2) {
        long diferenciaEnMillis = Math.abs(fech1.getTime() - fech2.getTime());
        long diferenciaEnDias = diferenciaEnMillis / (24 * 60 * 60 * 1000);
        if (diferenciaEnDias < 5) {
            return true;
        } else {
            return false;
        }
    }
    
}
