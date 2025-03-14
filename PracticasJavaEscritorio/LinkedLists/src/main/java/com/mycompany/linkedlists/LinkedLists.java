
package com.mycompany.linkedlists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        //Los ArrayList se manejan por posiciones como los arreglos
        List<Persona> listaArray = new ArrayList<Persona>();
        //Agregar personas a la lista
        listaArray.add(new Persona(1, "Andres", 21));
        listaArray.add(new Persona(2, "Juan", 18));
        listaArray.add(new Persona(3, "Maria", 20));
        listaArray.add(new Persona(4, "Karen", 15));
        //Las listas enlazadas se manejan por cabeza y cola
        
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        //Agregar personas a la lista
        listaLinked.add(new Persona(1, "Andres", 21));
        listaLinked.add(new Persona(2, "Juan", 18));
        listaLinked.add(new Persona(3, "Maria", 20));
        listaLinked.add(new Persona(4, "Karen", 15));
        
        //Agregar personas al principio
        //Se pone un 0 que indica el principio
        //listaLinked.add(0, new Persona(5, "Nicolas", 22));
        
        //Remove en ArrayList
        listaArray.remove(1);
        
        //Remove en LinkedList
        String nombreBorrar = "Andres";
        for(Persona persona2:listaLinked){
            if(persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break;
            }
        }
        
        System.out.println("Lista luego de eliminar");
        System.out.println("ArrayList");
        for(Persona persona:listaArray){
            System.out.println("Persona: "+persona.getNombre());
        }
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("LinkedList");
        for(Persona persona:listaLinked){
            System.out.println("Persona: "+persona.getNombre());
        }
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tamaño de las listas");
        System.out.println("ArrayList: " +listaArray.size());
        System.out.println("LinkedList: "+listaLinked.size());
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Primer objeto y último objeto solo en linkedList");
        System.out.println("Primer objeto: "+listaLinked.getFirst().toString());
        System.out.println("Último objeto: "+listaLinked.getLast().toString());
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Borrar toda la lista");
        listaArray.clear();
        listaLinked.clear();
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("Comprobar si la lista está vacia");
        System.out.println("Lista Array: " +listaArray.isEmpty());
        System.out.println("Lista Linked: " +listaLinked.isEmpty());
    }
}
