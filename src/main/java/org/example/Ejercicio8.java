package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio8 {
    public static void main(String[] args) {

        JFrame ventana = new JFrame("Ejercicio 7");
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
        JRadioButton pago2 = new JRadioButton("Paypal");
        pago2.setBackground(Color.white);
        JRadioButton pago3 = new JRadioButton("Tarjeta de crédito");
        pago3.setBackground(Color.white);

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
             @Override
             public void actionPerformed(ActionEvent e) {
                 Button opciónSel = (Button) opciones.getSelection();
                 String texto = opciónSel.text

                 if ()

             }
           }
        );


        ventana.add(panel);
        ventana.setVisible(true);




    }
}