

package com.mycompany.bucle;

import java.util.Scanner;


public class Bucle {

    public static void main(String[] args) {
        //Pedir un número, comprobar si es primo y preguntar si quiere introducir más
        Scanner Leer = new Scanner(System.in);
        
        int num, L, conta;
        boolean llave = true;
        while(llave != false){
            System.out.println("Digite un número");
            num = Leer.nextInt();
            
            for(L=1 , conta=0 ; L<=num ; L++){
                if(num%L == 0){
                    conta++;
                }
            }
            if(conta==2){
                System.out.println(num + " es primo");
            }else{
                System.out.println(num + " no es primo");
            }
                
            System.out.println("Digite (true) para añadir más números o (false) para salir");
            llave = Leer.nextBoolean();

        }
    }
}
