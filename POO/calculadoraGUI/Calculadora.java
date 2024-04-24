package POO.calculadoraGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Realizar la interfaz grafica de una calculadora que se ejecute en el main

public class Calculadora {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
           public void run() {
                try {
                    // Crear la interfaz de la calculadora
                    JFrame frame = new JFrame("Calculadora");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(300, 400);
                    frame.setLayout(null);
                    frame.setLocationRelativeTo(null);
                    frame.setResizable(false);

                    // Crear un campo de texto
                    JTextField textField = new JTextField();
                    textField.setBounds(20, 10, 260, 30);
                    frame.add(textField);

                    // Crear los botones de la calculadora
                    JButton b0 = new JButton("0");
                    b0.setBounds(20, 50, 60, 60);
                    frame.add(b0);

                    JButton b1 = new JButton("1");
                    b1.setBounds(90, 50, 60, 60);
                    frame.add(b1);

                    JButton b2 = new JButton("2");
                    b2.setBounds(160, 50, 60, 60);
                    frame.add(b2);

                    JButton b3 = new JButton("3");
                    b3.setBounds(230, 50, 60, 60);
                    frame.add(b3);

                    JButton b4 = new JButton("4");
                    b4.setBounds(20, 120, 60, 60);
                    frame.add(b4);

                    JButton b5 = new JButton("5");
                    b5.setBounds(90, 120, 60, 60);
                    frame.add(b5);

                    JButton b6 = new JButton("6");
                    b6.setBounds(160, 120, 60, 60);
                    frame.add(b6);

                    JButton b7 = new JButton("7");
                    b7.setBounds(230, 120, 60, 60);
                    frame.add(b7);

                    JButton b8 = new JButton("8");
                    b8.setBounds(20, 190, 60, 60);
                    frame.add(b8);

                    JButton b9 = new JButton("9");
                    b9.setBounds(90, 190, 60, 60);
                    frame.add(b9);

                    JButton bSum = new JButton("+");
                    bSum.setBounds(160, 190, 60, 60);
                    frame.add(bSum);

                    JButton bSub = new JButton("-");
                    bSub.setBounds(230, 190, 60, 60);
                    frame.add(bSub);

                    JButton bMul = new JButton("*");
                    bMul.setBounds(20, 260, 60, 60);
                    frame.add(bMul);

                    JButton bDiv = new JButton("/");
                    bDiv.setBounds(90, 260, 60, 60);
                    frame.add(bDiv);

                    JButton bEq = new JButton("=");
                    bEq.setBounds(160, 260, 60, 60);
                    frame.add(bEq);

                    JButton bC = new JButton("C");
                    bC.setBounds(230, 260, 60, 60);
                    frame.add(bC);

                    // Eventos de los botones
                    b0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"0");
                        }
                    });

                    b1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"1");
                        }
                    });

                    b2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"2");
                        }
                    });

                    b3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"3");
                        }
                    });

                    b4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"4");
                        }
                    });

                    b5.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"5");
                        }
                    });

                    b6.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"6");
                        }
                    });

                    b7.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"7");
                        }
                    });

                    b8.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"8");
                        }
                    });

                    b9.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"9");
                        }
                    });

                    bSum.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"+");
                        }
                    });

                    bSub.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"-");
                        }
                    });

                    bMul.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"*");
                        }
                    });

                    bDiv.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText(textField.getText()+"/");
                        }
                    }); 

                    bEq.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // Devolver el resultado de las operaciones
                            String text = textField.getText();
                            String[] parts;
                            // Hacer que se pueda operar con numeros grandes, negativos y decimales
                            if (text.contains("+")) {
                                parts = text.split("\\+");
                            } else if (text.contains("-")) {
                                parts = text.split("-");
                            } else if (text.contains("*")) {
                                parts = text.split("\\*");
                            } else if (text.contains("/")) {
                                parts = text.split("/");
                            } else {
                                parts = new String[2];
                                parts[0] = "0";
                                parts[1] = "0";
                            }
                            int a = Integer.parseInt(parts[0]);
                            int b = Integer.parseInt(parts[1]);
                            if (text.contains("+")) {
                                textField.setText(String.valueOf(a+b));
                            } else if (text.contains("-")) {
                                textField.setText(String.valueOf(a-b));
                            } else if (text.contains("*")) {
                                textField.setText(String.valueOf(a*b));
                            } else if (text.contains("/")) {
                                textField.setText(String.valueOf(a/b));
                            }
                        }
                    });

                    bC.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            textField.setText("");
                        }
                    });

                    // Visibilidad de la ventana
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }     
        });
    }
}
