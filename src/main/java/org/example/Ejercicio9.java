package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio9 {

    public Ejercicio9(){
        ejecutarEJ9();
    }

    private void ejecutarEJ9() {
        JFrame ventana = new JFrame("Ejercicio 9");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel etiqueta = new JLabel("Seleccione sus toppings:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(etiqueta, gbc);


        JCheckBox quesoExtra = new JCheckBox("Queso Extra");
        JCheckBox pepperoni = new JCheckBox("Pepperoni");
        JCheckBox aceitunas = new JCheckBox("Aceitunas");

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(quesoExtra, gbc);

        gbc.gridy = 2;
        panel.add(pepperoni, gbc);

        gbc.gridy = 3;
        panel.add(aceitunas, gbc);


        JButton ordenarButton = new JButton("Ordenar");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(ordenarButton, gbc);


        ordenarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder seleccion = new StringBuilder();
                seleccion.append("Toppings seleccionados: ").append(System.lineSeparator());

                if (quesoExtra.isSelected()) {
                    seleccion.append("Queso Extra ").append(System.lineSeparator());
                }
                if (pepperoni.isSelected()) {
                    seleccion.append("Pepperoni ").append(System.lineSeparator());
                }
                if (aceitunas.isSelected()) {
                    seleccion.append("Aceitunas ").append(System.lineSeparator());

                }
                if (seleccion.toString().equals("Toppings seleccionados: ")) {
                    seleccion.append("No se ha seleccionado ningún item");
                }
                System.out.println(seleccion.toString());

            }
        });

        ventana.add(panel);
        ventana.setVisible(true);
    }

}
