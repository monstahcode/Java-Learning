package POO.herencia2;

public class ProductoElectronica extends Producto{
    
    private String tipos; 

    public ProductoElectronica(String nombre, int precio, String codigo, int existencias, String tipos) {
        super(nombre, precio, codigo, existencias);

        this.tipos = tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
    public String getTipos() {
        return tipos;
    }

    public void mostrarTipos() {
        System.out.println(tipos);
    }
}
