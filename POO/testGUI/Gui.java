package POO.testGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

class Gui {
    public static void main(String args[]){
        // Introducir una valor a traves de un campo de texto, un boton y una etiqueta
        // Hacer un evento para que al presionar el boton, se muestre el mensaje en la etiqueta
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JFrame frame = new JFrame("Test GUI");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(300, 200);
                    frame.setLayout(null);

                    // Crear un texto donde ponga introduce un dato
                    JLabel text = new JLabel("Introduce un dato");
                    text.setBounds(20, 0, 200, 20);
                    frame.add(text);

                    // Crear un campo de texto
                    JTextField textField = new JTextField();
                    textField.setBounds(20, 20, 200, 30);
                    frame.add(textField);
                    // Leer el dato del campo de texto y almacenarlo en una variable cuando se puresione la tecla del enter
                    textField.addActionListener(e -> {
                        String textValue = textField.getText();
                    });

                    // Crear un boton
                    JButton button = new JButton("Presioname");
                    button.setBounds(20, 60, 200, 30);
                    frame.add(button);
                    // Evento del boton
                    button.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent e) {
                            // Mostrar el valor introducido en el campo de texto
                            System.out.println(textField.getText());
                        }
                    });
                    // Crear una etiqueta con un evento, que cuando se presione el boton, se muestre el mensaje en la ventana 
                    JLabel label = new JLabel();
                    label.setBounds(20, 100, 200, 30);
                    frame.add(label);
                    // Cambiar el texto de la etiqueta con el mensaje: Has presionado el boton
                    button.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent e) {
                            label.setText("Has presionado el boton");
                        }
                    });

                    // Mostrar la ventana
                    frame.setVisible(true);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
