
package com.mycompany.ejerciciosjava2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EjerciciosJava2 {

    public static void main(String[] args) {
        
       String cadena ;
       
       ImageIcon icono =new ImageIcon("C:\\\\Users\\\\colos\\\\Downloads\\\\icono.png");
       cadena = JOptionPane.showInputDialog("DIGITE NACIONALIDAD"); 
       JOptionPane.showMessageDialog(null, "TU NACIONALIDAD ES "+ cadena , "NACIONALIDAD", 1);
       JOptionPane.showMessageDialog(null, "TU NACIONALIDAD ES " + cadena , "NACIONALIDAD ", JOptionPane.INFORMATION_MESSAGE ,icono);
    }
}
