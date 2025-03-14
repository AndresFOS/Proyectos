
package com.mycompany.numero_positivo_negativo_par_o_impar;

import java.util.Scanner;


public class Numero_positivo_negativo_par_o_impar {

    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
        int num;
        
        System.out.println("Digite un número: ");
        num = Leer.nextInt();
        
        if(num>0){
            System.out.println("El número: "+num+" es positivo");
        }else{
            System.out.println("El número: "+num+" es negativo");
        }
        
        if(num%2==0){
            System.out.println("El número: "+num+" es par");
        }else{
            System.out.println("El número: "+num+" es impar");
        }
    }
}
