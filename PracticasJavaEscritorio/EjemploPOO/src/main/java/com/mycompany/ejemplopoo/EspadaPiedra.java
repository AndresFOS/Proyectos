
package com.mycompany.ejemplopoo;

public class EspadaPiedra extends Espada{

    @Override
    public void atacar() {
        System.out.println("Ataque de espada de piedra");
    }
    
    @Override
    public void cubrir(){
        System.out.println("Cubrirse con espada de piedra");
    }
    
}
