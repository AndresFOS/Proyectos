
package com.mycompany.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        //List es una variable reservada, < > lo que está dentro de los simbolos menor y mayor es la clase Persona
        //ArrayList también es una variable reservada
        List<Persona> lista = new ArrayList<Persona>();
        //ese .add en lista es una variable que sirve para añadir datos en la lista
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
