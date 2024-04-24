// Crear la clase controlador
package POO.tresenrayaGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Controlador implements ActionListener {
    private JButton[][] botones;
    private int turno;

    public Controlador(JButton[][] botones) {
        this.botones = botones;
        turno = 1;
    }

    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        boton.setText("X");
        boton.setEnabled(false);
    }
    
    public void pasarTurno(ActionEvent e) {
        Random random = new Random();
        int fila = random.nextInt(3);
        int columna = random.nextInt(3);
        
        // Buscar una casilla vacía, si no hay, terminar la partida
        boolean hayHueco = false;
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (botones[i][j].getText().equals("")) {
                    hayHueco = true;
                    botones[fila][columna] = botones[i][j];
                    break;
                }
            }
        }

        // Colocamos la "O" en la posición aleatoria solo si hay hueco
        if (!hayHueco) {
            // Si no hay hueco, escribimos un mensaje en la interfaz grafica del tres en raya
            JOptionPane.showMessageDialog(null, "La partida ha terminado. Reinicia el juego.");
        } else {
            botones[fila][columna].setText("O");
            botones[fila][columna].setEnabled(false);
        }
    }

    // Método para reiniciar el juego
    public void reiniciar(ActionEvent e) {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j].setText("");
                botones[i][j].setEnabled(true);
            }
        }
    }
}
