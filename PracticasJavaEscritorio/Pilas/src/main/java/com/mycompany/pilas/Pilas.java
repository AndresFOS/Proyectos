
package com.mycompany.pilas;

import java.util.Stack;


public class Pilas {

    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Pila vacia: " +pila);
        System.out.println("¿Está vacía la pila? " +pila.isEmpty());
        
        //Agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        //Recorrido
        for(Integer pilita : pila){
            System.out.println(pilita);
        }
        
        //Mostrar
        System.out.println("Pila vacia: " +pila);
        System.out.println("¿La pila está vacía? " +pila.isEmpty());
        
        //Elimina el último registro que ingresa
        pila.pop();
        System.out.println("¿Está la pila 3? " +pila.search(3));
        System.out.println("último dato agregado " +pila.peek());
        
    }
}
