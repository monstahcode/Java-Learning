package POO.herencia2;

public class ProductoTextil extends Producto{
    private String[] talla = {"XXS", "XS" , "S", "M", "L", "XL", "XXL"};

    public ProductoTextil(String nombre, int precio, String codigo, int existencias) {
        super(nombre, precio, codigo, existencias);
    }

    public void setTalla(String[] talla) {
        this.talla = talla;
    }
    public String[] getTalla() {
        return talla;
    }

    public void mostrarTallas(){
        for (String talla : talla) {
            System.out.println(talla);
        }
    }
}
