
package com.example.crudPrueba.services;

import com.example.crudPrueba.models.UsuarioModel;
import com.example.crudPrueba.repositories.IUsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    private IUsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioModel> traerUsuarios(){
        
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    
    public UsuarioModel crearUsuario(UsuarioModel usuario){
        
        return usuarioRepository.save(usuario);
    }
    
    public Optional<UsuarioModel> traerUsuarioPorId(Long id){
        
        return usuarioRepository.findById(id);
    }
    
    public UsuarioModel actualizarUsuario(UsuarioModel usuarioInsertado, Long id){
        //Traigo el usuario por su id
        UsuarioModel usuario = usuarioRepository.findById(id).get();
        
        usuario.setPrimerNombre(usuarioInsertado.getPrimerNombre());
        usuario.setSegundoNombre(usuarioInsertado.getSegundoNombre());
        usuario.setTelefono(usuarioInsertado.getTelefono());
        usuario.setCorreo(usuarioInsertado.getCorreo());
        
        return usuarioRepository.save(usuario);
    }
    
    public Boolean eliminarUsuario(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
        
    }
    
    
}
