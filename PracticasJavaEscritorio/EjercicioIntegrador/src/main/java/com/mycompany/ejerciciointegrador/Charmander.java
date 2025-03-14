
package com.mycompany.ejerciciointegrador;


public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Charmander usa placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Charmander usa arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Charmander usa mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander usa puño fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Charmander usa lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander usa ascuas");
    }
    
}
