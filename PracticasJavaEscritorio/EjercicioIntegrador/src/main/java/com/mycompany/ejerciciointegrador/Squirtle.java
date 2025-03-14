
package com.mycompany.ejerciciointegrador;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Squirtle usa placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Squirtle usa arañazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Squirtle usa mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Squirtle usa hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle usa burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle usa pistola agua");
    }
    
}
