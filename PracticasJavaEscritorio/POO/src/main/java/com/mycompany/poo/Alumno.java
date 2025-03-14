
package com.mycompany.poo;

//Las clases tienen el nombre con mayuscula inicial y se escriben en singular
//Los objetos se componen por una clase con sus atributos, un constructor y sus métodos
public class Alumno {
    //Atributos de la clase alumno
    int id;
    String nombre;
    String apellido;
    int edad;
    
    //El constructor tiene el mismo nombre de la clase y debe estar vacio por eso es public Alumno y no public void Alumno
    public Alumno(int id, String nombre, String apellido, int edad) {
        //El this. sirve para especificar que la variable que conecta con el punto es el de la clase
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Constructor vacio para pruebas con set
    public Alumno() {
    }
    
    //Con get obtengo los datos para mostrarlos
    public int getId() {
        return id;
    }
    
    //Con set coloco datos en objetos vacios de un constructor o actualizo datos
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Acciones o métodos que puede realizar el alumno
    public void mostrarDatos() {
        System.out.println("El id del estudiante es: "+id);
        System.out.println("El nombre del estudiante es: "+nombre);
        System.out.println("El apellido del estudiante es: "+apellido);
        System.out.println("La edad del estudiante es: "+edad);
    }
}
