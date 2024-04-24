// Conectarse a una base de datos y hacer un scroll de los datos

package POO.bbddConect.Ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class scroll {

    public static void main(String[] args) {
        Connection conex = null;

        try {
            conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "monstah", "Ivanesgenial*3");
            Statement stmt = conex.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM actores");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " Nombre: " + rs.getString("firstname") + " " + rs.getString("lastname"));
            }
            System.out.println("---------");
            rs.afterLast();
            while (rs.previous()) {
                System.out.println("ID: " + rs.getInt("id") + " Nombre: " + rs.getString("firstname") + " " + rs.getString("lastname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.\n" + e.getMessage().toString());
        }
    }
}
