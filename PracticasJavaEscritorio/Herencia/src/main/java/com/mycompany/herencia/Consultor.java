package com.mycompany.herencia;

public class Consultor extends Persona{
    
    int num_consultor;
    String nombre_consultor;

    public Consultor() {
    }

    public Consultor(int num_consultor, String nombre_consultor, int id, String dni, String nombre, String apellido, 
            String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_consultor = num_consultor;
        this.nombre_consultor = nombre_consultor;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultor() {
        return nombre_consultor;
    }

    public void setNombre_consultor(String nombre_consultor) {
        this.nombre_consultor = nombre_consultor;
    }
    
    
    
}
