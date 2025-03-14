package com.mycompany.ejerciciointegrador;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();
        
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
        
        charmander.atacarAraniazo();
        charmander.atacarAscuas();
        
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidroBomba();
        
    }
}
