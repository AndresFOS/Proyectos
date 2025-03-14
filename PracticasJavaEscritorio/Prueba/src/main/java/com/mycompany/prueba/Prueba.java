
package com.mycompany.prueba;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        
    Scanner Leer = new Scanner(System.in);
    int edad;
        
    do{
        System.out.println("Digite su edad: ");
        edad = Leer.nextInt();
    }while(edad<1);
    
    if (edad<18)
        {
            System.out.println("Usted es menor de edad");
        } else if (edad<60)
            {
                System.out.println("Usted es mayor de edad");
            } else
            {
                System.out.println("Usted es adulto mayor");
            }
    
    }
}
