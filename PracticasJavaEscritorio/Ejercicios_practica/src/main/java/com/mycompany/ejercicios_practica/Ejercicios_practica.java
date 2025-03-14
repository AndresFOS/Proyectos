
package com.mycompany.ejercicios_practica;

import java.util.Scanner;

public class Ejercicios_practica {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        
        int num, suma_par=0, suma_impar=0;
        
        do{
            System.out.println("Digite un numero entero: ");
            num = Leer.nextInt();
        }while(num<1);
        
        for(int conta = 1; conta<=num; conta++)
        {
            if(conta%2==0)
        {
            System.out.println("Valor par: "+suma_par);
            suma_par += conta;
        } else{
            System.out.println("Valor impar: "+suma_impar);
            suma_impar += conta;
        }
        }
        System.out.println("La suma de los numeros pares es: "+suma_par);
        System.out.println("La suma de los numeros impares es: "+suma_impar);
    }
}
