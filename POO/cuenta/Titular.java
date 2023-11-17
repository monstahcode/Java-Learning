package POO.cuenta;
import java.util.Date;

public class Titular {
    private String nif, nombre, apellidos;
    private Date fecha;

    public Titular(String nif, String nombre, String apellidos, Date fecha) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
    }
    
    //Getters y Setters
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getNif() {
        return nif;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }

}

