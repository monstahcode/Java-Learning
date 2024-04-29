package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class testGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testGUI window = new testGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(12, 12, 70, 15);
		frame.getContentPane().add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(12, 39, 70, 15);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(12, 66, 70, 15);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(12, 93, 70, 15);
		frame.getContentPane().add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(12, 120, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(202, 221, 30, 30);
		frame.getContentPane().add(textArea);
		
		textField = new JTextField();
		textField.setBounds(100, 10, 114, 19);
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 37, 114, 19);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 64, 114, 19);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(100, 91, 114, 19);
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(100, 118, 114, 19);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(275, 7, 117, 25);
		frame.getContentPane().add(btnInsertar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(275, 39, 117, 25);
		frame.getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(275, 71, 117, 25);
		frame.getContentPane().add(btnEliminar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(275, 108, 117, 25);
		frame.getContentPane().add(btnBuscar);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.setBounds(69, 221, 54, 30);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setBounds(135, 221, 44, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">");
		btnNewButton_2.setBounds(257, 221, 44, 30);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(">>");
		btnNewButton_3.setBounds(313, 221, 54, 30);
		frame.getContentPane().add(btnNewButton_3);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(389, 221, 30, 30);
		frame.getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(22, 152, 397, 60);
		frame.getContentPane().add(textArea_2);
	}
}
