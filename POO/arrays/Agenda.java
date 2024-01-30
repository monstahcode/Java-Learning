package POO.arrays;

import java.util.ArrayList;
import java.util.Scanner;

class Contacto {
    int id;
    String telefono;
    String email;

    public Contacto(int id, String telefono, String email) {
        this.id = id;
        this.telefono = telefono;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Persona extends Contacto {
    String nombre;
    String apellidos;

    public Persona(int id, String telefono, String email, String nombre, String apellidos) {
        super(id, telefono, email);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}

class Empresa extends Contacto {
    String direccion;
    String sector;

    public Empresa(int id, String telefono, String email, String direccion, String sector) {
        super(id, telefono, email);
        this.direccion = direccion;
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

class Agenda {
    ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        Agenda agenda = new Agenda();

        System.out.println("1.Alta de Contacto\n" + "2.Baja de contato\n" + "3.Modificar telefono de un contacto\n"
            + "4.Listar todos los datos de los contactos\n" + "5.Mostrar cuántas empresas hay de cada sector\n"
            + "6.Mostrar todos los datos ordenador por orden alfabético de email\n" + "7.Salir");
        opc = scanner.nextInt();

        while (opc != 7) {
            System.out.println("1.Alta de Contacto\n" + "2.Baja de contato\n" + "3.Modificar telefono de un contacto\n"
                + "4.Listar todos los datos de los contactos\n" + "5.Mostrar cuántas empresas hay de cada sector\n"
                + "6.Mostrar todos los datos ordenador por orden alfabético de email\n" + "7.Salir");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                System.out.println("Introduce el id del contacto a crear:");
                int idC = scanner.nextInt();
                System.out.println("Introduce el numero del contacto a crear:");
                String numC = scanner.next();
                System.out.println("Introduce el email del contacto a crear:");
                String emailC = scanner.next();
                Contacto contacto = new Contacto(idC, numC, emailC);
                agenda.contactos.add(contacto);
                break;
                case 2:
                int idD = 0;
                System.out.println("Introduce el contacto");
                idD = scanner.nextInt();
                for (int i = 0; i < agenda.contactos.size()-1; i++) {
                    Contacto contactoE = agenda.contactos.get(i);
                    int idE = contactoE.getId();
                    if (idE == idD) {
                        agenda.contactos.remove(i);
                    }
                }
                break;
                case 3:
                System.out.println("Intoduce el ID del conteacto a modificar:");
                int idM = scanner.nextInt();
                for (int i = 0; i<agenda.contactos.size()-1; i++) {
                    int idCM = agenda.contactos.get(i).getId();
                    if (idM == idCM) {
                        System.out.println("Introduce el teléfono a cambiar:");
                        String telefonoC = scanner.nextLine();
                        agenda.contactos.get(i).setTelefono(telefonoC);
                    }
                }
                break;
                case 4:
                for (int i = 0; i < agenda.contactos.size()-1; i++) {
                    System.out.println(agenda.contactos.get(i));
                }
                break;
                case 5:
                for(int i = 0; i < agenda.contactos.size()-1; i++){
                }
                break;
                case 6:
                ArrayList<Contacto> = new ArrayList<Contacto>();
                for(int i = 0; i < agenda.contactos.size()-1; i++) {
                    if()
                }
                
                break; }
        }
        scanner.close();
    }
}
