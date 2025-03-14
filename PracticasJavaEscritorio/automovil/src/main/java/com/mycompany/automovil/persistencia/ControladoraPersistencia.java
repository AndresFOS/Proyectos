
package com.mycompany.automovil.persistencia;

import com.mycompany.automovil.logica.Automovil;
import com.mycompany.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    //Por obligación el controlador de entidades JPA requiere una dependencia mysql instalada de forma manual
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        //El create() es el método creado por la persistencia JPA y me permite subir el objeto a la BD
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        
        return autoJpa.findAutomovilEntities();
        
    }

    public void eliminarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
        
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) { 
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
}
