
package com.mycompany.ejerciciosjava3;

import javax.swing.JOptionPane;


public class EjerciciosJava3 {

    public static void main(String[] args) {
       String edad, cedula; 
       
       edad=JOptionPane.showInputDialog(null, "Tu edad ", 10);
       cedula=JOptionPane.showInputDialog(null, "Tu cedula ", "Cedula", 0);
       
       JOptionPane.showMessageDialog(null, "Tu edad es "+edad+" tu cedula es "+cedula);
       
    }
}
