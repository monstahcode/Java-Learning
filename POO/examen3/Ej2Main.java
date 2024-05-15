package POO.examen3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ej2Main {
	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtPoblacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Leer del fichero pasises.txt y rellenar la tabla de la bbdd
		Ej2PaisesImp paises = new Ej2PaisesImp();
		paises.rellenarTabla();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2Main window = new Ej2Main();
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
	public Ej2Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 18));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtNombre.setBounds(177, 22, 157, 35);
		txtNombre.setColumns(10);
		frame.getContentPane().add(txtNombre);

		txtPoblacion = new JTextField();
		txtPoblacion.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtPoblacion.setBounds(177, 71, 157, 35);
		txtPoblacion.setColumns(10);
		frame.getContentPane().add(txtPoblacion);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(37, 210, 117, 25);
		frame.getContentPane().add(btnGuardar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(243, 210, 117, 25);
		frame.getContentPane().add(btnBuscar);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNombre.setBounds(24, 24, 117, 33);
		frame.getContentPane().add(lblNombre);

		JLabel lblPoblacion = new JLabel("Población");
		lblPoblacion.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPoblacion.setBounds(24, 63, 117, 51);
		frame.getContentPane().add(lblPoblacion);

		JLabel lblError = new JLabel("Error al guardar datos"); /*Esto tendría que haber estado en blanco*/ //TODO
		lblError.setFont(new Font("Dialog", Font.BOLD, 18));
		lblError.setBounds(24, 138, 406, 44);
		frame.getContentPane().add(lblError);

		// Eventos para los botones
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ej2PaisesImp paises = new Ej2PaisesImp();
				paises.guardarDatos(txtNombre, txtPoblacion, lblError);
			}
		});

		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ej2PaisesImp paises = new Ej2PaisesImp();
				paises.buscarDatos(txtNombre, txtPoblacion, lblError);
			}
		});

	}
}
