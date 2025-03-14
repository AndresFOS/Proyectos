
package com.mycompany.ejerciciointegrador;

public class Pikachu extends Pokemon implements IElectrico{
    
    public Pikachu(){
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Pikachu usa placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Pikachu usa arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Pikachu usa moridsco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu usa impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu usa puño trueno");
    }
    
}
