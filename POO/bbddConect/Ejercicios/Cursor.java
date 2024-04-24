package POO.bbddConect.Ejercicios;

import java.sql.*;
import java.util.Scanner;

public class Cursor {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Connection conex = null;

            PreparedStatement ps;
            String sql;
            String nombre;
            System.out.println("Nombre a Buscar: ");
            nombre = scanner.nextLine();

            conex = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/prueba", 
                "monstah", 
                "Ivanesgenial*3"
            );

            sql = "SELECT * FROM actores WHERE firstname =?";
            ps = conex.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE);

            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + " Nombre: " + rs.getString("firstname") + " " + rs.getString("lastname"));
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.\n" + e.getMessage().toString());
        }
    } 
}
