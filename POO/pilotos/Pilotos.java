package POO.pilotos; 
import java.util.ArrayList;
import java.util.Scanner;

public class Pilotos {
    int id;
    String nombre, apellidos;
    String nacionalidad;
    ArrayList<Integer> carreras = new ArrayList<Integer>();
    int totalPuntos;

    public Pilotos(int id, String nombre, String apellidos, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
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
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setCarreras(ArrayList<Integer> carreras) {
        this.carreras = carreras;
    }
    public ArrayList<Integer> getCarreras() {
        return carreras;
    }
    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }
    public int getTotalPuntos() {
        return totalPuntos;
    }
}
