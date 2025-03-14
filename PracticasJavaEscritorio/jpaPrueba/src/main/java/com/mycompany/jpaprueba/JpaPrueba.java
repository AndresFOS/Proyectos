
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Carrera carre = new Carrera(100, "Ingenieria de software");
        control.crearCarrera(carre);
        
        Alumno alu = new Alumno(60, "Juana", "Perez", new Date(), carre);
        control.crearAlumno(alu);
        
        
        System.out.println("Datos alumnos");
        Alumno al = control.traerAlumno(60);
        System.out.println("Nombre: " +al.getNombre()+ " " +al.getApellido());
        System.out.println("Cursa: " +al.getCarre().getNombre());
        
    }
}
