package com.mycompany.sobrecargaysobrescritura;

public class Perro extends Animal{
    
    private String nombrePerro;
    private double peso;
    private double raza;
    private double sexo;
    
    //Constructores
    
    //Getters y setters
    
    //Otros métodos
    //Al ser un método de una clase abstracta debo implementarlo con un "@Override" o sobrescritura
    @Override
    public void hacerSonido(){
        System.out.println("Soy un perro y ladro: Guau Guau");
    }
}
