
package com.mycompany.automovil.logica;

import com.mycompany.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, 
            String placa, int cantidadPuertas) {
        
        //Crear un automovil antes de enviarlo a la persistencia
        Automovil auto = new Automovil();
        //Lleno mi nuevo objeto auto con los datos traidos de la interfaz grafica
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuertas);
        
        //Envio el objeto auto a la función agregarAutomovil porque en dicha función se envia a la BD
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
        
    }

    public void eliminarAuto(int idAuto) {
        
        controlPersis.eliminarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, 
            String placa, int cantidadPuertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuertas);
        
        //Pedir a la persistencia que modifique
        controlPersis.modificarAuto(auto);
    }

    
    
    
}
