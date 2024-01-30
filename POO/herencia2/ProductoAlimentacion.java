package POO.herencia2;

public class ProductoAlimentacion extends Producto {
    
    private String tipos;

    public ProductoAlimentacion(String nombre, int precio, String codigo, int existencias, String tipos) {
        super(nombre, precio, codigo, existencias);

        this.tipos = tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
    public String getTipos() {
        return tipos;
    }

    public void mostrarAlimentos(){
        System.out.println(tipos);
    }
}
