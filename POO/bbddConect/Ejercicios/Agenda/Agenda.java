package POO.bbddConect.Ejercicios.Agenda;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Agenda implements AgendaInterface {
    // Implementación de los métodos de la interfaz

    // Método para conectar a la bbdd
    public void conectar() {
        System.out.println("Conectando a la bbdd...");
    }
    
    // Método para desconectar de la bbdd
    public void desconectar() {
        System.out.println("Desconectando de la bbdd...");
    }

    // Método para insertar un contacto
    public void insertar(JTextField txtNombre, JTextField txtApellido, 
                         JTextField txtTelefono, JTextField txtEmail) {
        System.out.println("Insertando contacto...");
        // Comprobar que todos los campos estén rellenos
        if (!comprobarCamposInsert(txtNombre, txtApellido, txtTelefono, txtEmail)) {
            System.out.println("No se han rellenado todos los campos necesarios - Nombre, Apellido, Teléfono, Email");
            return;
        } else {
            //Crear la sentencia sql necesaria para insertar el contacto
            String sql = "INSERT INTO agenda (first_name, last_name, phone_number, email) VALUES ('"
                         + txtNombre.getText() + "', '" + txtApellido.getText() + "', '" + txtTelefono.getText() 
                         + "', '" + txtEmail.getText() + "')";

            // Ejecutar la sentencia sql
            try {
                // Crear la sentencia sql
                SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // Método para modificar un contacto
    public void modificar(JTextField txtId, JTextField txtNombre, JTextField txtApellido, 
                            JTextField txtTelefono, JTextField txtEmail) {
        
        if (!comprobarCampos(txtId, txtNombre, txtApellido, txtTelefono, txtEmail)) {
            System.out.println("No se han rellenado todos los campos necesarios - ID, Nombre, Apellido, Teléfono, Email");
            return;
        } else {
            // TODO
            // Comprobar que todos los campos estén rellenos
            System.out.println("Modificando contacto...");
            //Crear la sentencia sql necesaria para modificar el contacto
            String sql = "UPDATE agenda SET first_name = '" + txtNombre.getText() + "', last_name = '" 
            + txtApellido.getText() + "', phone_number = '" + txtTelefono.getText()  
            + "', email = '" + txtEmail.getText() + "' WHERE id = " + txtId.getText();
            
            try {
                // Crear la sentencia sql
                SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // Método para eliminar un contacto
    public void eliminar(JTextField txtId) {

        if (!comprobarCamposId(txtId)) {
            System.out.println("No se han rellenado todos los campos necesarios - ID");
            return;
        } else
        System.out.println("Eliminando contacto...");
        // Buscar el contacto por la id y eliminarlo
        String sql = "DELETE FROM agenda WHERE id = " + txtId.getText();

        try {
            // Crear la sentencia sql
            SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método para buscar un contacto
    public void buscar(JTextField txtId) {

        if (!comprobarCamposId(txtId)) {
            System.out.println("No se han rellenado todos los campos necesarios - ID");
            return;
        } else {
            System.out.println("Buscando contacto...");
            //Buscar el contacto por la id
            String sql = "SELECT * FROM agenda WHERE id = ?";

            try {
                // Crear la sentencia sql
                SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    // Método para ir al primer contacto
    public void irAlPrimero(JTextField txtId, JTextField txtNombre, JTextField txtApellido, 
                            JTextField txtTelefono, JTextField txtEmail) {
        System.out.println("Yendo al primer contacto...");
        try (Statement stm = 
        SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)
        ;) 
    {
            // Conectar la base de datos
            SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir al primer contacto
            ResultSet rs = stm.executeQuery("SELECT * FROM agenda");
            rs.first();
            // Mostrar los datos del primer contacto
            txtId.setText(String.valueOf(rs.getInt("id")));
            txtNombre.setText(rs.getString("first_name"));
            txtApellido.setText(rs.getString("last_name"));
            txtTelefono.setText(rs.getString("phone_number"));
            txtEmail.setText(rs.getString("email"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método para ir al anterior contacto
    public void irAlAnterior(JTextField txtId, JTextField txtNombre, JTextField txtApellido, 
                            JTextField txtTelefono, JTextField txtEmail) {
        System.out.println("Yendo al anterior contacto...");
        try (Statement stm = 
        SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)
        ;) 
    {
            // Conectar la base de datos
            SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir al primer contacto
            ResultSet rs = stm.executeQuery("SELECT * FROM agenda");
            rs.previous();
            // Mostrar los datos del primer contacto
            txtId.setText(String.valueOf(rs.getInt("id")));
            txtNombre.setText(rs.getString("first_name"));
            txtApellido.setText(rs.getString("last_name"));
            txtTelefono.setText(rs.getString("phone_number"));
            txtEmail.setText(rs.getString("email"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método para ir al siguiente contacto
    public void irAlSiguiente(JTextField txtId, JTextField txtNombre, JTextField txtApellido, 
                            JTextField txtTelefono, JTextField txtEmail) {
        System.out.println("Yendo al siguiente contacto...");
        try (Statement stm = 
        SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)
        ;) 
    {
            // Conectar la base de datos
            SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir al primer contacto
            ResultSet rs = stm.executeQuery("SELECT * FROM agenda");
            rs.next();
            // Mostrar los datos del primer contacto
            txtId.setText(String.valueOf(rs.getInt("id")));
            txtNombre.setText(rs.getString("first_name"));
            txtApellido.setText(rs.getString("last_name"));
            txtTelefono.setText(rs.getString("phone_number"));
            txtEmail.setText(rs.getString("email"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método para ir al último contacto
    public void irAlUltimo(JTextField txtId, JTextField txtNombre, JTextField txtApellido, 
                            JTextField txtTelefono, JTextField txtEmail) {
        System.out.println("Yendo al último contacto...");
        try (Statement stm = 
        SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)
        ;) 
    {
            // Conectar la base de datos
            SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir al primer contacto
            ResultSet rs = stm.executeQuery("SELECT * FROM agenda");
            rs.last();
            // Mostrar los datos del primer contacto
            txtId.setText(String.valueOf(rs.getInt("id")));
            txtNombre.setText(rs.getString("first_name"));
            txtApellido.setText(rs.getString("last_name"));
            txtTelefono.setText(rs.getString("phone_number"));
            txtEmail.setText(rs.getString("email"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para controlar que todos los campos estén rellenos
    public boolean comprobarCamposInsert(JTextField txtNombre, JTextField txtApellido, 
                                   JTextField txtTelefono, JTextField txtEmail) {
        System.out.println("Comprobando campos...");
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || 
            txtTelefono.getText().equals("") || txtEmail.getText().equals("")) {
            return false;
        }
        return true;
    }
    public boolean comprobarCamposId(JTextField txtId) {
        System.out.println("Comprobando campos...");
        if (txtId.getText().equals("")) {
            return false;
        }
        return true;
    }
    public boolean comprobarCampos(JTextField txtId, JTextField txtNombre, JTextField txtApellido, 
                                   JTextField txtTelefono, JTextField txtEmail) {
        System.out.println("Comprobando campos...");
        if (txtId.getText().equals("") || txtNombre.getText().equals("") || txtApellido.getText().equals("") || 
            txtTelefono.getText().equals("") || txtEmail.getText().equals("")) {
            return false;
        }
        return true;
    }
}
