package POO.agenda;

import java.util.ArrayList;

// Para hacer una agenda donde la creacion de contactos implemente el modelo DAO
public interface AgendaInteface {
    public void addContacto(Contacto c);
    public void removeContacto(Contacto c);
    // updateContacto cambia un dato del contacto c por uno nuevo
    public void updateContacto(Contacto c, String nombre, String email, String telefono, String direccion);
    public ArrayList<Contacto> getContactos();
    public Contacto getContacto(String nombre);
    public void save();
    public void load();
}


