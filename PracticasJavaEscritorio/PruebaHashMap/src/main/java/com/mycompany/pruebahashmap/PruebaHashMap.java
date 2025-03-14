
package com.mycompany.pruebahashmap;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

    public static void main(String[] args) {
        //Map es el que contiene HashMap por eso al reservar espacio en memoria se pone HashMap
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(1001, "Andres");
        mapaEmpleados.put(1002, "Juan");
        mapaEmpleados.put(1003, "Maria");
        mapaEmpleados.put(1004, "Lucy");
        mapaEmpleados.put(1005, "Prueba");
        mapaEmpleados.put(1006, "Borrable");
        
        //Con containsKey pregunta por el id del empleado
        boolean contenido = mapaEmpleados.containsKey(1002);
        //Con containsValue pregunto por el contenido en este caso el String
        boolean contenido2 = mapaEmpleados.containsValue("Juan");
        
        if(contenido){
            System.out.println("¿Existe el id de este empleado? " +contenido);
        } else {
            System.out.println("No existe empleado " +contenido);
        }
        
        if(contenido2){
            System.out.println("¿Existe el nombre de este empleado? " +contenido2);
        } else {
            System.out.println("No existe este empleado " +contenido2);
        }
        
        //Mostrar valores
        //Muestra todos los valores del objeto
        System.out.println("Los nombre de los empleados son: " +mapaEmpleados.values());
        //Muestra todos los ID del objeto
        System.out.println("Los ID de los empleados son: " +mapaEmpleados.keySet());
        
        //Obtener el nombre de un empleado buscando por su ID
        //La variable está como un String porque voy a traer otra cadena de caracteres
        String nombre = mapaEmpleados.get(1001);
        System.out.println("El nombre del empleado es: " +nombre);
        
        //Eliminar un dato
        System.out.println("El dato removido es: " +mapaEmpleados.remove(1005));
        System.out.println("Los empleados ahora son: " +mapaEmpleados.values());
        
    }
}
