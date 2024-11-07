package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioFinal {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ejercicio Final");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        ventana.add(panel);
        panel.setBackground(Color.white);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbd = new GridBagConstraints();

        panel.setBackground(Color.white);

        String[] opciones = {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Ejercicio 9", "Ejercicio 10"};

        JComboBox<String> selector = new JComboBox<>(opciones);

        selector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) selector.getSelectedItem();
                switch (seleccion){

                    case "Ejercicio 1":
                        new Ejercicio1();
                        break;
                    case "Ejercicio 2":
                        new Ejercicio2();
                        break;
                    case "Ejercicio 3":
                        new Ejercicio3();
                        break;
                    case "Ejercicio 4":
                        new Ejercicio4();
                        break;
                    case "Ejercicio 5":
                        new Ejercicio5();
                        break;
                    case "Ejercicio 6":
                        new Ejercicio6();
                        break;
                    case "Ejercicio 7":
                        new Ejercicio7();
                        break;
                    case "Ejercicio 8":
                        new Ejercicio8();
                        break;
                    case "Ejercicio 9":
                        new Ejercicio9();
                        break;
                    case "Ejercicio 10":
                        new Ejercicio10();
                        break;
                }

            }
        });

        panel.add(selector);
        ventana.add(panel);
        ventana.setVisible(true);

    }
}
