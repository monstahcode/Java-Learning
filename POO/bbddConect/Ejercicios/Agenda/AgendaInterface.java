package POO.bbddConect.Ejercicios.Agenda;

import javax.swing.*;

/**
 * Interfaz que implementa la clase Agenda
 */
public interface AgendaInterface {
    // Métodos para conectarse a la bbdd
    public void conectar();
    public void desconectar();

    // Métodos para trabajar con la bbdd
    public void insertar(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public void modificar(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public void eliminar(JTextField id);
    public void buscar(JTextField id);

    // Métodos para navegar por los registros
    public void irAlPrimero(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public void irAlAnterior(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public void irAlSiguiente(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public void irAlUltimo(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail); 
    public boolean comprobarCamposInsert(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public boolean comprobarCampos(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
}
