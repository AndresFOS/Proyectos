
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Alumno
    public void crearAlumno(Alumno alu){
        
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
        
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){
        
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListatAlumnos(){
        
        return controlPersis.traerListaAlumnos();
    }
    
    //Carrera
    public void crearCarrera(Carrera carre){
        
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id){
        
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
        
        controlPersis.editarCarrera(carre);
    }
    
    public Carrera traerCarrera(int id){
        
        return controlPersis.traerCarrera(id);
    }
    
    public ArrayList<Carrera> traerListatCarrera(){
        
        return controlPersis.traerListaCarrera();
    }
    
    
}
