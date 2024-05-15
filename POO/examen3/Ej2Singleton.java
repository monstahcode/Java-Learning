package POO.examen3;

import java.sql.DriverManager;
import java.sql.Connection;

public class Ej2Singleton {
    // Crear una instancia de la clase
    private static Ej2Singleton instancia = null;
    // Crear una conexión a la base de datos
    private Connection conexion = null;   

    // Constructor privado
    private Ej2Singleton() {
        try {
            // Conectar la Base de datos
            String bbdd="jdbc:mysql://localhost:3306/prueba";
            String user ="monstah";
            String key="Ivanesgenial*3"; 
            conexion = DriverManager.getConnection(bbdd, user, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método estático para obtener la instancia única
    public static Ej2Singleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Ej2Singleton();
        }
        return instancia;
    }

    // Método público para obtener la conexión a la base de datos
    public Connection obtenerConexion() {
        return conexion;
    }

    // Método para cerrar la conexión a la base de datos
    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
