
package com.mycompany.ejerciciointegrador;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Bulbasaur usa placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Bulbasaur usa arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Bulbasaur usa moridsco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur usa drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur usa paralizar");
    }
    
}
