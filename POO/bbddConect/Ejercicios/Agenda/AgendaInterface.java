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
    public String insertar(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public String modificar(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public String eliminar(JTextField id);
    public void buscar(JTextField id);

    // Métodos para navegar por los registros
    public void irAlPrimero();
    public void irAlAnterior();
    public void irAlSiguiente();
    public void irAlUltimo(); 
    public boolean comprobarCamposInsert(JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
    public boolean comprobarCampos(JTextField txtId, JTextField txtNombre, JTextField txtApellido, JTextField txtTelefono, JTextField txtEmail);
}
