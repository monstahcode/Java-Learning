package POO.herencia2;

public class Producto {
    private String nombre;
    private int precio;
    private String codigo;
    private int existencias;

    public Producto(String nombre, int precio, String codigo, int existencias) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.existencias = existencias;
    }

    //Getters Y Setters
    public int getPrecio() {
        return precio;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getExistencias() {
        return existencias;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    
    public void modificarPrecio(int nuevoPrecio) {
        this.setPrecio(nuevoPrecio);
    }

    public void modificarExistencias(int nuevasEx) {
        this.setExistencias(nuevasEx);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Existencias: " + this.existencias);
    }
}
