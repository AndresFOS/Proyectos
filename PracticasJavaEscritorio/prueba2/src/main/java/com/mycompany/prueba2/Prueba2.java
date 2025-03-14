
package com.mycompany.prueba2;

import java.util.Scanner;

public class Prueba2 {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        
        String nombre;
        int edad;
        float sueldo;
        
        do{
            System.out.println("Digite su nombre: ");
            nombre = Leer.next();
            System.out.println("Digite su edad: ");
            edad = Leer.nextInt();
            System.out.println("Digite su sueldo");
            sueldo = Leer.nextFloat();
        }while(edad<1);
        
    }
}
