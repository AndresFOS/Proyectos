
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
 
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Usuario validarUsuario(String usuario, String contrasenia) {
        
        Usuario user = null;
        //String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for(Usuario usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuario)){
                if(usu.getContrasenia().equals(contrasenia)){
                    
                    //mensaje = "Usuario y contraseña correctos. Bienvenido/a";
                    user = usu;
                    return user;
                } else {
                    //mensaje = "Contraseña incorrecta";
                    user = null;
                    return user;
                }
            } else {
                //mensaje = "Usuario no encontrado";
                user = null;
                //return user;
            }
        }
        return user;
        
    }

    public List<Usuario> traerUsuarios() {
        
        return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String contrasenia, String rol) {
        
        Usuario user = new Usuario();
        user.setNombreUsuario(usuario);
        user.setContrasenia(contrasenia);
        
        Rol rolEncontrado = this.traerRol(rol);
        
        if(rolEncontrado != null){
            user.setUnRol(rolEncontrado);
        }
        
        int id = this.buscarUltimaIdUsuarios();
        user.setId(id + 1);
        
        controlPersis.crearUsuario(user);
    }

    private Rol traerRol(String rol) {
        List<Rol> listaRoles = controlPersis.traerRoles();
        
        for(Rol roles : listaRoles){
            if(roles.getNombreRol().equals(rol)){
                return roles;
            }
            
        }
        
        return null;
    }

    private int buscarUltimaIdUsuarios() {
        
        List<Usuario> listaUsuarios = this.traerUsuarios();
        
        Usuario usu = listaUsuarios.get(listaUsuarios.size()-1);
        return usu.getId();
        
    }

    public void borrarUsuario(int id_usuario) {
        controlPersis.borrarUsuario(id_usuario);
    }

    public Usuario traerUsuario(int id_usuario) {
        return controlPersis.traerUsuario(id_usuario);
    }

    public void editarUsuario(Usuario usu, String usuario, String contrasenia, String rol) {
        
        usu.setNombreUsuario(usuario);
        usu.setContrasenia(contrasenia);
        
        Rol rolEncontrado = this.traerRol(rol);
        
        if(rolEncontrado != null){
            usu.setUnRol(rolEncontrado);
        }
        
        controlPersis.editarUsuario(usu);
        
    }

    

    

    
    
}
