
package com.mycompany.relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");
        
       List<Propietario> listaPropietarios = new ArrayList<Propietario>();
       
       Propietario prop1 = new Propietario();
       Propietario prop2 = new Propietario();
       
       prop1.setId(12L);
       prop1.setNombre("Andres");
       prop1.setApellido("Olaya");
       
       prop2.setId(13L);
       prop2.setNombre("Juan");
       prop2.setApellido("Martinez");
       
       listaPropietarios.add(prop1);
       listaPropietarios.add(prop2);
       
       aut.setListaPropietarios(listaPropietarios);
       
        System.out.println("El auto: " +aut.getMarca()+ " modelo: " +aut.getModelo()+ " Tiene como propietarios a:  " +aut.getListaPropietarios().toString());
        
    }
}
