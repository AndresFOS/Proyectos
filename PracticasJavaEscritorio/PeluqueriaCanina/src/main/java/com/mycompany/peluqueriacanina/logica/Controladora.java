
package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Controladora {
    //Como persistencia manipula la BD, en Controladora debo crear una instancia u objeto
    //que me traiga a la ControladoraPersistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Este método asigna los datos en sus respectivos campos
    public void guardar(String nombreMascota, String raza, String color, String nombreDuenio, 
            String celDuenio, String observaciones, String alergico, String atencionEspecial) {
        
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asignamos sus valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio);
        
        //Ejecutamos el método guardar desde la persistencia para que suba los datos a la BD
        controlPersis.guardar(duenio, mascota);
        
        /*JOptionPane optionPane = new JOptionPane("Se guardó correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado Exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);*/
        
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMascota, String raza, String color, String observaciones, 
            String alergico, String atencionEspecial, String nombreDuenio, String celDuenio) {
        
        masco.setNombre(nombreMascota);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencionEspecial);
        
        //Modifico mascota
        controlPersis.modificarMascota(masco);
        
        //Añado nuevos datos del dueño
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId());
        dueno.setNombre(nombreDuenio);
        dueno.setCelDuenio(celDuenio);
        
        //Modificar dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id) {
        return controlPersis.traerDuenio(id);
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }

    
}
