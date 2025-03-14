package com.mycompany.clasesabstractas;

//implements es la forma de conectar las clases con interfaces
public class Circulo implements Figura, Rotable, Dibujable{

    private double radio;
    
    public Circulo(){
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Hola, estoy rotando");
    }

    @Override
    public void dibujar() {
        System.out.println("Hola,, estoy dibujando");
    }
    
}
