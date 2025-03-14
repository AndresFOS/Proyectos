

package com.mycompany.ejemplopoo;

public class EjemploPOO {

    public static void main(String[] args) {
        System.out.println("Ejemplo POO");
        
        EspadaMadera espadaM = new EspadaMadera();
        EspadaPiedra espadaP = new EspadaPiedra();
        
        espadaM.atacar();
        espadaM.cubrir();
        espadaP.atacar();
        espadaP.cubrir();
        
        
    }
}
