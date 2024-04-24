package POO.bbddConect.Ejercicios.Agenda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {

        // Crear la ventana
        JFrame frame = new JFrame("Agenda");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Cerrar la conexión con la base de datos al cerrar la ventana
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                SingletonBBDD.obtenerInstancia().cerrarConexion();
            }
        });
        SingletonBBDD.obtenerInstancia().cerrarConexion();
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(5, 2));

        // Crear los elementos
        JLabel lblId = new JLabel("Id:");
        JTextField txtId = new JTextField();

        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField();
        
        JLabel lblApellido = new JLabel("Apellido:");
        JTextField txtApellido = new JTextField();

        JLabel lblTelefono = new JLabel("Teléfono:");
        JTextField txtTelefono = new JTextField();
       
        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField();

        // Crear los botones
        JButton btnInsertar = new JButton("Insertar");
        JButton btnModificar = new JButton("Modificar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnBuscar = new JButton("Buscar");

        JButton btnPrimero = new JButton("<<");
        JButton btnAnterior = new JButton("<");
        JButton btnSiguiente = new JButton(">");
        JButton btnUltimo = new JButton(">>");

        // Eventos de los botones
        btnInsertar.addActionListener(e -> {
            try {
                // Conectar la base de datos
                Agenda agenda = new Agenda();
                // Conexion con la base de datos
                txtId.setText("");
                SingletonBBDD.obtenerInstancia().obtenerConexion();
                SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(agenda.insertar(txtNombre, txtApellido, txtTelefono, txtEmail));
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        });

        btnModificar.addActionListener(e -> {
            try {
                // Conectar la base de datos
                Agenda agenda = new Agenda();
                // Conexion con la base de datos
                SingletonBBDD.obtenerInstancia().obtenerConexion();
                SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(agenda.modificar(txtId, txtNombre, txtApellido, txtTelefono, txtEmail));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        btnEliminar.addActionListener(e -> {
            try {
                // Conectar la base de datos
                Agenda agenda = new Agenda();
                // Conexion con la base de datos
                txtNombre.setText("");
                txtApellido.setText("");
                txtTelefono.setText("");
                txtEmail.setText("");
                SingletonBBDD.obtenerInstancia().obtenerConexion();
                SingletonBBDD.obtenerInstancia().obtenerConexion().createStatement().executeUpdate(agenda.eliminar(txtId));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        btnBuscar.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.buscar(txtId);
            agenda.desconectar();
        });

        btnPrimero.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.irAlPrimero();
            agenda.desconectar();
        });

        btnAnterior.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.irAlAnterior();
            agenda.desconectar();
        });

        btnSiguiente.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.irAlSiguiente();
            agenda.desconectar();
        });

        btnUltimo.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.irAlUltimo();
            agenda.desconectar();
        });

        // Añadir los elementos al frame
        frame.add(lblId);
        frame.add(txtId);
        frame.add(lblNombre);
        frame.add(txtNombre);
        frame.add(lblApellido);
        frame.add(txtApellido);
        frame.add(lblTelefono);
        frame.add(txtTelefono);
        frame.add(lblEmail);
        frame.add(txtEmail);

        frame.add(btnInsertar);
        frame.add(btnModificar);
        frame.add(btnEliminar);
        frame.add(btnBuscar);

        frame.add(btnPrimero);
        frame.add(btnAnterior);
        frame.add(btnSiguiente);
        frame.add(btnUltimo);

        frame.setVisible(true);
    }
}
