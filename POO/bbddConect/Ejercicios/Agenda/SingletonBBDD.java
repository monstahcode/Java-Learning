package POO.bbddConect.Ejercicios.Agenda;

import java.sql.DriverManager;
import java.sql.Connection;

public class SingletonBBDD {
    // Crear una instancia de la clase
    private static SingletonBBDD instancia = null;
    // Crear una conexión a la base de datos
    private Connection conexion = null;   

    // Constructor privado
    private SingletonBBDD() {
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
    public static SingletonBBDD obtenerInstancia() {
        if (instancia == null) {
            instancia = new SingletonBBDD();
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
