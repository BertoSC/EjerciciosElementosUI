package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio4 {

    public Ejercicio4(){
        ejecutarEj4();
    }

    public void ejecutarEj4(){
        JFrame ventana = new JFrame("Ejercicio 4");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();

        panel.setBackground(Color.white);

        JLabel nombre = new JLabel("Introduce tu nombre", SwingConstants.CENTER);
        gbd.gridx = 0;
        gbd.gridy = 0;
        gbd.insets = new Insets(6, 6, 6, 6);
        panel.add(nombre, gbd);

        JTextField ventanaNom = new JTextField(15);
        gbd.gridx = 0;
        gbd.gridy = 1;
        gbd.insets = new Insets(6, 6, 6, 6);
        gbd.fill = GridBagConstraints.HORIZONTAL;
        panel.add(ventanaNom, gbd);

        JLabel apellidos = new JLabel("Introduce tus apellidos", SwingConstants.CENTER);
        gbd.gridx = 0;
        gbd.gridy = 2;
        gbd.insets = new Insets(6, 6, 6, 6);
        panel.add(apellidos, gbd);

        JTextField ventanaApe = new JTextField(15);
        gbd.gridx = 0;
        gbd.gridy = 3;
        gbd.insets = new Insets(6, 6, 6, 6);
        gbd.fill = GridBagConstraints.HORIZONTAL;
        panel.add(ventanaApe, gbd);


        JButton botonPress = new JButton("PRESS BUTTON");
        botonPress.setBackground(Color.blue);
        botonPress.setForeground(Color.white);
        botonPress.setFocusPainted(false);

        botonPress.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = ventanaNom.getText();
                String a = ventanaApe.getText();
                System.out.println("Tu nombre completo es: " + n +" "+a);
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

