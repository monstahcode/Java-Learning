package POO.examen3;

import javax.swing.JLabel;
import javax.swing.JTextField;

// Iterfaz que contiene los métodos que se deben implementar en la clase Ej2PaisesImp
public interface Ej2Interfaz {

    public void rellenarTabla();
    public void guardarDatos(JTextField txtNombre, JTextField txtPoblacion, JLabel lblError);
    public void buscarDatos(JTextField txtNombre, JTextField txtPoblacion, JLabel lblError);

    // Método que comprueba si los datos introducidos en los JTextArea son correctos
    // public boolean comprobarGuardado(JTextField txtNombre, JTextField txtPoblacion); /*Da un error pero comentando esto se quita */
    public boolean comprobarBusqueda(JTextField txtNombre);
}
