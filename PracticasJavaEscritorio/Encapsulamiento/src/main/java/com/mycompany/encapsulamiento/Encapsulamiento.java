package com.mycompany.encapsulamiento;

public class Encapsulamiento {

    public static void main(String[] args) {
        
        
        Alumno alu = new Alumno();
        Alumno alu2 = new Alumno(10, "Andres", "Olaya");
        
        System.out.println("ID: "+alu2.getId());
        System.out.println("Nombre: "+alu2.getNombre());
        System.out.println("Apellido: "+alu2.getApellido());
    }
}
