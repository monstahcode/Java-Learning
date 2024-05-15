package POO.examen3;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Ej2PaisesImp implements Ej2Interfaz {

    public void guardarDatos(JTextField txtNombre, JTextField txtPoblacion, JLabel lblError) {

        if(!comporobarGuardado(txtNombre, txtPoblacion)) {
            return;
        } else {
            // Crear la sentencia sql necesaria para insertar el contacto
            String sql = "INSERT INTO paises (nombre, poblacion) VALUES ('" + txtNombre.getText() + "', '" + txtPoblacion.getText() + "')";
            // Ejecutar la sentencia sql
            try {
                // Crear la sentencia sql
                Statement stm = Ej2Singleton.obtenerInstancia().obtenerConexion().createStatement();
                // Ejecutar la sentencia sql
                stm.executeUpdate(sql);
                lblError.setText("Datos almacenados");
            } catch (Exception e) {
                // Deolver el mensaje de error: Error al guardar los datos
                lblError.setText("Error al guardar los datos");
                e.printStackTrace();
            }
        }
    }

    public void buscarDatos(JTextField txtNombre, JTextField txtPoblacion, JLabel lblError) {
        if (!comprobarBusqueda(txtNombre)) {
            return;
        } else {
            try {
                String sql = "SELECT * FROM paises WHERE nombre = '" + txtNombre.getText() + "'";
                // Conectar la base de datos
                Connection conn = Ej2Singleton.obtenerInstancia().obtenerConexion();
                // Crear la sentencia sql para ir a el siguinete contacto
                Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stm.executeQuery(sql);
                rs.next();
                // Si no se encuentra el nombre poner un mensaje de error
                if (rs.getRow() == 0) {
                    lblError.setText("No existe el país");
                    return;
                }

                // Rellenar los campos con los datos del contacto
                txtNombre.setText(rs.getString("nombre"));
                txtPoblacion.setText(rs.getString("poblacion"));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void rellenarTabla() {
        try {
            // Creamos un BufferedReader para leer el fichero paises.txt
            BufferedReader br = new BufferedReader(new FileReader("/home/monstah/Clases/DW1A/Programación/Java/POO/examen3/paises.txt"));
            String linea;
            
            // Leemos el fichero línea por línea y escribimos en el nuevo fichero
            while ((linea = br.readLine()) != null) {
                String nombre = linea;
                linea = br.readLine();
                Double poblacion = Double.parseDouble(linea);
                linea = br.readLine();
                String extension = linea;
                linea = br.readLine();
                String pib = linea;
                String sql = "INSERT INTO paises (nombre, poblacion, extension, pib) VALUES ('" + nombre + "', " + poblacion + ", '" + extension + "', '" + pib + "')";
                Ej2Singleton.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(sql);
            }


            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean comprobarBusqueda(JTextField txtNombre) {
        boolean relleno = false;
        if (txtNombre.getText().equals("")) {
            return relleno;
        } else {
            relleno = true;
        }
        return relleno;
    }

    public boolean comporobarGuardado(JTextField txtNombre, JTextField txtPoblacion) {
        boolean relleno = false;
        if (txtNombre.getText().equals("") || txtPoblacion.getText().equals("")) {
            return relleno;
        } else {
            relleno = true;
        }
        return relleno;
    }
}
