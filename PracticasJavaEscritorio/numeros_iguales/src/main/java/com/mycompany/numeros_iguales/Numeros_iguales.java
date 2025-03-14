

package com.mycompany.numeros_iguales;

import java.util.Scanner;


public class Numeros_iguales {
//mostrar numero mayor, menor o iguales
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Digite el primer número: ");
        num1 = Leer.nextInt();
        
        System.out.println("Digite el segundo número: ");
        num2 = Leer.nextInt();
        
        if(num1==num2){
            System.out.println("Los números son iguales");
        }else if(num1>num2){
            System.out.println("El número "+num1+" es mayor");
        }else{
            System.out.println("El número "+num2+" es mayor");
        }
    }
}
