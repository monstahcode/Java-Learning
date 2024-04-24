package POO.calculadoraGUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
        calculadora.setBounds(0, 0, 300, 400);
        calculadora.setLocationRelativeTo(null);
        calculadora.setResizable(false);
        calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculadora.setTitle("Calculadora");
    }
}
