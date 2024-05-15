package POO.bbddConect.Ejercicios.Agenda;

import javax.swing.*;
/**
 * Interfaz que implementa la clase Agenda
 */
public interface AgendaInterface {
    // Métodos para conectarse a la bbdd
    public String conectar();
    public String desconectar();

    // Métodos para trabajar con la bbdd
    public void insertar(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);
    public void modificar(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);
    public void eliminar(JTextField id, JLabel txtLog);
    public void buscar(JTextField id, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);

    // Métodos para navegar por los registros
    public void irAlPrimero(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);
    public void irAlAnterior(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);
    public void irAlSiguiente(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);
    public void irAlUltimo(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog); 
    public boolean comprobarCamposInsert(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);
    public boolean comprobarCampos(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail, JLabel txtLog);

    // Métodos para contar los registros
    public int contarContactos();
    public int contactoActual(JTextField txtId);
}
