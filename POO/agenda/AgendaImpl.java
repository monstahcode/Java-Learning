package POO.agenda;

import java.util.ArrayList;
import java.io.*;
// Implementar la interfaz de la agenda usando RandomAccessFile
public class AgendaImpl implements AgendaInteface {
    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private String fichero = "agenda.dat";

    public void addContacto(Contacto c) {
        contactos.add(c);
    }

    public void removeContacto(Contacto c) {
        contactos.remove(c);
    }

    public void updateContacto(Contacto c, String nombre, String email, String telefono, String direccion) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(c.getNombre())) {
                contacto.setTelefono(telefono);
                contacto.setDireccion(direccion);
                contacto.setEmail(email);
                contacto.setNombre(nombre);
            }
        }
    }
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public Contacto getContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                return c;
            }
        }
        return null;
    }

    public void save() {
        try {
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            for (Contacto c : contactos) {
                raf.writeUTF(c.getNombre());
                raf.writeUTF(c.getTelefono());
                raf.writeUTF(c.getDireccion());
                raf.writeUTF(c.getEmail());
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load() {
        try {
            RandomAccessFile raf = new RandomAccessFile(fichero, "r");
            while (raf.getFilePointer() < raf.length()) {
                String nombre = raf.readUTF();
                String telefono = raf.readUTF();
                String direccion = raf.readUTF();
                String email = raf.readUTF();
                Contacto c = new Contacto(nombre, telefono, direccion, email);
                contactos.add(c);
            }
            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
