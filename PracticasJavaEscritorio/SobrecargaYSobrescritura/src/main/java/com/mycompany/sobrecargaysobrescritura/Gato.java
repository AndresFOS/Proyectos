package com.mycompany.sobrecargaysobrescritura;

public class Gato extends Animal{

    @Override
    public void hacerSonido() {
        System.out.println("Soy un gato y maullo: Miau Miau");
    }
    
}
