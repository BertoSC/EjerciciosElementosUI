package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejercicio 3");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();

        panel.setBackground(Color.white);

        JTextField ventanaNom = new JTextField(15);
        gbd.gridx = 0;
        gbd.gridy = 0;
        gbd.insets = new Insets(6, 6, 6, 6);
        gbd.fill = GridBagConstraints.HORIZONTAL;
        panel.add(ventanaNom, gbd);

        JButton botonPress = new JButton("PRESS BUTTON");
        botonPress.setBackground(Color.blue);
        botonPress.setForeground(Color.white);
        botonPress.setFocusPainted(false);

        botonPress.addActionListener(new ActionListener() {
            @Override
                    public void actionPerformed(ActionEvent e) {
                        String nombre = ventanaNom.getText();
                        System.out.println("Tu nombre es: "+nombre);
                    }
                });

        gbd.gridx = 0;
        gbd.gridy = 1;
        gbd.insets = new Insets(6, 6, 6,6);
        panel.add (botonPress, gbd);

        ventana.add(panel);
        ventana.setVisible(true);
    }
}
