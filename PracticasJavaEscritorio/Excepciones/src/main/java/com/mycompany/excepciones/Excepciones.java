
package com.mycompany.excepciones;

public class Excepciones {

    public static void main(String[] args) {
        
        //El try catch me permite agarrar especificar que error deseo mostrar al usuario, en este caso
        //No se puede dividir por cero y me saldria un error de Java, esto no lo entendería el usuario y frenaria la ejecución del programa
        //Así que especifico el error y es entendible para los usuarios
        try {
            int resultado = 3/0; 
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
        }
        
        //Error con arreglos
        //Los arreglos se llenan con llaves {}
        int arregloEdades[] = {1,2,3,4};
        
        try {
            System.out.println("La edad en esa posición es: " +arregloEdades[4]);
        } catch (Exception e){
            System.out.println("No existe esa posición ");
        }
        
    }
}
