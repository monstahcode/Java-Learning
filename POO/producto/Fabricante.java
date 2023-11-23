package POO.producto;

public class Fabricante {
    private String nombre, telefono, email;

    public Fabricante(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void valida() {
        // Comprobación del nombre
        if (this.nombre.matches("[a-zA-Z]+")) {
            System.out.println(this.nombre);;
        } else {
            System.out.println(this.nombre.replaceAll("[^a-zA-Z]", ""));
        }

        // Validación del telefono
        boolean validacion = false;

        for (int i = 0; i < this.telefono.length(); i++) {
            char posicion = this.telefono.charAt(i);
            if (!Character.isDigit(posicion)) {
                validacion = false;
            } else {
                validacion = true;
            }
        }

        if (this.telefono.length() >= 9 && this.telefono.length() <= 11 && validacion)  {
            System.out.println(this.telefono);
        } else {
            this.telefono = "ERROR";
            System.out.println(this.telefono);
        }

        // Validación del email
        if (this.email.matches("[^@]+@[^\\.]+\\.[a-zA-Z]+")) {
            System.out.println(this.email);
        } else {
            this.email = "sin email";
            System.out.println(this.email);
        }

        // if (!((posicionArroba != -1 && posicionPunto != -1) && poscionArroba > 0 && posionPunto < this.email.length() -1) && posicionArroba-posicionPunto == 1) {
        //      this.email = "sin email"
        // }
    }
}
