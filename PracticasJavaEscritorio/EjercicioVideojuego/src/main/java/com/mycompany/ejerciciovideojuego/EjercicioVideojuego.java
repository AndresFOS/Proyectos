
package com.mycompany.ejerciciovideojuego;

import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {

    public static void main(String[] args) {
        
        List<Videojuego> listaVideojuego = new ArrayList<Videojuego>();
        
        Videojuego vjuego1 = new Videojuego(101, "Mario Kart", "Nintendo 64", 3000, "Carrera");
        Videojuego vjuego2 = new Videojuego(102, "Banjo Kazooie", "Nintendo 64", 400, "Plataforma");
        Videojuego vjuego3 = new Videojuego(103, "Mario Party 3", "Nintendo 64", 5000, "Plataforma");
        Videojuego vjuego4 = new Videojuego(104, "Devil May Cry", "Xbox 360", 250, "Hack and Slash");
        Videojuego vjuego5 = new Videojuego(105, "Uncharted 2", "PlayStation 3", 500, "Acción");
        
        listaVideojuego.add(vjuego1);
        listaVideojuego.add(vjuego2);
        listaVideojuego.add(vjuego3);
        listaVideojuego.add(vjuego4);
        listaVideojuego.add(vjuego5);
        
        //Mostrar titulo, consola y cantidadJugadores
        for(Videojuego vjuego : listaVideojuego){
            System.out.println("Titulo: " +vjuego.getTitulo()+ " Consola:  " +vjuego.getConsola()+ " Cantidad de jugadores:  " +vjuego.getCantidadJugadores());
        }
        
        //Cambiar titulo y cantidad de jugadores
        vjuego2.setTitulo("Banjo Kazooie II");
        vjuego2.setCantidadJugadores(1);
        
        vjuego1.setTitulo("Mario Kart 2");
        vjuego1.setCantidadJugadores(4);
        
        //Mostrar videojuegos de la consola Nintendo 64
        for(Videojuego vjuego : listaVideojuego){
            if(vjuego.getConsola().equals("Nintendo 64")){
                System.out.println("Videojuegos: " +vjuego.toString());
            } else {
                System.out.println("Los videojuegos: " +vjuego.toString()+ " No pertecene a la consola Nintendo 64");
            }
        }
        
    }
}
