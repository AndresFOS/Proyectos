
package com.mycompany.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public static void main(String[] args) {
        
        List<Persona> lista = new LinkedList<Persona>();
        lista.add(new Persona(1, "Andres", 21));
        lista.add(new Persona(2, "Juan", 18));
        lista.add(new Persona(3, "Maria", 20));
        lista.add(new Persona(4, "Karen", 15));
        
        //Recorrer personas por indice
        //el .size indica el tamaño de la lista
        
        System.out.println("--------------------------For---------------------------");
        for(int i=0; i<lista.size(); i++){
            System.out.println("prueba: "+lista.get(i).getNombre());
        }
        
        System.out.println("--------------------------ForEach---------------------------");
        
        //Recorrido foreach
        for(Persona persona:lista){
            System.out.println("prueba: "+persona.getNombre());
        }      
        
    }
}
