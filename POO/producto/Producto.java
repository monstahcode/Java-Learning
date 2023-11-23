package POO.producto;

public class Producto {
    private String codigo, marca, modelo;
    private double precio;
    private Fabricante fabricante;

    public Producto(String codigo, String marca, String modelo, double precio, Fabricante fabricante) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    
    public void valida() {
        // Validacion de codigo
        if (this.codigo.matches("[A-Z]\\d{3}[a-z]")) {
            System.out.println(this.codigo);
        } else {
            this.codigo = "A000a";
            System.out.println(this.codigo);
        }

        // Validacion de marca
        if (!this.marca.matches("[a-zA-Z0-9]+")) {
            System.out.println(this.marca.replaceAll("[^a-zA-Z0-9]", ""));
        } else {
            System.out.println(this.marca);
        }

        // Validacion de modelo
        if (!this.modelo.matches("[a-zA-Z0-9]+")) {
            System.out.println(this.modelo.replaceAll("[^a-zA-Z0-9]", ""));
        } else {
            System.out.println(this.modelo);
        }

        // Validacion de fabricante
        this.fabricante.valida();
    }
}
