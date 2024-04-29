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
        // Cerrar la conexión a la base de datos al cerrar la ventana
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                SingletonBBDD.obtenerInstancia().cerrarConexion();
            }
        });
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);

        // Crear los elementos
        JLabel lblId = new JLabel("Id:");
        lblId.setBounds(12, 12, 70, 15);
        JTextField txtId = new JTextField();
		txtId.setBounds(100, 10, 114, 19);
		txtId.setColumns(10);

        JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 39, 70, 15);
        JTextField txtNombre = new JTextField();
		txtNombre.setBounds(100, 37, 114, 19);
		txtNombre.setColumns(10);
        
        JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(12, 66, 70, 15);
        JTextField txtApellido = new JTextField();
		txtApellido.setBounds(100, 64, 114, 19);
		txtApellido.setColumns(10);

        JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(12, 93, 70, 15);
        JTextField txtTelefono = new JTextField();
		txtTelefono.setBounds(100, 91, 114, 19);
		txtTelefono.setColumns(10);
       
        JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 120, 70, 15);
        JTextField txtEmail = new JTextField();
		txtEmail.setBounds(100, 118, 114, 19);
		txtEmail.setColumns(10);
        
        // Text Areas
		JTextArea pageNumber = new JTextArea();
		pageNumber.setBounds(202, 221, 30, 30);
		frame.getContentPane().add(pageNumber);
		
        JTextArea numberOf = new JTextArea();
		numberOf.setBounds(389, 221, 30, 30);
		frame.getContentPane().add(numberOf);
		
		JTextField textLog = new JTextField();
		textLog.setBounds(22, 152, 397, 60);
		frame.getContentPane().add(textLog);

        // Crear los botones
        JButton btnInsertar = new JButton("Insertar");
        btnInsertar.setBounds(275, 7, 117, 25);
        JButton btnModificar = new JButton("Modificar");
        btnModificar.setBounds(275, 39, 117, 25);
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(275, 71, 117, 25);
        JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(275, 108, 117, 25);

        JButton btnPrimero = new JButton("<<");
        btnPrimero.setBounds(69, 221, 54, 30);
        JButton btnAnterior = new JButton("<");
        btnAnterior.setBounds(135, 221, 44, 30);
        JButton btnSiguiente = new JButton(">");
        btnSiguiente.setBounds(257, 221, 44, 30);
        JButton btnUltimo = new JButton(">>");
		btnUltimo.setBounds(313, 221, 54, 30);
        
        // Eventos de los botones
        btnInsertar.addActionListener(e -> {
            Agenda agenda = new Agenda();
        // Conexion con la base de datos
            agenda.conectar();
            agenda.insertar(txtNombre, txtApellido, txtTelefono, txtEmail);
            agenda.desconectar();
        });

        btnModificar.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.modificar(txtId, txtNombre, txtApellido, txtTelefono, txtEmail);
            agenda.desconectar();
        });

        btnEliminar.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.eliminar(txtId);
            agenda.desconectar();
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
            agenda.irAlPrimero(txtId, txtNombre, txtApellido, txtTelefono, txtEmail);
            agenda.desconectar();
        });

        btnAnterior.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.irAlAnterior(txtId, txtNombre, txtApellido, txtTelefono, txtEmail);
            agenda.desconectar();
        });

        btnSiguiente.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.irAlSiguiente(txtId, txtNombre, txtApellido, txtTelefono, txtEmail);
            agenda.desconectar();
        });

        btnUltimo.addActionListener(e -> {
            Agenda agenda = new Agenda();
            agenda.conectar();
            agenda.irAlUltimo(txtId, txtNombre, txtApellido, txtTelefono, txtEmail);
            agenda.desconectar();
        });

        // Añadir los elementos al frame
        frame.getContentPane().add(lblId);
        frame.getContentPane().add(txtId);
        frame.getContentPane().add(lblNombre);
        frame.getContentPane().add(txtNombre);
        frame.getContentPane().add(lblApellido);
        frame.getContentPane().add(txtApellido);
        frame.getContentPane().add(lblTelefono);
        frame.getContentPane().add(txtTelefono);
        frame.getContentPane().add(lblEmail);
        frame.getContentPane().add(txtEmail);

        frame.getContentPane().add(btnInsertar);
        frame.getContentPane().add(btnModificar);
        frame.getContentPane().add(btnEliminar);
        frame.getContentPane().add(btnBuscar);
              
        frame.getContentPane().add(btnPrimero);
        frame.getContentPane().add(btnAnterior);
        frame.getContentPane().add(btnSiguiente);
        frame.getContentPane().add(btnUltimo);

        frame.setVisible(true);
    }
}
