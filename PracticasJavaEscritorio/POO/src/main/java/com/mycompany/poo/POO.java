package com.mycompany.poo;


public class POO {

    public static void main(String[] args) {
        
        //Llamo la clase, creo variable de objeto y asigno valores
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(100, "Andres", "Olaya", 21);
        
        //Con el get obtuve los datos del estudiante
        System.out.println("El id del alumno 2 es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getNombre());
        System.out.println("El apellido es: " + alumno2.getApellido());
        System.out.println("La edad es: " + alumno2.getEdad());
        
        alumno1.setId(100);
        alumno1.setNombre("Juan");
        alumno1.setApellido("Moreno");
        alumno1.setEdad(25);
        
        //Con el set inserté datos en el alumno1
        System.out.println("------------------");
        System.out.println("El id del alumno 1 es: " + alumno1.getId());
        System.out.println("El nombre es: " + alumno1.getNombre());
        System.out.println("El apellido es: " + alumno1.getApellido());
        System.out.println("La edad es: " + alumno1.getEdad());
        
        //Con el set actualicé los datos del alumno2
        alumno2.setId(101);
        alumno2.setNombre("Felipe");
        alumno2.setApellido("Suache");
        alumno2.setEdad(22);
        
        
        System.out.println("------------------");
        System.out.println("Los datos seteados del alumno 2 son:");
        System.out.println("El id es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getNombre());
        System.out.println("El apellido es: " + alumno2.getApellido());
        System.out.println("La edad es: " + alumno2.getEdad());
        
    }
}
