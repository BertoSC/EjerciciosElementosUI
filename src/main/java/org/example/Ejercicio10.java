package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio10 {

    public Ejercicio10(){
        ejecutarEj10();
    }

    private void ejecutarEj10() {
        JFrame ventana = new JFrame("Ejercicio 10");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);

        JPanel panel = new JPanel();
        ventana.add(panel);
        panel.setBackground(Color.white);

        JMenuBar menuPrincipal = new JMenuBar();
        JMenu archivo = new JMenu("ARCHIVO");
        JMenu edicion = new JMenu("EDICIÓN");

        JMenuItem abrir = new JMenuItem("Abrir un archivo");
        JMenuItem guardar = new JMenuItem("Guardar un archivo");

        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem pegar = new JMenuItem("Pegar");
        JMenuItem copiar = new JMenuItem("Copiar");

        archivo.add(abrir);
        archivo.add(guardar);

        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);

        menuPrincipal.add(archivo);
        menuPrincipal.add(edicion);
        ventana.setJMenuBar(menuPrincipal);

        abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha seleccionado la opción de abrir archivo");
            }
        });

        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha seleccionado la opción de guardar archivo");
            }
        });

        cortar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha seleccionado la opción de cortar");
            }
        });

        copiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha seleccionado la opción de copiar");
            }
        });

        pegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se ha seleccionado la opción de pegar");
            }
        });

        ventana.setVisible(true);
    }


}
