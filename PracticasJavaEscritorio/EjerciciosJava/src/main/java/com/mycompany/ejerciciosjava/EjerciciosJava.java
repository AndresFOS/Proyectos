package com.mycompany.ejerciciosjava;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EjerciciosJava {

    public static void main(String[] args) {
    
    String nombre;
    JFrame marco = new JFrame("Ventana vacia");
    marco.setSize(400, 300);
    marco.setVisible(true);
    marco.setLocation(700,200);
    
    JLabel etiqueta = new JLabel("Etiqueta");
    marco.add(etiqueta);
    
    ImageIcon icono = new ImageIcon("C:\\Users\\colos\\Downloads\\icono.png");

    nombre = JOptionPane.showInputDialog(marco, "Digite su nombre: ", "¿Cuál es tu nombre?", 0);

    JOptionPane.showMessageDialog(null, "Su nombre es: "+ nombre, "¿Cuál es tu nombre?", 1, icono);
    
    } 
}
