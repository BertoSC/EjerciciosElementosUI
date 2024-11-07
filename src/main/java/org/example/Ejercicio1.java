package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 {

    public Ejercicio1(){
        ejecutarEj1();
    }

    public void ejecutarEj1(){
        JFrame ventana = new JFrame("Ejercicio 1");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();

        gbd.gridx = 1;
        gbd.gridy = 1;

        gbd.insets = new Insets(6, 6, 6,6);

        panel.setBackground(Color.black);

        JButton boton = new JButton("¿En qué pienso?");

        boton.setBackground(Color.red);
        boton.setForeground(Color.white);
        boton.setFocusPainted(false);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("En que echo de menos el Blasphemous 2 :(");
            }
        });

        panel.add (boton, gbd);
        ventana.add(panel);
        ventana.setVisible(true);
    }

}