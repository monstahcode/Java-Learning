package POO.agenda;
public class Agenda {
    public static void main(String[] args) {
        //La agenda que permite añadir, borrar, modificar y listar contactos
        
        //Creamos la agenda
        AgendaImpl agenda = new AgendaImpl();

        //Creamos los contactos
        Contacto c1 = new Contacto("Juan", "123456789", "Calle 1","email1@gmail.com");
        Contacto c2 = new Contacto("Ana", "987654321", "Calle 2","email2@gmail.com");
        Contacto c3 = new Contacto("Luis", "456789123", "Calle 3","email3@gmail.com");
        
        //Añadimos los contactos a la agenda
        agenda.addContacto(c1);
        agenda.addContacto(c2);
        agenda.addContacto(c3);

        //Listamos los contactos
        System.out.println("Contactos:");
        for (Contacto c : agenda.getContactos()) {
            System.out.println(c.getNombre() + " " + c.getTelefono() + " " + c.getDireccion() + " " + c.getEmail());
        }

        //Modificamos un contacto existente en la agenda
        agenda.updateContacto(c3, "Paco", "459275483", "Calle 4", "email4@gmail.com");

        //Listamos los contactos
        System.out.println("Contactos:");
        for (Contacto c : agenda.getContactos()) {
            System.out.println(c.getNombre() + " " + c.getTelefono() + " " + c.getDireccion() + " " + c.getEmail());
        }

        //Borramos un contacto de la agenda
        agenda.removeContacto(c2);

        //Listamos los contactos
        System.out.println("Contactos:");
        for (Contacto c : agenda.getContactos()) {
            System.out.println(c.getNombre() + " " + c.getTelefono() + " " + c.getDireccion() + " " + c.getEmail());
        }

        //Guardamos la agenda en un fichero
        agenda.save();

        //Cargamos la agenda desde un fichero
        agenda.load();

        //Listamos los contactos desde el agenda.dat
        System.out.println("cat agenda.dat");
    }
}
