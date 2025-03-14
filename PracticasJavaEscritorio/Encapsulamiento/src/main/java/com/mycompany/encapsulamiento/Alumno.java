package com.mycompany.encapsulamiento;

//Modificadores de acceso
//Public = permite que todas las clases puedan acceder a la información
//Private = restringe el acceso a la clase en la que los atributos fueron creados
//Protected = restringe el acceso de los atributos a la clase y sus hijos (herencia)
public class Alumno {
    
    private int id;
    private String nombre;
    private String apellido;

    //Constructores
    public Alumno() {
    }
    
    public Alumno(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Gettins y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
