package com.mycompany.herencia;

public class Herencia {

    public static void main(String[] args) {
        
        //Ejemplos de herencia
        Empleado emple = new Empleado();
        //El empleado puede traer los datos de Persona porque al usar extends y relacionar la clase Empleado con Persona
        //El Empleado se vuelve hijo de la clase Persona, lo que permite traer los datos heredados
        emple.getNum_legajo();
        emple.getCargo();
        emple.getSueldo();
        //Este Nombre es heredado de persona
        emple.getNombre();
        
        Consultor cons = new Consultor();
        cons.getNum_consultor();
        cons.getNombre_consultor();
        
        //Ejemplos de polimorfismo: poli = muchas, morfismo = formas
        Persona vector[] = new Persona[5];
        //Todos estos vectores son Persona(Padre de las demás clases) o sus hijos Empleado, Consultor y Jefe
        //Si intento llenarlo con Strings, int, double o cualquier otra variable saldrá error
        //Este objeto vector[] solo acepta las clases Persona y sus hijos
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();
        
        Persona perso = new Persona();
        Jefe jefe = new Jefe();
        
        //jefe puede ser una persona porque es hija de Persona pero perso no puede ser un jefe porque es su padre
        perso = jefe;
    }
}
