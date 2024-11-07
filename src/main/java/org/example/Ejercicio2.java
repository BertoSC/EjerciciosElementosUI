package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 {

    public Ejercicio2(){
        ejecutarEj2();
    }

    private void ejecutarEj2() {
        JFrame ventana = new JFrame("Ejercicio 2");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();

        panel.setBackground(Color.white);

        JButton botonAceptar = new JButton("ACEPTAR");
        botonAceptar.setBackground(Color.blue);
        botonAceptar.setForeground(Color.white);
        botonAceptar.setFocusPainted(false);

        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación aceptada");
            }
        });

        gbd.gridx = 0;
        gbd.gridy = 1;
        gbd.insets = new Insets(6, 6, 6,6);
        panel.add (botonAceptar, gbd);

        JButton botonDenegar = new JButton("CANCELAR");
        botonDenegar.setBackground(Color.red);
        botonDenegar.setForeground(Color.white);
        botonDenegar.setFocusPainted(false);

        botonDenegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación cancelada");
            }
        });

        gbd.gridx = 1;
        gbd.gridy = 1;
        gbd.insets = new Insets(6, 6, 6,6);
        panel.add (botonDenegar, gbd);


        ventana.add(panel);
        ventana.setVisible(true);

    }

}

