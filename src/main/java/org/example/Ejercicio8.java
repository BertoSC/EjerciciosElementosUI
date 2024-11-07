package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio8 {

    public Ejercicio8() {
        ejecutarEj8();

    }

    private void ejecutarEj8() {
        JFrame ventana = new JFrame("Ejercicio 8");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();

        panel.setBackground(Color.white);

        JLabel nombre = new JLabel("Selecciona tu tipo de pago:", SwingConstants.CENTER);
        gbd.gridx = 0;
        gbd.gridy = 0;
        gbd.insets = new Insets(6, 6, 6, 6);
        panel.add(nombre, gbd);

        JRadioButton pago1 = new JRadioButton("Transferencia bancaria");
        pago1.setBackground(Color.white);
        pago1.setActionCommand("Transferencia bancaria");
        JRadioButton pago2 = new JRadioButton("Paypal");
        pago2.setBackground(Color.white);
        pago2.setActionCommand("Paypal");
        JRadioButton pago3 = new JRadioButton("Tarjeta de crédito");
        pago3.setBackground(Color.white);
        pago3.setActionCommand("Tarjeta de crédito");

        ButtonGroup opciones = new ButtonGroup();

        opciones.add(pago1);
        opciones.add(pago2);
        opciones.add(pago3);


        gbd.fill = GridBagConstraints.HORIZONTAL;

        gbd.gridx = 0;
        gbd.gridy = 1;
        gbd.insets = new Insets(6, 6, 6, 6);
        gbd.anchor = GridBagConstraints.CENTER;

        panel.add(pago1, gbd);

        gbd.gridx = 0;
        gbd.gridy = 2;
        gbd.insets = new Insets(6, 6, 6, 6);
        gbd.anchor = GridBagConstraints.CENTER;

        panel.add(pago2, gbd);

        gbd.gridx = 0;
        gbd.gridy = 3;
        gbd.insets = new Insets(6, 6, 6, 6);
        gbd.anchor = GridBagConstraints.CENTER;

        panel.add(pago3, gbd);

        JButton botonPress = new JButton("PRESS BUTTON");
        botonPress.setBackground(Color.gray);
        botonPress.setForeground(Color.white);
        botonPress.setFocusPainted(false);

        gbd.gridx = 0;
        gbd.gridy = 4;
        gbd.insets = new Insets(6, 6, 6, 6);
        panel.add(botonPress,gbd);

        botonPress.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ButtonModel seleccion = opciones.getSelection();

                // Comprobar cuál de los botones está seleccionado y obtener su texto
                if (seleccion != null) {
                    String s = seleccion.getActionCommand();
                    System.out.println("Has seleccionado pago mediante "+s);
                } else {
                    System.out.println("Ninguna opción seleccionada");
                }
            }
        });

        ventana.add(panel);
        ventana.setVisible(true);
    }
}

