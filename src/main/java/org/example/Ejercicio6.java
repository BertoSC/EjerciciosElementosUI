package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio6 {
    public static void main(String[] args) {

    JFrame ventana = new JFrame("Ejercicio 6");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(400, 400);

    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());
    GridBagConstraints gbd = new GridBagConstraints();

    panel.setBackground(Color.white);

    String[] opciones = {"Pokemon rojo", "Pokemon azul", "Pokemon oro", "Pokemon plata"};
    JComboBox<String> selector = new JComboBox<>(opciones);

       selector.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String seleccion = (String) selector.getSelectedItem();
            System.out.println("El Pokémon favorito es: " + seleccion);
        }
    });

    panel.add(selector);
    ventana.add(panel);
    ventana.setVisible(true);

    }


}
