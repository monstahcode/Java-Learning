package POO.bbddConect.Ejercicios.Agenda;

import javax.swing.*;
import java.sql.*;

public class Agenda implements AgendaInterface {
    // Implementación de los métodos de la interfaz

    // Método para conectar a la bbdd
    public String conectar() {
        String c = "Conectando a la bbdd...";
        return c;
    }

    // Método para desconectar de la bbdd
    public String desconectar() {
        String d = "Desconectando de la bbdd...";
        return d;
    }

    // Método para insertar un contacto
    public void insertar(JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        alertMsg("Insertando contacto...", txtLog);
        // Comprobar que todos los campos estén rellenos
        if (!comprobarCamposInsert(txtNombre, txtApellido, txtTelefono, txtEmail, txtLog)) {
            alertMsg("No se han rellenado todos los campos necesarios - Nombre, Apellido, Teléfono, Email", txtLog);
            return;
        } else {
            // Crear la sentencia sql necesaria para insertar el contacto
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
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        if (!comprobarCamposId(txtId, txtLog)) {
            alertMsg("No se han rellenado todos los campos necesarios - ID", txtLog);
            return;
        } else {
            String sql = "UPDATE agenda SET first_name = '" + txtNombre.getText() + "', last_name = '"
                    + txtApellido.getText() + "', phone_number = '" + txtTelefono.getText() + "', email = '"
                    + txtEmail.getText() + "' WHERE id = '" + txtId.getText();
            try {
                // Crear la sentencia sql 
                if (comprobarCampos(txtId, txtNombre, txtApellido, txtTelefono, txtEmail, txtLog)) { 
                    // Mostrar una ventana de confirmación
                    int confirmacion = JOptionPane.showConfirmDialog(null,
                        "Hay campos vacíos ¿Seguro que quieres continuar?", "Confirmación",
                        JOptionPane.YES_NO_OPTION);
                    // Si la confirmación es afirmativa
                    if (confirmacion == JOptionPane.YES_OPTION) {
                        // Ejecutar la sentencia sql
                        SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(sql);
                    } else {
                        alertMsg("No se han rellenado todos los campos necesarios - Nombre, Apellido, Teléfono, Email", txtLog);
                        return;
                    }
                } else {
                        SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(sql);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Método para eliminar un contacto
    public void eliminar(JTextField txtId, JLabel txtLog) {

        if (!comprobarCamposId(txtId, txtLog)) {
            alertMsg("No se han rellenado todos los campos necesarios - ID", txtLog);
            return;
        } else
            alertMsg("Eliminando contacto...", txtLog);
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
    public void buscar(JTextField txtId,JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {

        if (!comprobarCamposId(txtId, txtLog)) {
            alertMsg("No se han rellenado todos los campos necesarios - ID", txtLog);
            return;
        } else {
            alertMsg("Buscando contacto...", txtLog);
            try {
            String sql = "SELECT * FROM agenda WHERE id = " + txtId.getText();
            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);
            rs.next();
            txtNombre.setText(rs.getString("first_name"));
            txtApellido.setText(rs.getString("last_name"));
            txtTelefono.setText(rs.getString("phone_number"));
            txtEmail.setText(rs.getString("email"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Método para ir al primer contacto
    public void irAlPrimero(JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        alertMsg("Yendo al primer contacto...", txtLog);
        try {
            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            ResultSet rs = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)
                    .executeQuery("SELECT * FROM agenda");
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

    // Método para ir al anterior contacto
    public void irAlAnterior(JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        alertMsg("Yendo al anterior contacto...", txtLog);
        try {
            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery("SELECT * FROM agenda");
            rs.first();
            while (!txtId.getText().equals(rs.getString("id"))) {
                rs.next();
            }
            if (rs.previous()) {
                txtId.setText(String.valueOf(rs.getInt("id")));
                txtNombre.setText(rs.getString("first_name"));
                txtApellido.setText(rs.getString("last_name"));
                txtTelefono.setText(rs.getString("phone_number"));
                txtEmail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para ir al siguiente contacto
    public void irAlSiguiente(JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        alertMsg("Yendo al siguiente contacto...", txtLog);
        try {

            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery("SELECT * FROM agenda");
            rs.first();
            while (!txtId.getText().equals(rs.getString("id"))) {
                rs.next();
            }
            if (rs.next()) {
                // Método para ir al último contacto
                txtId.setText(String.valueOf(rs.getInt("id")));
                txtNombre.setText(rs.getString("first_name"));
                txtApellido.setText(rs.getString("last_name"));
                txtTelefono.setText(rs.getString("phone_number"));
                txtEmail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void irAlUltimo(JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        alertMsg("Yendo al último contacto...", txtLog);
        try {
            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery("SELECT * FROM agenda");
            if (rs.last()) {
                // Mostrar los datos del primer contacto
                txtId.setText(String.valueOf(rs.getInt("id")));
                txtNombre.setText(rs.getString("first_name"));
                txtApellido.setText(rs.getString("last_name"));
                txtTelefono.setText(rs.getString("phone_number"));
                txtEmail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Métodos para llevar un contador de las páginas de la agenda
    public int contarContactos() {
        int total = 0;
        try {
            String sql = "SELECT * FROM agenda";
            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);
            rs.last();
            total = rs.getRow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }

    public void contactoIr(JTextField pageNumber, JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail) {
        int numeroPagina = Integer.parseInt(pageNumber.getText());
        try {
            String sql = "SELECT * FROM agenda";
            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);
            rs.absolute(numeroPagina);
            txtId.setText(String.valueOf(rs.getInt("id")));
            txtNombre.setText(rs.getString("first_name"));
            txtApellido.setText(rs.getString("last_name"));
            txtTelefono.setText(rs.getString("phone_number"));
            txtEmail.setText(rs.getString("email"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int contactoActual(JTextField txtId) {
        // Méttodo para saber en que página de la agenda estamos
        int fila = 0;
        try {
            // Crear la sentencia sql
            String sql = "SELECT * FROM agenda";
            // Conectar la base de datos
            Connection conn = SingletonBBDD.obtenerInstancia().obtenerConexion();
            // Crear la sentencia sql para ir a el siguinete contacto
            Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stm.executeQuery(sql);
            rs.first();
            while (!txtId.getText().equals(rs.getString("id"))) {
                rs.next();
            }
            rs.next();
            fila = rs.getRow();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fila;
    }

    public void alertMsg(String msg, JLabel txtLog) {
        txtLog.setText(msg);
    }

    // Método para controlar que todos los campos estén rellenos
    public boolean comprobarCamposInsert(JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        alertMsg("Comprobando campos...", txtLog);
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") ||
                txtTelefono.getText().equals("") || txtEmail.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean comprobarCamposId(JTextField txtId, JLabel txtLog) {
        alertMsg("Comprobando campos...", txtLog);
        if (txtId.getText().equals("")) {
            return false;
        }
        return true;
    }

    public boolean comprobarCampos(JTextField txtId, JTextField txtNombre, JTextField txtApellido,
            JTextField txtTelefono, JTextField txtEmail, JLabel txtLog) {
        alertMsg("Comprobando campos...", txtLog);
        if (txtId.getText().equals("") || txtNombre.getText().equals("") || txtApellido.getText().equals("") ||
                txtTelefono.getText().equals("") || txtEmail.getText().equals("")) {
            return false;
        }
        return true;
    }
}
