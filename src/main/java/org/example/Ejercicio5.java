package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio5 {

    public Ejercicio5(){
        ejecutarEj5();
    }

    private void ejecutarEj5() {
        JFrame ventana = new JFrame("Ejercicio 5");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();

        panel.setBackground(Color.white);


        JButton botonPress = new JButton("PRESS BUTTON");
        botonPress.setBackground(Color.blue);
        botonPress.setForeground(Color.white);
        botonPress.setFocusPainted(false);

        botonPress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcion= JOptionPane.showInputDialog(null, "Introduce tu edad");
                if (opcion!=null && !opcion.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Tienes "+opcion+" años");
                }
            }
        });

        gbd.gridx = 0;
        gbd.gridy = 4;
        gbd.insets = new Insets(6, 6, 6, 6);
        panel.add(botonPress, gbd);

        ventana.add(panel);
        ventana.setVisible(true);

    }
}
