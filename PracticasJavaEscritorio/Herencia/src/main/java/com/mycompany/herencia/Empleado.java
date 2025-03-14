package com.mycompany.herencia;

//El extends es la variable reservada para indicar que va a ser heredado por la clase
public class Empleado extends Persona{
    
    int num_legajo;
    String cargo;
    Double sueldo;
    
    public Empleado() {
    }

    public Empleado(int num_legajo, String cargo, Double sueldo, int id, String dni, 
            String nombre, String apellido, String domicilio, String telefono) {
        //Con la variable reservada "super" indica los atributos heredados de la clase persona
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    //Los getters y setters creados en Empleado son solo de los atributos propios porque los
    //de Persona ya están creados en su propia clase y al ser heredados por Empleado
    //me permite llamarlos en cualquier momento
    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
