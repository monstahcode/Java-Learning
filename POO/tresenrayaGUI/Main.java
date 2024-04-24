package POO.tresenrayaGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Hacer la interfaz grafica del tres en raya
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Crear la interfaz del tres en raya
                    JFrame frame = new JFrame("Tres en raya");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(300, 400);
                    frame.setLayout(null);
                    frame.setLocationRelativeTo(null);
                    frame.setResizable(false);

                    // Crear los botones del tres en raya
                    JButton b1 = new JButton("");
                    b1.setBounds(20, 10, 60, 60);
                    frame.add(b1);

                    JButton b2 = new JButton("");
                    b2.setBounds(90, 10, 60, 60);
                    frame.add(b2);

                    JButton b3 = new JButton("");
                    b3.setBounds(160, 10, 60, 60);
                    frame.add(b3);

                    JButton b4 = new JButton("");
                    b4.setBounds(20, 90, 60, 60);
                    frame.add(b4);

                    JButton b5 = new JButton("");
                    b5.setBounds(90, 90, 60, 60);
                    frame.add(b5);

                    JButton b6 = new JButton("");
                    b6.setBounds(160, 90, 60, 60);
                    frame.add(b6);

                    JButton b7 = new JButton("");
                    b7.setBounds(20, 170, 60, 60);
                    frame.add(b7);

                    JButton b8 = new JButton("");
                    b8.setBounds(90, 170, 60, 60);
                    frame.add(b8);

                    JButton b9 = new JButton("");
                    b9.setBounds(160, 170, 60, 60);
                    frame.add(b9);

                    JButton b10 = new JButton("Reiniciar");
                    b10.setBounds(20, 250, 200, 60);
                    frame.add(b10);

                    JTextArea textArea = new JTextArea();
                    textArea.setBounds(20, 320, 200, 30);
                    frame.add(textArea);


                    // Usar los métodos del controlador para los botones
                    Controlador controlador = new Controlador(new JButton[][]{{b1, b2, b3}, {b4, b5, b6}, {b7, b8, b9}});
                    b1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    b2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    b3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    b4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    b5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    b6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    b7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    b8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });
                    
                    b9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.actionPerformed(e);
                            controlador.pasarTurno(e);
                        }
                    });
                    
                    // Controlador para los botones b10 y b11
                    b10.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            controlador.reiniciar(e);
                            controlador.pasarTurno(e);
                        }
                    });

                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
